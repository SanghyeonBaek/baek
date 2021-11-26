package com.ezen.tiles;

//무시하삼~~무시하삼~~

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.ParserAdapter;

class Item {
	public String Title = "";
	public String Link = "https://www.aladin.co.kr/shop/wproduct.aspx?";
}

class AladdinOpenAPIHandler extends DefaultHandler {
	public List<Item> Items;
	private Item currentItem;
	private boolean inItemElement = false;
	private String tempValue;

	public AladdinOpenAPIHandler() {
		Items = new ArrayList<Item>();
	}

	public void startElement(String namespace, String localName, String qName, Attributes atts) {
		if (localName.equals("item")) {
			currentItem = new Item();
			inItemElement = true;
		} else if (localName.equals("title")) {
			tempValue = "";
		} else if (localName.equals("link")) {
			tempValue = "";
		}
	}

	public void characters(char[] ch, int start, int length) throws SAXException {
		tempValue = tempValue + new String(ch, start, length);
	}

	public void endElement(String namespaceURI, String localName, String qName) {
		if (inItemElement) {
			if (localName.equals("item")) {
				Items.add(currentItem);
				currentItem = null;
				inItemElement = false;
			} else if (localName.equals("title")) {
				currentItem.Title = tempValue;
			} else if (localName.equals("link")) {
				currentItem.Link = tempValue;
			}
		}
	}

	public void parseXml(String xmlUrl) throws Exception {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser sp = spf.newSAXParser();
		ParserAdapter pa = new ParserAdapter(sp.getParser());
		pa.setContentHandler(this);
		pa.parse(xmlUrl);
	}
}

public class AladdinOpenAPI {
	private static final String BASE_URL = "http://www.aladdin.co.kr/ttb/api/ItemSearch.aspx?";

	public static String GetUrl(String searchWord) throws Exception {
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("ttbkey", "<ttbdahye14771316001>");
		hm.put("Query", URLEncoder.encode(searchWord, "UTF-8"));
		hm.put("QueryType", "Title");
		hm.put("MaxResults", "10");
		hm.put("start", "1");
		hm.put("SearchTarget", "Book");
		hm.put("output", "xml");

		StringBuffer sb = new StringBuffer();
		Iterator<String> iter = hm.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			String val = hm.get(key);
			sb.append(key).append("=").append(val).append("&");
		}

		return BASE_URL + sb.toString();
	}

	public static void main(String[] args) throws Exception {
		String url = GetUrl(args[0]);
		AladdinOpenAPIHandler api = new AladdinOpenAPIHandler();
		api.parseXml(url);
		for (Item item : api.Items) {
			System.out.println(item.Title + " : " + item.Link);
		}
	}
}
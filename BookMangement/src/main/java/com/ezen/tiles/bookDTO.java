package com.ezen.tiles;

public class bookDTO {
//  booknumber: ������ȣ
//  booktitle: ������
//  bookauthor: ����
//  bookcontent: ��������
//  bookpublisher: ���ǻ�
//  bookstock: �������
// bookcate: ī�װ�
// rentdate: ��������
// returndate: �ݳ�����
//  bookrentable: ���Ⱑ�ɱǼ�
//  bookrenting: ������

	int booknumber;
	String  booktitle,  bookauthor,  bookcontent,  bookpublisher;
	int bookstock;
	String bookcate,bookrentdate,bookreturndate;
	int bookrentable,bookrenting;
	public bookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bookDTO(int booknumber, String booktitle, String bookauthor, String bookcontent, String bookpublisher,
			int bookstock, String bookcate, String bookrentdate, String bookreturndate, int bookrentable,
			int bookrenting) {
		super();
		this.booknumber = booknumber;
		this.booktitle = booktitle;
		this.bookauthor = bookauthor;
		this.bookcontent = bookcontent;
		this.bookpublisher = bookpublisher;
		this.bookstock = bookstock;
		this.bookcate = bookcate;
		this.bookrentdate = bookrentdate;
		this.bookreturndate = bookreturndate;
		this.bookrentable = bookrentable;
		this.bookrenting = bookrenting;
		
	}
	public int getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public String getBookcontent() {
		return bookcontent;
	}
	public void setBookcontent(String bookcontent) {
		this.bookcontent = bookcontent;
	}
	public String getBookpublisher() {
		return bookpublisher;
	}
	public void setBookpublisher(String bookpublisher) {
		this.bookpublisher = bookpublisher;
	}
	public int getBookstock() {
		return bookstock;
	}
	public void setBookstock(int bookstock) {
		this.bookstock = bookstock;
	}
	public String getBookcate() {
		return bookcate;
	}
	public void setBookcate(String bookcate) {
		this.bookcate = bookcate;
	}
	public String getBookrentdate() {
		return bookrentdate;
	}
	public void setBookrentdate(String bookrentdate) {
		this.bookrentdate = bookrentdate;
	}
	public String getBookreturndate() {
		return bookreturndate;
	}
	public void setBookreturndate(String bookreturndate) {
		this.bookreturndate = bookreturndate;
	}
	public int getBookrentable() {
		return bookrentable;
	}
	public void setBookrentable(int bookrentable) {
		this.bookrentable = bookrentable;
	}
	public int getBookrenting() {
		return bookrenting;
	}
	public void setBookrenting(int bookrenting) {
		this.bookrenting = bookrenting;
	}
	
	
	
	
}

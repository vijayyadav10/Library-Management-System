package com.libo;

public class EntityBook {
	private String book_name;
	private String subject;
	private String author_name;
	private int page_number;
	private long price;

	public EntityBook(String book_name, String subject, String author_name, int page_number, long price) {
		super();
		this.book_name = book_name;
		this.subject = subject;
		this.author_name = author_name;
		this.page_number = page_number;
		this.price = price;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getPage_number() {
		return page_number;
	}

	public void setPage_number(int page_number) {
		this.page_number = page_number;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "EntityBook [book_name=" + book_name + ", subject=" + subject + ", author_name=" + author_name
				+ ", page_number=" + page_number + ", price=" + price + "]";
	}

}

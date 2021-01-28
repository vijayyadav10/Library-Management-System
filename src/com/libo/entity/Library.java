package com.libo.entity;
import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<EntityBook> bookshell = new ArrayList<EntityBook>();
	private List<EntityLoan> loan;
	
	public Library() {
		
		bookshell.add(new EntityBook("java","cs","tom",100,20));
	}
	
	public void addBook(EntityBook book) {
		if (this.bookshell == null) {
			this.bookshell = new ArrayList<EntityBook>();
		}
		this.bookshell.add(book);
	}

	public List<EntityBook> getBooks() {
		return bookshell;
	}

	@Override
	public String toString() {
		return "Library [bookshell=" + bookshell + "]";
	}

}

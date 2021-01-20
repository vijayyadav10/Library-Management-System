package com.libo;
import java.util.Scanner;

public class Admin {

	String Name;
	int id;

	public Admin(String name, int id) {
		this.Name = name;
		this.id = id;
	}

	EntityBook book;

	public void addBookToShell(Library lib) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Book Details: Name, Subject Name, Author Name, NoOfPage, BookPrice ");

		String book_name = sc.nextLine();
		String subject = sc.nextLine();
		String author_name = sc.nextLine();
		int page_number = sc.nextInt();
		long price = sc.nextLong();

		book = new EntityBook(book_name, subject, author_name, page_number, price);

		lib.addBook(book);
	}

	public void getAllBooks(Library lib) {
		System.out.println("Books In the Shell" + lib.getBooks());
	}

}

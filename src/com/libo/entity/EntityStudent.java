package com.libo.entity;
import java.util.List;
import java.util.Scanner;

public class EntityStudent {
	String name;
	int id;

	public EntityStudent(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Object SearchBookByName(LibraryImpl lib) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Book Name");

		String book_name = sc.nextLine();

		List<EntityBook> books = lib.getBooks();

		for (EntityBook book : books) {
			if (book_name.equals(book.getBook_name())) {
				return book;
			}
		}
		return "No Such Book Found";

	}

	public void SearchBookByAuthor() {
		System.out.println("Enter Author Name");
	}
}

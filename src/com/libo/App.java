package com.libo;

import java.util.Scanner;

import com.libo.entity.AdminImpl;
import com.libo.entity.EntityStudent;
import com.libo.entity.LibraryImpl;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String password = null;

		LibraryImpl library = new LibraryImpl();

		System.out.println("hello");

		System.out.println("Enter User Role");
		String user_name = sc.nextLine();

		int choice = sc.nextInt();

		while (choice > 0) {
			if ("admin".equals(user_name)) {
				AdminImpl admin = new AdminImpl("vijay", 1);
				switch (choice) {
				case 1:
					admin.addBookToShell(library);
					break;
				case 2:
					admin.getAllBooks(library);
					break;
				case 3:
					return;
				}
				System.out.println("1. Add Books To Shell \n2.Get List Of Books \n3.Quite");

				choice = sc.nextInt(); // add this

			} else if ("student".equals(user_name)) {
				EntityStudent student = new EntityStudent("vijay", 1);
				switch (choice) {
				case 1:
					System.out.println(student.SearchBookByName(library));
					break;
				case 2:
					System.out.println("no books");
					break;
				case 3:
					return;
				}
				System.out.println("1. Search Book By Name \n2.Get List Of Books \n3.Quite");

				choice = sc.nextInt();

			}

		}

	}

}

//		Create a library management system with following use cases 
//
//		1) As a librarian, you should be able to add a new book, with following details Book Name, Book Subject (like Database, QA, Computer Network),  Author Name, Page Number and Price 
//		2) As a librarian you should be able to see all the books in the library 
//		3) As a student, you should be able to search a book by Title or Author 
//		4) As a student you should be able to loan a book and return it 
//		3) As a librarian you should be able to see all the books loaned out to students
//
//
//		Guideline
//
//		1. The online system should have login for Student and librarian  
//		2. The online system doesn't need to have a UI, but it should be a continuum.
//		3. This application shouldn't use any database or frameworks.
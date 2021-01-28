package com.libo.entity.interfaces;

import com.libo.entity.LibraryImpl;

public interface Admin {
	void addBookToShell(LibraryImpl library);
	void getAllBooks(LibraryImpl library);
}

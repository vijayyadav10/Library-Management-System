package com.libo.entity.interfaces;

import java.util.List;

import com.libo.entity.EntityBook;

public interface Library {
	void addBook(EntityBook book);
	List<EntityBook> getBooks();
}

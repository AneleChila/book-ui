package com.payu.bookui.service;


import java.util.List;

public interface BookService {
	
	void save(Book book);
	Book get(int id);
	void delete(int id);
	List<Book> get();
}

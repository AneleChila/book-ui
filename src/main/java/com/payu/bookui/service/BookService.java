package com.payu.bookui.service;


import java.util.List;

public interface BookService {
	
	void save(Book book);
	Book get(Long id);
	void delete(Long id);
	List<Book> get();
}

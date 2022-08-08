package com.payu.bookui.service;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class BookServiceImpl implements BookService {

	private List<Book> books = new ArrayList<>();
	private Long id = 0L;
	
	@Override
	public void save(Book book) {
		book.setId(id);
		books.add(book);
		id++;
	}

	@Override
	public Book get(int id) {
		return books.get(id);
	}

	@Override
	public void delete(int id) {
		books.remove(id);
	}

	@Override
	public List<Book> get() {
		return books;
	}
}

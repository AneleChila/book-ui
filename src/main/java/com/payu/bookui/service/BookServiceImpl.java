package com.payu.bookui.service;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class BookServiceImpl implements BookService {

	private final List<Book> books = List.of(
			new Book(1L, "A1", new BigInteger("1"), new Date().toString(), new BigDecimal("90.3"), "EBook"),
			new Book(2L, "A2", new BigInteger("1"), new Date().toString(), new BigDecimal("90.3"), "EBook"),
			new Book(3L, "A3", new BigInteger("1"), new Date().toString(), new BigDecimal("90.3"), "EBook"),
			new Book(4L, "A4", new BigInteger("1"), new Date().toString(), new BigDecimal("90.3"), "EBook")
	);
	
	@Override
	public void save(Book book) {
		books.add(book);
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

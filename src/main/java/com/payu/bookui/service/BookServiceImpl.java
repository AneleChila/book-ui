package com.payu.bookui.service;

import com.payu.bookui.external.response.GetBookResponse;
import com.payu.bookui.external.response.GetBooksResponse;
import com.payu.bookui.external.rest.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookServiceImpl implements BookService {
	
	@Override
	public void save(Book book) {
		if (book.getId() != null) {
			book.setIsbnNumber(null);
			RestClient.updateBook(book, book.getId());
			return;
		}
		RestClient.createBook(book);
	}

	@Override
	public Book get(Long id) {
		GetBookResponse response = RestClient.getBook(id)
				.getBooksList().get(0);

		if (response == null) {
			return new Book();
		}
		return createBookModel(response);
	}

	private Book createBookModel(GetBookResponse response) {
		Book book = new Book();
		book.setId(response.getId());
		book.setIsbnNumber(response.getIsbnNumber());
		book.setName(response.getName());
		book.setPublishDate(new SimpleDateFormat("dd/MM/yyyy").format(response.getPublishDate()));
		book.setType(response.getType());
		book.setPrice(response.getPrice());
		return book;
	}

	@Override
	public void delete(Long id) {
		RestClient.deleteBook(id);
	}

	@Override
	public List<Book> get() {
		return RestClient.getAllBooks().getBooksList()
				.stream()
				.map(this::createBookModel)
				.collect(Collectors.toList());
	}
}

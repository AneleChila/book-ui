package com.payu.bookui.external.rest;

import com.payu.bookui.external.response.BookResponse;
import com.payu.bookui.external.response.GetBooksResponse;
import com.payu.bookui.service.Book;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class RestClient {

    private static final String REST_URI;
    private static final RestTemplate restTemplate;

    public static void createBook(Book book) {
        HttpEntity<Book> request = new HttpEntity<>(book);
        restTemplate.postForObject(REST_URI, request, Book.class);
    }

    public static GetBooksResponse getBook(Long id) {
        return restTemplate.getForObject(REST_URI + "/"+ id, GetBooksResponse.class);
    }

    public static GetBooksResponse getAllBooks() {
        return restTemplate.getForObject(REST_URI, GetBooksResponse.class);
    }

    public static void updateBook(Book book, Long id) {
        HttpEntity<Book> request = new HttpEntity<>(book);
        restTemplate.put(REST_URI + "/" + id, request, Book.class);
    }

    public static void deleteBook(Long id) {
        restTemplate.delete(REST_URI + "/"+ id, BookResponse.class);
    }

    static {
        REST_URI = "http://localhost:8080/api/v1/books";
        restTemplate = new RestTemplate();
    }
}

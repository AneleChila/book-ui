package com.payu.bookui.external.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anele Chila
 */
@Getter
@Setter
@AllArgsConstructor
public class GetBooksResponse extends BookResponse {

    private List<GetBookResponse> booksList =  new ArrayList<>();
    private long totalBooks;
    private long totalPages;
}

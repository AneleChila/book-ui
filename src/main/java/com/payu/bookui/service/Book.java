package com.payu.bookui.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Anele Chila
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	private Long id;
	private String name;
	private BigInteger isbnNumber;
	private String publishDate;
	private BigDecimal price;
	private String type;
}

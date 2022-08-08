package com.payu.bookui.external.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author Anele Chila
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookResponse extends BookResponse {

    private Long id;
    private String name;
    private BigInteger isbnNumber;
    private Date publishDate;
    private BigDecimal price;
    private String type;
}

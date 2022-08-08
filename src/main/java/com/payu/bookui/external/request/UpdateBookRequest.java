package com.payu.bookui.external.request;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author Anele Chila
 */
@Getter
@Setter
public class UpdateBookRequest {

    private String name;

    private BigInteger isbnNumber;

    private Date publishDate;

    private BigDecimal price;
    private String type;
}

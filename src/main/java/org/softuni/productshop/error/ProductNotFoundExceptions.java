package org.softuni.productshop.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Product not found!")
public class ProductNotFoundExceptions extends RuntimeException {

    public ProductNotFoundExceptions() {
    }

    public ProductNotFoundExceptions(String message) {
        super(message);
    }
}
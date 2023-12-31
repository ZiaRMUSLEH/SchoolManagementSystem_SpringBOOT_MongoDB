package com.tpe.service;

import com.tpe.domain.Book;
import com.tpe.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public void saveBook (Book book) {
        bookRepository.save(book);
    }
}

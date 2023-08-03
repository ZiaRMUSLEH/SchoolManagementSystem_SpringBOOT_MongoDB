package com.tpe.controller;

import com.tpe.domain.Book;
import com.tpe.domain.Student;
import com.tpe.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<Map<String,String >> saveBook(@Valid @RequestBody Book book){

        bookService.saveBook(book);
        Map<String,String > map = new HashMap<>();
        map.put("message","Book has been saved successfully");
        map.put("status","true");

        return new ResponseEntity<>(map, HttpStatus.CREATED);

    }

}

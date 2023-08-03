package com.tpe.controller;

import com.tpe.domain.Student;
import com.tpe.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping
    public ResponseEntity<Map<String,String >> saveStudent(@Valid @RequestBody Student student){

        studentService.saveStudent(student);
        Map<String,String > map = new HashMap<>();
        map.put("message","Student has been saved successfully");
        map.put("status","true");

        return new ResponseEntity<>(map, HttpStatus.CREATED);

    }






}

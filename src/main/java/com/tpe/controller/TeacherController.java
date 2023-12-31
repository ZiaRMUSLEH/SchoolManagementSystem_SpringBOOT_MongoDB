package com.tpe.controller;


import com.tpe.domain.Student;
import com.tpe.domain.Teacher;
import com.tpe.service.TeacherService;
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
@RequestMapping("teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public ResponseEntity<Map<String,String >> saveTeacher(@Valid @RequestBody Teacher teacher){

        teacherService.saveTeacher(teacher);
        Map<String,String > map = new HashMap<>();
        map.put("message","Teacher has been saved successfully");
        map.put("status","true");

        return new ResponseEntity<>(map, HttpStatus.CREATED);

    }
}

package com.tpe.service;

import com.tpe.domain.Student;
import com.tpe.exception.ConflictException;
import com.tpe.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    private StudentRepository studentRepository;
    public StudentService (StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent (Student student) {
        Student existStudent = studentRepository.findByEmail(student.getEmail());
        if(existStudent!=null){
            throw  new ConflictException("Student with this email is already exists ....");
        }
       studentRepository.save(student);
    }
}

package com.tpe.repository;

import com.tpe.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher, String> {
    Teacher findByEmail(String email);
}

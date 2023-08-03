package com.tpe.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "teachers")
public class Teacher {

    @Id
    private String id;

    @NotNull(message = "Name can not be null..")
    @NotBlank(message = "Name can not be white space ")//2
    @Size(min = 4,max= 25,message = "name  '${validatedValue}' must be between : {min} and {max} ")
    private String name;


    @Field(name = "last_name")
    private String lastName;

    @Email(message = "Please provide a valid email")//@.com
    private String email;

    private String phoneNumber;

    @CreatedDate
    private Date registerDate = new Date();

    private List<Book>  books= new ArrayList<>();



}
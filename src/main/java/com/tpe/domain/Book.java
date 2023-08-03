package com.tpe.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "books")
public class Book {


    @Id
    private String id;

    @NotNull(message = "Title  can not be null..")
    @NotBlank(message = "Title  can not be white space ")//2
    @Size(min = 4,max= 25,message = "Title  '${validatedValue}' must be between : {min} and {max} ")
    private String title;


    private String author;


    private String publicationDate;


    private List<Teacher> teachers= new ArrayList<>();



}

package com.tpe.domain;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "students")
public class Student {
    @Id//it is used to specify the primary identifier//
    private String id;

    @NotNull(message = "First name cannot be null.")
    @NotBlank(message = "First name cannot be whitSpace ")
    @Size(min = 4,max = 25,message = "First name '${validatedValue}' must be between {min} and {max} ")
    private String name;

    @Field(name = "last_ame")
    private String lastName;

    @Email(message = "Please provide a valid email ...")
    private String email;

    private String phoneNumber;
    @CreatedDate
    private Date registerDate= new Date();
    @Transient
    private String address;
}
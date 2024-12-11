package com.example.day39exer.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Enter the name")
    @Column(columnDefinition = "varchar(20) not null")
    private String name;
    @NotNull(message = "Please enter the age")
    @Positive
    @Column(columnDefinition = "int not null")
    private Integer age;
    @NotEmpty(message = "Enter the email")
    @Email
    @Column(columnDefinition = "varchar(30) not null unique")
    private String email;
    @NotNull(message = "Please enter the salary")
    @Positive
    @Column(columnDefinition = "int not null")
    private Integer salary;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;

}

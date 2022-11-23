package com.peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
import static javax.persistence.CascadeType.DETACH;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(length = 100000, name = "first_name")
    private  String firstName;
    @Column(length = 100000, name = "last_name")
    private  String lastName;
    @Column(length = 100000, name = "phoneNumber_name")
    private  String phoneNumber;
    @Column(length = 100000, name = "email_name")
    private  String email;
    @Column(length = 100000, name = "studyFormat_name")
    private  String studyFormat;
    public Student(String firstName, String lastName, String phoneNumber, String email, String studyFormat) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.studyFormat = studyFormat;
    }
    @ManyToOne(cascade ={ALL} , fetch = FetchType.EAGER)
    private Group group;
}

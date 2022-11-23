package com.peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "instructors")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(length = 100000, name = "first_name")
    private  String firstName;
    @Column(length = 100000, name = "last_name")
    private  String lastName;
    @Column(length = 100000, name = "phone_number")
    private  String phoneNumber;
    @Column(length = 100000, name = "email")
    private  String email;
    @Column(length = 100000, name = "specialization")
    private  String specialization;
    public Instructor(String firstName, String lastName, String phoneNumber, String email, String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.specialization = specialization;
    }
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST},fetch = FetchType.EAGER)
    private Course courses;


}













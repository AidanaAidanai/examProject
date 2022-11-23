package com.peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String groupName;
    private  String dateOfStart;
    private  String image;
    public Group(String groupName, String dateOfStart, String image) {
        this.groupName = groupName;
        this.dateOfStart = dateOfStart;
        this.image = image;
    }
    @ManyToMany(cascade = {MERGE, PERSIST, DETACH, REFRESH},fetch = FetchType.LAZY)
    private List<Course> courses;
    public void addCourse(Course course){
        if(courses == null){
            courses = new ArrayList<>();
        }courses.add(course);
    }

    @OneToMany(cascade = {ALL}, fetch = FetchType.LAZY, mappedBy = "groups")
    private List<Student>students;
    public void addStudents(Student student){
        if(students == null){
            students = new ArrayList<>();
        }students.add(student);
    }

    @ManyToOne(cascade = {DETACH,PERSIST,REFRESH,MERGE},fetch = FetchType.EAGER)
    private Company company;
}

package com.peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String courseName;
    private  String duration;
    private  String description;

    public Course(String courseName, String duration, String description, Company company, List<Group> groups) {
        this.courseName = courseName;
        this.duration = duration;
        this.description = description;
        this.company = company;
        this.groups = groups;
    }
    @ManyToOne(cascade = {MERGE, PERSIST, DETACH, REFRESH}, fetch = FetchType.EAGER)
    private Company company;
    @ManyToMany(cascade = {MERGE, PERSIST, DETACH, REFRESH},fetch = FetchType.LAZY,mappedBy = "courses")
    private List<Group> groups;
    public void addGroup(Group group){
        if(groups == null){
            groups = new ArrayList<>();
        } groups.add(group);
    }

    @OneToMany(cascade = {MERGE,DETACH,REFRESH,REMOVE},fetch = FetchType.LAZY,mappedBy = "course")
    private List<Instructor> instructors;
    public void addInstructor(Instructor instructor){
        if(instructors == null){
            instructors = new ArrayList<>();
        }instructors.add(instructor);
    }

    @OneToMany(cascade = {MERGE,REFRESH,REMOVE,DETACH},fetch = FetchType.LAZY,mappedBy = "course")
    private List<Lesson>lessons;
    public void addLesson(Lesson lesson){
        if(lessons == null){
            lessons  = new ArrayList<>();
        }lessons.add(lesson);
    }
}




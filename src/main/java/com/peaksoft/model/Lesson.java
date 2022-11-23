package com.peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String lessonName;

    public Lesson(String lessonName, Course course) {
        this.lessonName = lessonName;
        this.course = course;
    }
    @ManyToOne(cascade = {DETACH, MERGE, PERSIST, REFRESH},fetch = FetchType.EAGER)
    private Course course;
    @OneToMany(cascade = {ALL},fetch = FetchType.LAZY,mappedBy = "lesson")
    private List<Task> tasks;
    public void addTask(Task task){
        if(tasks == null){
            tasks = new ArrayList<>();
        }tasks.add(task);
    }

}

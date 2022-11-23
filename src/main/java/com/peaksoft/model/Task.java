package com.peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(length = 100000, name = "task_name")
    private  String taskName;
    @Column(length = 100000, name = "task_text")
    private  String taskText;
    @Column(name = "dead_line")
    private  String deadline;
    public Task(String taskName, String taskText, String deadline) {
        this.taskName = taskName;
        this.taskText = taskText;
        this.deadline = deadline;
    }

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.EAGER)
    private Lesson lesson;

}

package com.peaksoft.repository;

import com.peaksoft.model.Instructor;
import com.peaksoft.model.Lesson;

import java.util.List;

public interface LessonRepository {
    void addLesson(Long id,Lesson lesson);
    void updateLesson(Long id,Lesson lesson);
    List<Lesson> getAllLesson();
    Lesson getByIdLesson(Long id);
    void deletByIdLesson(Long id);


}

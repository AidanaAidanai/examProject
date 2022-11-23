package com.peaksoft.service;

import com.peaksoft.model.Lesson;

import java.util.List;

public interface LessonService {
    void saveLesson(Lesson lesson);
    void updateLesson(Lesson lesson);
    List<Lesson> getAllLesson();
    Lesson getByIdLesson(Long id);
    void deletByIdLesson(Long id);
}

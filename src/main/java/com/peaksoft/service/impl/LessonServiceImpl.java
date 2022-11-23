package com.peaksoft.service.impl;

import com.peaksoft.model.Lesson;
import com.peaksoft.repository.LessonRepository;
import com.peaksoft.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LessonServiceImpl implements LessonService {
    private  final LessonRepository lessonRepository;
@Autowired
    public LessonServiceImpl(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public void saveLesson(Lesson lesson) {
lessonRepository.saveLesson(lesson);
    }

    @Override
    public void updateLesson(Lesson lesson) {
lessonRepository.updateLesson(lesson);
    }

    @Override
    public List<Lesson> getAllLesson() {
        return lessonRepository.getAllLesson();
    }

    @Override
    public Lesson getByIdLesson(Long id) {
        return lessonRepository.getByIdLesson(id);
    }

    @Override
    public void deletByIdLesson(Long id) {
lessonRepository.deletByIdLesson(id);
    }
}

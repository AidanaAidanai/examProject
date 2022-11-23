package com.peaksoft.service;

import com.peaksoft.model.Course;

import java.util.List;

public interface CourseService {
    void saveCourse(Course course);
    void updateCourse(Course course);
    List<Course> getAllCourse();
    Course getById(Long id);
    void deleteByIdCourse(Long id);
}

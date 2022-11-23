package com.peaksoft.repository;

import com.peaksoft.model.Course;

import java.util.List;

public interface CourseRepository {
    void addCourse(Long id, Course course);
    void updateCourse(Long id,Course course);
    List<Course> getAllCourse(Long id);
    Course getById(Long id);
    void deleteByIdCourse(Long id);

}

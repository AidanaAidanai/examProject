package com.peaksoft.repository;

import com.peaksoft.model.Lesson;
import com.peaksoft.model.Student;

import java.util.List;

public interface StudentRepository {
    void addStudent(Long id,Student student);
    void updateStudent(Long id,Student student);
    List<Student> getAllStudent();
    Student getByIdStudent(Long id);
    void deleteByIdStudent(Long id);
}


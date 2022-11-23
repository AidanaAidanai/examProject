package com.peaksoft.service;

import com.peaksoft.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student student);
    void updateStudent(Student student);
    List<Student> getAllStudent();
    Student getByIdStudent(Long id);
    void deleteByIdStudent(Long id);
}

package com.peaksoft.service.impl;

import com.peaksoft.model.Student;
import com.peaksoft.repository.StudentRepository;
import com.peaksoft.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
@Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void saveStudent(Student student) {
studentRepository.saveStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
studentRepository.updateStudent(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.getAllStudent();
    }

    @Override
    public Student getByIdStudent(Long id) {
        return studentRepository.getByIdStudent(id);
    }

    @Override
    public void deleteByIdStudent(Long id) {
studentRepository.deleteByIdStudent(id);
    }
}

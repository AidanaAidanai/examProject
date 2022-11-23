package com.peaksoft.service.impl;

import com.peaksoft.model.Instructor;
import com.peaksoft.repository.InstructorRepository;
import com.peaksoft.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InstructorServiceImpl implements InstructorService {
    private  final InstructorRepository instructorRepository;
@Autowired
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public void saveInstructor(Instructor instructor) {
instructorRepository.saveInstructor(instructor);
    }

    @Override
    public void updateInstructor(Instructor instructor) {
instructorRepository.updateInstructor(instructor);
    }

    @Override
    public List<Instructor> getAllInstructor() {
        return instructorRepository.getAllInstructor();
    }

    @Override
    public Instructor getByIdInstructor(Long id) {
        return instructorRepository.getByIdInstructor(id);
    }

    @Override
    public void deleteByIdInstructor(Long id) {
instructorRepository.deleteByIdInstructor(id);
    }
}

package com.peaksoft.service;

import com.peaksoft.model.Instructor;

import java.util.List;

public interface InstructorService {
    void saveInstructor(Instructor instructor);
    void updateInstructor(Instructor instructor);
    List<Instructor> getAllInstructor();
    Instructor getByIdInstructor(Long id);
    void deleteByIdInstructor(Long id);

}

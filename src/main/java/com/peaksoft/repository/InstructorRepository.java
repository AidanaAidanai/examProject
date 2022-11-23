package com.peaksoft.repository;

import com.peaksoft.model.Group;
import com.peaksoft.model.Instructor;

import java.util.List;

public interface InstructorRepository {
    void addInstructor(Long id,Instructor instructor);
    void updateInstructor(Long id,Instructor instructor);
    List<Instructor> getAllInstructor();
    Instructor getByIdInstructor(Long id);
    void deleteByIdInstructor(Long id);
    void assignInstructor(Long courseId, Long instructorId);
}

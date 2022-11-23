package com.peaksoft.repository.impl;

import com.peaksoft.model.Instructor;
import com.peaksoft.repository.InstructorRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class InstructorImpl implements InstructorRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void saveInstructor(Instructor instructor) {
        entityManager.persist(instructor);
        System.out.println("the instructor successfully ssaved"+instructor);
    }

    @Override
    public void updateInstructor(Instructor instructor) {
        entityManager.merge(instructor);
        System.out.println("the instructor successfully updated"+instructor);
    }

    @Override
    public List<Instructor> getAllInstructor() {
        return entityManager.createQuery("select i from Instructor i", Instructor.class).getResultList();
    }

    @Override
    public Instructor getByIdInstructor(Long id) {
        return entityManager.find(Instructor.class, id);
    }

    @Override
    public void deleteByIdInstructor(Long id) {
        entityManager.remove(entityManager.find(Instructor.class, id));
    }
}

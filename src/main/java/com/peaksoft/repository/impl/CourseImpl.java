package com.peaksoft.repository.impl;

import com.peaksoft.model.Company;
import com.peaksoft.model.Course;
import com.peaksoft.model.Group;
import com.peaksoft.repository.CourseRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CourseImpl  implements CourseRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public void addCourse(Long id, Course course) {
        Company company=entityManager.find(Company.class,id);
        company.addCourse(course);
        course.setCompany(company);
        entityManager.merge(course);
    }

    @Override
    public void updateCourse(Long id,Course course) {
     entityManager.merge(course);
    }

    @Override
    public List<Course> getAllCourse(Long id) {
        return entityManager.createQuery("select g from Course g  where g.company.id = :id", Course.class).setParameter("id",id).getResultList();
    }

    @Override
    public Course getById(Long id) {
        return  entityManager.find(Course.class, id);
    };


    @Override
    public void deleteByIdCourse(Long id) {
        entityManager.remove(entityManager.find(Course.class, id));
    }
    }


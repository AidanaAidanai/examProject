package com.peaksoft.repository.impl;

import com.peaksoft.model.Lesson;
import com.peaksoft.repository.LessonRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class LessonImpl implements LessonRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void saveLesson(Lesson lesson) {
        entityManager.persist(lesson);
        System.out.println("Lesson saved"+lesson);
    }

    @Override
    public void updateLesson(Lesson lesson) {
        entityManager.merge(lesson);
        System.out.println("the lesson updated"+lesson);
    }

    @Override
    public List<Lesson> getAllLesson() {
        return entityManager.createQuery("select l from Lesson l",Lesson.class).getResultList();
    }

    @Override
    public Lesson getByIdLesson(Long id) {
        return entityManager.find(Lesson.class,id);
    }

    @Override
    public void deletByIdLesson(Long id) {
        entityManager.remove(entityManager.find(Lesson.class, id));

    }
}

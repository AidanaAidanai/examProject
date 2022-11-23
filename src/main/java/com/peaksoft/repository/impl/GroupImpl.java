package com.peaksoft.repository.impl;

import com.peaksoft.model.Company;
import com.peaksoft.model.Group;
import com.peaksoft.repository.GroupRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class GroupImpl implements GroupRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void saveGroup(Group group) {
        entityManager.persist(group);
        System.out.println("the company successfully saved"+group);
    }

    @Override
    public void updateGroup(Group group) {
        entityManager.merge(group);
        System.out.println("the company successfully updated"+group);

    }

    @Override
    public List<Group> getAllGroup() {
        return entityManager.createQuery("select g from Group g", Group.class).getResultList();
    }

    @Override
    public Group getByIdGroup(Long id) {
        return entityManager.find(Group.class, id);
    }

    @Override
    public void deleteByIdGroup(Long id) {
        entityManager.remove(entityManager.find(Group.class, id));
    }
}

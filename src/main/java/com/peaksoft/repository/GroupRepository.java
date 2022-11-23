package com.peaksoft.repository;

import com.peaksoft.model.Course;
import com.peaksoft.model.Group;

import java.util.List;

public interface GroupRepository {
    void addGroup(Long id,Group group);
    void updateGroup(Long id,Group group);
    List<Group> getAllGroup();
    Group getByIdGroup(Long id);
    void deleteByIdGroup(Long id);
}

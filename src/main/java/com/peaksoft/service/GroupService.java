package com.peaksoft.service;

import com.peaksoft.model.Group;

import java.util.List;

public interface GroupService {
    void saveGroup(Group group);
    void updateGroup(Group group);
    List<Group> getAllGroup();
    Group getByIdGroup(Long id);
    void deleteByIdGroup(Long id);
}

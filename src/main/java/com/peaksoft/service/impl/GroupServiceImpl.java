package com.peaksoft.service.impl;

import com.peaksoft.model.Group;
import com.peaksoft.repository.GroupRepository;
import com.peaksoft.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupServiceImpl implements GroupService {
    private  final GroupRepository groupRepository;
@Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public void saveGroup(Group group) {
    groupRepository.saveGroup(group);

    }

    @Override
    public void updateGroup(Group group) {
groupRepository.updateGroup(group);
    }

    @Override
    public List<Group> getAllGroup() {
        return groupRepository.getAllGroup();
    }

    @Override
    public Group getByIdGroup(Long id) {
        return groupRepository.getByIdGroup(id);
    }

    @Override
    public void deleteByIdGroup(Long id) {
groupRepository.deleteByIdGroup(id);
    }
}

package com.peaksoft.service.impl;

import com.peaksoft.model.Task;
import com.peaksoft.repository.TaskRepository;
import com.peaksoft.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
  private final TaskRepository taskRepository;
@Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public void saveTask(Task task) {
taskRepository.saveTask(task);
    }

    @Override
    public void updateTask(Task task) {
taskRepository.updateTask(task);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepository.getAllTask();
    }

    @Override
    public Task getByIdTask(Long id) {
        return taskRepository.getByIdTask(id);
    }

    @Override
    public void deleteByIdTask(Long id) {
taskRepository.deleteByIdTask(id);
    }
}



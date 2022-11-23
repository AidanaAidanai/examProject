package com.peaksoft.service;

import com.peaksoft.model.Student;
import com.peaksoft.model.Task;

import java.util.List;

public interface TaskService {
    void saveTask(Task task);
    void updateTask(Task task);
    List<Task> getAllTask();
    Task getByIdTask(Long id);
    void deleteByIdTask(Long id);


}

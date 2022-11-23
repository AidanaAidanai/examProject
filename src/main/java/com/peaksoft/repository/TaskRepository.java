package com.peaksoft.repository;

import com.peaksoft.model.Student;
import com.peaksoft.model.Task;

import java.util.List;

public interface TaskRepository {
    void addTask(Long id,Task task);
    void updateTask(Long id,Task task);
    List<Task> getAllTask();
    Task getByIdTask(Long id);
    void deleteByIdTask(Long id);
    void assignStudent(Long groupId, Long studentId);
}

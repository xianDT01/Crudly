package com.Crudly.Crudly.service;

import com.Crudly.Crudly.Repository.TaskRepository;
import com.Crudly.Crudly.model.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return  taskRepository.findById(id);
    }

    @Override
    public void deleteTas(Long id) {
    taskRepository.deleteById(id);
    }
}

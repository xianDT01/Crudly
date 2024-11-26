package com.Crudly.Crudly.controller;

import com.Crudly.Crudly.model.Task;
import com.Crudly.Crudly.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTask();
    }

}

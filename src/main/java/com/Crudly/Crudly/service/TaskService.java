package com.Crudly.Crudly.service;

import com.Crudly.Crudly.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface TaskService {
    Task saveTask(Task task);
    List <Task> getAllTask();
    Optional<Task> getTaskById(Long id);
    void deleteTas(Long id);

}

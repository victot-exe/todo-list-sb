package com.victot.todoList.controllers;

import com.victot.todoList.model.Task;
import com.victot.todoList.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @PostMapping()
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping
    public Iterable<Task> getTasks(){
        return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable Long id){
        return taskRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable Long id){
        taskRepository.deleteById(id);
    }

}

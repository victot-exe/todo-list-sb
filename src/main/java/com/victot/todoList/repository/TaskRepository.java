package com.victot.todoList.repository;

import com.victot.todoList.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}

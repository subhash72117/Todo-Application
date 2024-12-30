package com.Todo_Aplication.Todo.aplication.repository;

import com.Todo_Aplication.Todo.aplication.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

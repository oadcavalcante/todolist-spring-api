package com.oadcavalcante.todolist.todolist_api.repository;

import com.oadcavalcante.todolist.todolist_api.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}

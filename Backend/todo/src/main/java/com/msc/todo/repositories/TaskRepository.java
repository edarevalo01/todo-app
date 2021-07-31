package com.msc.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msc.todo.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}

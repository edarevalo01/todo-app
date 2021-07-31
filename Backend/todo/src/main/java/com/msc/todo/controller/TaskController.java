package com.msc.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.msc.todo.entities.Task;
import com.msc.todo.repositories.TaskRepository;

@RestController
@RequestMapping("/task")
@CrossOrigin
public class TaskController {

	@Autowired // Inyeccion de dependencias
	private TaskRepository taskRepositoryDAO;
	
	@RequestMapping(path="/get-all", method = RequestMethod.GET)
	public @ResponseBody List<Task> getAllTask() {
		return taskRepositoryDAO.findAll();
	}
}








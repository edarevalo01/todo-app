package com.msc.todo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(path="/save", method = RequestMethod.POST)
	public @ResponseBody String saveTask(@RequestBody Task task) {
		taskRepositoryDAO.save(task);
		return "Task saved";
	}
	
	@RequestMapping(path="/getbyid", method = RequestMethod.GET)
	public @ResponseBody Optional<Task> getById(@RequestParam long id) {
		return taskRepositoryDAO.findById(id);
	}
	
	@RequestMapping(path="/update", method = RequestMethod.PUT)
	public @ResponseBody Optional<Task> update(@RequestBody Task task) {
		Optional<Task> optTask = taskRepositoryDAO.findById(task.getId());
		taskRepositoryDAO.save(task);
		return optTask;
	}
	
	@RequestMapping(path="/delete", method = RequestMethod.DELETE)
	public @ResponseBody String delete(@RequestParam long id) {
		taskRepositoryDAO.deleteById(id);
		return "Task deleted";
	}
	
	@RequestMapping(path="/getByName", method = RequestMethod.GET)
	public @ResponseBody List<Task> getByName(@RequestParam String name) {
		return taskRepositoryDAO.findByName(name);
	}
}


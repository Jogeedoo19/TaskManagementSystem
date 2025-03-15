package mu.maccs.training.TaskManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mu.maccs.training.TaskManagementSystem.model.Task;
import mu.maccs.training.TaskManagementSystem.repositories.TaskRepository;

@RestController
public class TaskController {

	@Autowired
	private TaskRepository taskRepository;
	
	@GetMapping("/api/listAllTasks")
	public List<Task> getAllTasks(){
		return taskRepository.findAll();
	}
	
	@PostMapping("/api/createTasks")
	public Task createTask(@RequestBody Task task) {
		return taskRepository.save(task);
	}
}

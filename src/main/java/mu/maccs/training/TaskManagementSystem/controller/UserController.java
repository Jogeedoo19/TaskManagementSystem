package mu.maccs.training.TaskManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import mu.maccs.training.TaskManagementSystem.model.User;
import mu.maccs.training.TaskManagementSystem.repositories.UserRepository;

@RestController
public class UserController {

	private UserRepository userRepository;
	
	 // Constructor Injection
    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
	@GetMapping("/api/listAllUsers")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/api/createUsers")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

}

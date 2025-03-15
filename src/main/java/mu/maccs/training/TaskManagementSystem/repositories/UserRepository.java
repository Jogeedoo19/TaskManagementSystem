package mu.maccs.training.TaskManagementSystem.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import mu.maccs.training.TaskManagementSystem.model.User;

//Behaviour
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByUsername(String username);
	
}

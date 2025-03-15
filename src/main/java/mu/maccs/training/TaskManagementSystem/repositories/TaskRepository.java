package mu.maccs.training.TaskManagementSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mu.maccs.training.TaskManagementSystem.model.Task;

//Behaviour
public interface TaskRepository extends JpaRepository<Task, Long> {
	List<Task> findByUserId(Long userId);
}

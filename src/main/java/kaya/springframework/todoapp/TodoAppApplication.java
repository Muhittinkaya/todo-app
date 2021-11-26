package kaya.springframework.todoapp;

import kaya.springframework.todoapp.entity.Todo;
import kaya.springframework.todoapp.entity.User;
import kaya.springframework.todoapp.repository.TodoRepository;
import kaya.springframework.todoapp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication implements CommandLineRunner {

	private final UserRepository userRepository;
	private final TodoRepository todoRepository;

	public TodoAppApplication(UserRepository userRepository, TodoRepository todoRepository){
		this.userRepository = userRepository;
		this.todoRepository = todoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("Muhittin");
		user.setPassword("123456");

		Todo todo = new Todo();
		todo.setContent("Finish Spring App");

		user.getTodoList().add(todo);

		userRepository.save(user);
	}
}

package kaya.springframework.todoapp.repository;

import kaya.springframework.todoapp.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}

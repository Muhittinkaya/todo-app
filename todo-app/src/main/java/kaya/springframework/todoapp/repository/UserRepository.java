package kaya.springframework.todoapp.repository;

import kaya.springframework.todoapp.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

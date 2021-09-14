package co.com.sofka.kataCrudBackend.repository;

import co.com.sofka.kataCrudBackend.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}

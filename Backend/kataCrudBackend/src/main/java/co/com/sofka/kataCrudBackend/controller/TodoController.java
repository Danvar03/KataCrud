package co.com.sofka.kataCrudBackend.controller;

import co.com.sofka.kataCrudBackend.entity.Todo;
import co.com.sofka.kataCrudBackend.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //Anotaciones
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping(value = "api/todos")
    public Iterable<Todo> list() {
        return service.list();
    }

    public Todo save(Todo todo) {
        return service.save(todo);
    }

    public void delete(Long id) {
        service.delete(id);
    }
    @GetMapping(value = "api/{id}/todos")
    public Todo get(@PathVariable Long id) {
        return service.get(id);
    }


}

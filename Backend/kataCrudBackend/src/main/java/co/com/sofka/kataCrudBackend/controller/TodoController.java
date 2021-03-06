package co.com.sofka.kataCrudBackend.controller;

import co.com.sofka.kataCrudBackend.entity.Todo;
import co.com.sofka.kataCrudBackend.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //Anotaciones
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping(value = "api/todos")
    public Iterable<Todo> list() {
        return service.list();
    }

    @PostMapping(value = "api/todos")
    public Todo save(@RequestBody Todo todo) {
        return service.save(todo);
    }

    @PutMapping(value = "api/todos")
    public Todo update(@RequestBody Todo todo) {
        if (todo.getId() != null){
            return service.save(todo);
    }
    throw new RuntimeException("No existe el id para actualizar");


}
    @DeleteMapping(value = "api/{id}/todos")
    public void delete(@PathVariable("id")Long id) {
        service.delete(id);
    }
    @GetMapping(value = "api/{id}/todos")
    public Todo get(@PathVariable("id") Long id) {
        return service.get(id);
    }
}

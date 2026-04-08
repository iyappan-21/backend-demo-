package controller;

import models.Todo;
import service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Todo")
public class TodoController {
    @Autowired

    public TodoService todoService;

    // CREATE
    @PostMapping("/put")
    public Todo create(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    // READ ALL
    @GetMapping("/get")
    public List<Todo> getAll() {
        return todoService.getAllTodos();
    }

    // READ ONE
    @GetMapping("/get/{id}")
    public Todo getOne(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    // UPDATE
    @PutMapping("/put/{id}")
    public Todo update(@PathVariable Long id, @RequestBody Todo todo) {
        return todoService.updateTodo(id, todo);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return "Deleted Successfully";
    }
}

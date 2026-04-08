package service;

import models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TodoRepo;

import java.util.List;

@Service
public class TodoService {
    @Autowired

    public TodoRepo todoRepository;

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));
    }

    public Todo updateTodo(Long id, Todo newTodo) {

        Todo todo = getTodoById(id);

        todo.setTitle(newTodo.getTitle());
        todo.setCompleted(newTodo.isCompleted());

        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}

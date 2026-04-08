package repository;

import models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface TodoRepo extends JpaRepository<Todo,Long> {
}

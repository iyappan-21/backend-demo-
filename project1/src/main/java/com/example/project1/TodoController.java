package com.example.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Todo")
public class TodoController {
    @Autowired
    private TodoService todoService;
    public List<Todo> todo=new ArrayList<>();

    @PostMapping("/addvalue")
    public Todo addv(@RequestBody Todo s){

        return todoService.addval(s);
    }


    @PostMapping("/post/{id}")
    public int post(@PathVariable("id") int id){
        return id;
    }
    @PostMapping("/p")
    public int p(@RequestParam int id){
        return id;

    }

}

package com.example.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
     private TodoRepo todoRepo;

    public Todo addval(Todo s){
        return todoRepo.save(s);
    }




}

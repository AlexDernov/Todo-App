package com.example.recap4.controller;

import com.example.recap4.models.Todo;
import com.example.recap4.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    private final ToDoService toDoService;

    @Autowired
    public TodoController(ToDoService toDoService){
        this.toDoService = toDoService;
    }
    @GetMapping
    public List<Todo> getTodos(){
        return toDoService.getTodos();
    }
    @GetMapping("{id}")
    public Todo getTodoById(@PathVariable String id){
        return toDoService.getTodoById(id);
    }
    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        return toDoService.addTodo(todo);
    }
    @PutMapping("{id}")
    public Todo updateTodo(@PathVariable String id, @RequestBody Todo todo){
        if(!id.equals(todo.getId())){
            throw new IllegalArgumentException("Could not update element! There ist no such element-id");
        }
        return toDoService.updateTodo(todo);
    }
    @DeleteMapping("{id}")
    public void deleteTodo(@PathVariable String id){
        toDoService.deleteById(id);
    }
}

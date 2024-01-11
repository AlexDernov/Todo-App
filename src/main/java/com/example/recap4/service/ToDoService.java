package com.example.recap4.service;

import com.example.recap4.models.Todo;
import com.example.recap4.repos.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ToDoService {
    private final ToDoRepo todoRepo;
    private final IdService idService;

    @Autowired
    public ToDoService(ToDoRepo todoRepo, IdService idService){
        this.todoRepo = todoRepo;
        this.idService = idService;
    }
    public List<Todo> getTodos(){
        return todoRepo.findAll();
    }
    public Todo addTodo(Todo todo){
        todo.setId(idService.generateId());
        return todoRepo.save(todo);
    }
    public Todo getTodoById(String id){
        return todoRepo.findById(id).orElseThrow(()-> new NoSuchElementException("No character with such id!"));
    }
    public Todo updateTodo(Todo updatedTodo){
        return todoRepo.save(updatedTodo);
    }
    public void deleteById(String id){
        Todo todoToDelete =  todoRepo.findById(id).orElseThrow(() -> new NoSuchElementException("No character with such id!"));
        todoRepo.delete(todoToDelete);
    }
}


package com.example.recap4.repos;

import com.example.recap4.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
public interface ToDoRepo extends MongoRepository<Todo, String> {

    /*
    private final List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodo(){
        return todos;
    }
    public Todo addTodo(Todo todo){
        todos.add(todo);
        return todo;
    }

    public Todo findById(String id){
        for(Todo todo: todos){
            if(todo.getId().equals(id)){
                return todo;
            }
        }
        throw new NoSuchElementException("No element with " + id + " id");
    }
    public Todo updateTodo(Todo todo){
        for(int i = 0; i<todos.size(); i++){
            if(todos.get(i).getId().equals(todo.getId())){
                todos.set(i, todo);
                return todo;
            }
        }
        throw new NoSuchElementException("No element with " + todo.getId() + " id");
    }*/
}

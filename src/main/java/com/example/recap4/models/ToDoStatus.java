package com.example.recap4.models;

public enum ToDoStatus {
    OPEN,
    IN_PROGRESS,
    DONE;

    public String getStatus(){return this.toString();}
}

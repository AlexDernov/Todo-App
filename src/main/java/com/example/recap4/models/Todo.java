package com.example.recap4.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Todo {

        private String id;
        private String description;
        private ToDoStatus status;
}

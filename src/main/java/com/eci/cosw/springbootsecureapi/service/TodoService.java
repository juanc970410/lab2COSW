package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TodoService {
    List<Todo> getTodoList();
    Todo addTodo( Todo todo );
}

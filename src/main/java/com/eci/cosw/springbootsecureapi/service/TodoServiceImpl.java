package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TodoServiceImpl implements TodoService{

    List<Todo> list = new ArrayList<Todo>();
    @Autowired
    public TodoServiceImpl(){}
    @Override
    public List<Todo> getTodoList() {
        return list;
    }

    @Override
    public Todo addTodo(Todo todo) {
        list.add(todo);
        return todo;
    }
}

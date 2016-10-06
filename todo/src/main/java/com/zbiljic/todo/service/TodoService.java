package com.zbiljic.todo.service;

import com.zbiljic.todo.service.model.Todo;

import java.util.List;

public interface TodoService {

  Todo createTodo(Todo todo);

  Todo getTodo(int id);

  Todo updateTodo(int id, Todo updatedTodo);

  void deleteTodo(int id);

  List<Todo> getAllTodos();

  void deleteAllTodos();
}

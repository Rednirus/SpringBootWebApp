package com.todo.app.web.service;

import com.todo.app.web.model.Task;


public interface TodoService {

	void addTodo(Task todo);

	void updateTodo(Task todo);

	Object retrieveTodos(String name);

	void deleteTodo(int id);

	Task retrieveTodo(int id);}
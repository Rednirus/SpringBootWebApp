package com.todo.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.web.model.Task;
import com.todo.app.web.model.mongodb.repositories.TodoMongoRepository;

@Service
public class ToDoServiceImpl implements TodoService {
	@Autowired
	private TodoMongoRepository todoMongoRepository;

	public List<Task> retrieveTodos(String user) {
		return todoMongoRepository.getByUser(user);
	}

	public Task retrieveTodo(int id) {
		return todoMongoRepository.findOne(id);
	}

	public void updateTodo(Task todo) {
		todoMongoRepository.save(todo);
	}

	public void addTodo(Task todo) {
		todoMongoRepository.save(todo);
	}

	public void deleteTodo(int id) {
		todoMongoRepository.delete(id);
	}

}

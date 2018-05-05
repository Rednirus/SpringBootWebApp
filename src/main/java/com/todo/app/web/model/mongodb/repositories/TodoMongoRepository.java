package com.todo.app.web.model.mongodb.repositories;

import com.todo.app.web.model.Task;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface TodoMongoRepository extends MongoRepository<Task, Integer>{
	List<Task> getByUser(String user);
}

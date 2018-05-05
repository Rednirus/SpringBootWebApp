package com.todo.app.web.model.mongodb.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.todo.app.web.model.Task;
import com.todo.app.web.model.TaskBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoMongoRepositoryTest {
	@Autowired
	private TodoMongoRepository todoMongoRepository;

	@Before
	public void setUp() throws Exception {
		Task todo = new TaskBuilder().withUser("Dan").withDesc("learn stuff").withTargetDate(new Date()).withDone(true).build();
		//Task todo2 = new Task(2, "John", "MVC curse ", new Date(), false);
		Task todo3 = this.todoMongoRepository.save(todo);
		//Task todo4 = this.todoMongoRepository.save(todo2);
		assertNotNull(todo3);
	}

	@Test
	public void testFetchData() {
		/* Test data retrieval */
		Task todo = todoMongoRepository.findOne(1);
		//assertNotNull(todo);
		//assertEquals("Dan", todo.getUser());
		/* Get all products, list should only have two */
		Iterable<Task> todos = todoMongoRepository.findAll();
		int count = 0;
		for (Task p : todos) {
			count++;
		}
		assertEquals(count, 2);
	}

	@After
	public void tearDown() throws Exception {
		this.todoMongoRepository.deleteAll();
	}
}

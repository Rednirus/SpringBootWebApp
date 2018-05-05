package com.todo.app.web.model;

import java.util.Date;

public class TaskBuilder {
	private int taskId;
	private String user;
	private String desc;
	private Date targetDate;
	private boolean isDone;

	public TaskBuilder() {
	}

	public Task build() {
		return new Task(taskId, user, desc, targetDate, isDone);
	}

	public TaskBuilder withTaskId(int taskId) {
		this.taskId = taskId;
		return this;
	}

	public TaskBuilder withUser(String user) {
		this.user = user;
		return this;
	}

	public TaskBuilder withDesc(String desc) {
		this.desc = desc;
		return this;
	}

	public TaskBuilder withTargetDate(Date targetDate) {
		this.targetDate = targetDate;
		return this;
	}

	public TaskBuilder withDone(boolean isDone) {
		this.isDone = isDone;
		return this;
	}
}

package com.todo.app.web.model;

import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "todos")
public class Task {
	private int taskId;
	private String user;

	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String desc;

	private Date targetDate;
	private boolean isDone;

	public Task() {
	}

	public Task(int taskId, String user, String desc, Date targetDate, boolean isDone) {
		this.taskId = taskId;
		this.user = user;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}


	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(taskId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Task other = (Task) obj;
		return this.taskId == other.getTaskId();
	}

	@Override
	public String toString() {
		return "Todo [taskId=" + taskId + ", user=" + user + ", desc=" + desc + ", targetDate=" + targetDate + ", isDone="
				+ isDone + "]";
	}
}
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
	<div class="container" style="background-color: #99CC00">
		<table class="table table-striped">
			<caption>Your pending tasks are</caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Completed?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"/></td>
						<td>${todo.done}</td>
						<td><a type="button" class="btn btn-success"
							href="/update-todo?id=${todo.taskId}">Update</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-todo?id=${todo.taskId}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/add-todo" style='color: black'><b>Add new Task</b></a>
		</div>
	</div>
<%@ include file="common/footer.jspf" %>
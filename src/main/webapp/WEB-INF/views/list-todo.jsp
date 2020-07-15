<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>Yahoo!!</title>
<!-- Bootstrap core CSS -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}

.footer .container {
width: auto;
max-width: 680px;
padding: 0 15px;
}
</style>
</head>

<body>

	<nav role="navigation" class="navbar navbar-default">

		<div class="">
			<a href="/" class="navbar-brand">ToDo List</a>
		</div>

		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/list-todo.do">Todos</a></li>
				<li><a href="https://in.linkedin.com/in/pratik-ahuja-007">About Me</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/logout.do">LogOut</a></li>
			</ul>
		</div>

	</nav>

	<div class="container">
		<H1>Welcome ${name}</H1>

		Your Todos are
		  <div>
              
              <table class="table   table-striped">
                <thead>
                    <th>Description</th>  
                    <th>Category</th>  
                    <th>Actions</th>  
                </thead>
                  
                <tbody>
                <c:forEach items="${todos}" var="todo">
                  <tr>
                      <td>${todo.name}</td>
                      <td>${todo.category}</td>
                      <td><a class="btn btn-danger" href="/delete-todo.do?todo=${todo.name}&category=${todo.category}">Delete</a></td>
                  </tr>    
                </c:forEach>                        
                </tbody>
                  
                  
              </table>
            
            
        </div>
        
        <div>
            <br/>
            <a class="btn btn-success" href="/add-todo.do">Add New TODO</a>
        </div>
	</div>

	<footer class="footer">
		<div class="container">
			<p>footer content</p>
		</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>
package webapp.ToDo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.ToDo.ToDoService;


@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet{
	
		private ToDoService todoService = new ToDoService();
	
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			todoService.deleteTodo(new ToDo(request.getParameter("todo"),request.getParameter("category")));
			 response.sendRedirect("/list-todo.do");
		}
		
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		  //Putting attribute 
		  String newtodo = request.getParameter("this_todo");
		  String category = request.getParameter("category");
		  todoService.addTodo(new ToDo(newtodo,category));
		  
		  response.sendRedirect("/list-todo.do");
		}
		
		
	  
}

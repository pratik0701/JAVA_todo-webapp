package webapp.ToDo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.ToDo.ToDoService;


@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet{
	
		private ToDoService todoService = new ToDoService();
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			  request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
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

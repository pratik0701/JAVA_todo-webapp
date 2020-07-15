package webapp.ToDo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.ToDo.ToDoService;


@WebServlet(urlPatterns = "/list-todo.do")
public class ListTodoServlet extends HttpServlet{
	
		private ToDoService todoService = new ToDoService();
	
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		  //Putting attribute 
		  request.getSession().setAttribute("todos", todoService.retrieveToDos());
		  request.getRequestDispatcher("/WEB-INF/views/list-todo.jsp").forward(request, response);
		}
		
}

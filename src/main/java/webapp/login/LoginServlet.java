package webapp.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.ToDo.ToDoService;


@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	
		private LoginService userValidationService = new LoginService();
		private ToDoService todoService = new ToDoService();
	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		  //Putting attribute 
		  request.setAttribute("name", request.getParameter("name"));
		  request.setAttribute("password", request.getParameter("password"));
		  request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	  
	  
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		  String name = request.getParameter("name");
		  String password = request.getParameter("password");
		  
		  boolean isUserValid = userValidationService.isValid(name,password);
		  if(isUserValid) {
			  request.getSession().setAttribute("name",name);
			  response.sendRedirect("/list-todo.do");
		  }
		  else {
			  request.setAttribute("error", "Invalid Credentials");
			  request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		  }
		  
	  }
	  

}

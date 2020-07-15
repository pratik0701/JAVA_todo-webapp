package webapp.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {
	private static List<ToDo> todos = new ArrayList<ToDo>();
	
	static {
		todos.add(new ToDo("Learn Web Application Development","Study"));
		todos.add(new ToDo("Learn Spring MVC Development","Study"));
		todos.add(new ToDo("Learn Spring Rest","Study"));
	}
	
	public List<ToDo> retrieveToDos(){
		return todos;
	}
	
	public void addTodo(ToDo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(ToDo todo) {
		todos.remove(todo);
	}
	
}

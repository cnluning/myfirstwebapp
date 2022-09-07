package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToDoController {
	
	public ToDoController(ToDoService toDoService) {
		super();
		this.toDoService = toDoService;
	}

	private ToDoService toDoService; 
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<ToDo> toDos = toDoService.findByUsername("in28minutes");
		model.addAttribute("toDos", toDos);
		
		return "listToDos";
	}

}

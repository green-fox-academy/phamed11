package com.greenfoxacademy.listingtodosh2.Controllers;

import com.greenfoxacademy.listingtodosh2.Respositories.ToDoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class ToDoControllers {

  private ToDoRespository toDoRespository;

  @Autowired
  public ToDoControllers(ToDoRespository toDoRespository) {
    this.toDoRespository = toDoRespository;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", toDoRespository.findAll());
    return "todolist";
  }

}

package com.greenfoxacademy.connectionmysql.Controllers;

import com.greenfoxacademy.connectionmysql.Models.ToDo;
import com.greenfoxacademy.connectionmysql.Respositories.ToDoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
  public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean result) {
    if (result == null) {
      model.addAttribute("todos", toDoRespository.findAll());
    } else {
      model.addAttribute("todos", toDoRespository.findByDone(!result));
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String todo() {
    return "addtodo";
  }

  @PostMapping("/add")
  public String todoPost(@RequestParam(value = "name") String title) {
  toDoRespository.save(new ToDo(title, false, false));
    return "redirect:/todo/";
  }

}

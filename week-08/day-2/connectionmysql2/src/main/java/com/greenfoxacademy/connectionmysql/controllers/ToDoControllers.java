package com.greenfoxacademy.connectionmysql.controllers;

import com.greenfoxacademy.connectionmysql.models.ToDo;
import com.greenfoxacademy.connectionmysql.services.ToDoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class ToDoControllers {

  private ToDoServices toDoServices;

  @Autowired
  public ToDoControllers(ToDoServices toDoServices) {
    this.toDoServices = toDoServices;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive,
                     @RequestParam(value = "search", required = false) String search) {
      model.addAttribute("todos", toDoServices.startPage(isActive, search));
    return "todolist";
  }

  @GetMapping("/add")
  public String todo() {
    return "addtodo";
  }

  @PostMapping("/add")
  public String todoPost(@RequestParam(value = "name") String title,
                         @ModelAttribute(value = "urgent") boolean urgent) {
    toDoServices.saveToDo(new ToDo(title, urgent, false));
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable(value = "id") Long idToDelete) {
    toDoServices.deleteToDoById(idToDelete);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String getEdit(@PathVariable(value = "id") Long id, Model model) {
    model.addAttribute("toDo", toDoServices.findById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute(value = "toDo") ToDo todo) {
    toDoServices.saveToDo(todo);
    return "redirect:/todo/";
  }
}

package com.greenfoxacademy.connectionmysql.controllers;

import com.greenfoxacademy.connectionmysql.models.Assignee;
import com.greenfoxacademy.connectionmysql.models.ToDo;
import com.greenfoxacademy.connectionmysql.services.AssigneeServices;
import com.greenfoxacademy.connectionmysql.services.ToDoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class ToDoControllers {

  private ToDoServices toDoServices;
  private AssigneeServices assigneeServices;

  @Autowired
  public ToDoControllers(ToDoServices toDoServices, AssigneeServices assigneeServices) {
    this.toDoServices = toDoServices;
    this.assigneeServices = assigneeServices;
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

  @GetMapping("/assignees")
  public String listOfAssignees(Model model) {
    model.addAttribute("assignees", assigneeServices.findAllAssignees());
    return "list";
  }

  @GetMapping("/assignees/{id}/delete")
  public String deleteAssignee(@PathVariable(value = "id") Long idToDelete) {
    assigneeServices.deleteAssigneeById(idToDelete);
    return "redirect:/todo/assignees";
  }

  @GetMapping("/assignees/{id}/edit")
  public String getEditAssignees(@PathVariable(value = "id") Long id, Model model) {
    model.addAttribute("assignee", assigneeServices.findAssigneeById(id));
    return "editassignees";
  }

  @PostMapping("/assignees/{id}/edit")
  public String editAssignees(@ModelAttribute(value = "assignee")Assignee assignee) {
    assigneeServices.saveAssignee(assignee);
    return "redirect:/todo/assignees";
  }

  @GetMapping("/assignees/add")
  public String addGetAssignee() {
    return "addassignee";
  }

  @PostMapping("/assignees/add")
  public String addAssignee(@ModelAttribute(value = "name") String name,
                         @ModelAttribute(value = "email") String email) {
    assigneeServices.saveAssignee(new Assignee(name, email));
    return "redirect:/todo/assignees";
  }
}

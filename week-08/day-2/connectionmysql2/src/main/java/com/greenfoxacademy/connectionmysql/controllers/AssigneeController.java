package com.greenfoxacademy.connectionmysql.controllers;


import com.greenfoxacademy.connectionmysql.models.Assignee;
import com.greenfoxacademy.connectionmysql.services.AssigneeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

  private AssigneeServices assigneeServices;

  @Autowired
  public AssigneeController(AssigneeServices assigneeServices) {
    this.assigneeServices = assigneeServices;
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
  public String editAssignees(@ModelAttribute(value = "assignee") Assignee assignee) {
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

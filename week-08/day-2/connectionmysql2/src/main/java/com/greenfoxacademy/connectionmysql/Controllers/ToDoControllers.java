package com.greenfoxacademy.connectionmysql.Controllers;

import com.greenfoxacademy.connectionmysql.Models.ToDo;
import com.greenfoxacademy.connectionmysql.Respositories.ToDoRespository;
import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
  public String todoPost(@RequestParam(value = "name") String title,
                         @ModelAttribute(value = "urgent") boolean urgent) {
    toDoRespository.save(new ToDo(title, urgent, false));
    return "redirect:/todo/";
  }


  @GetMapping("/{id}/delete")
  public String delete(@PathVariable(value = "id") Long idToDelete) {
    toDoRespository.deleteById(idToDelete);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String getEdit(@ModelAttribute(value = "id") Long id, Model model) {
    model.addAttribute("toDo", toDoRespository.findById(id).get());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute(value = "toDo") ToDo todo) {
    toDoRespository.save(todo);
    return "redirect:/todo/";
  }

}

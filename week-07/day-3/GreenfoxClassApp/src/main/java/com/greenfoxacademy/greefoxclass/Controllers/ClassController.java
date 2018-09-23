package com.greenfoxacademy.greefoxclass.Controllers;

import com.greenfoxacademy.greefoxclass.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassController {
  StudentService studentService;

  @Autowired
  public ClassController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/gfa")
  public String listOfAllStudents() {
    return "index";
  }

  @GetMapping("/gfa/list")
  public String mainPage(Model model) {
    model.addAttribute("allStudents", studentService.findAll());
    return "list";
  }


}

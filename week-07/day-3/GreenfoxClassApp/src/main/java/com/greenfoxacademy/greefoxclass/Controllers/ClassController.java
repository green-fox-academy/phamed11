package com.greenfoxacademy.greefoxclass.Controllers;

import com.greenfoxacademy.greefoxclass.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClassController {
  StudentService studentService;

  @Autowired
  public ClassController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/gfa")
  public String listOfAllStudents(Model model) {
    model.addAttribute("index", studentService.numberOfStudents());
    return "index";
  }

  @GetMapping("/gfa/list")
  public String mainPage(Model model) {
    model.addAttribute("allStudents", studentService.findAll());
    return "list";
  }

  @GetMapping("/gfa/add")
  public String addPage(Model model) {
    return "add";
  }


  @PostMapping("/save")
  public String save(@RequestParam(value = "name") String name) {
    studentService.save(name);
    return "redirect:/gfa/list";
  }
}

package com.greenfoxacademy.greefoxclass.Controllers;

import com.greenfoxacademy.greefoxclass.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClassController {
  StudentService studentService;

  @Autowired
  public ClassController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/")
  public String listOfAllStudents(Model model) {
    model.addAttribute("number", studentService.numberOfStudents());
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

  @GetMapping("/check")
  public String checkMain(Model model) {
    model.addAttribute("isMember", false);
    return "check";
  }

  @PostMapping("/info")
  public String checkStudent(Model model, @RequestParam(value = "name") String name) {
    model.addAttribute("isMember", studentService.isAStudent(name));
    return "check";
  }

}

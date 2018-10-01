package com.greenfoxacademy.jsonexercises.controllers;


import com.greenfoxacademy.jsonexercises.services.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseRestController {

  private ExerciseService exerciseService;

  @Autowired
  public ExerciseRestController(ExerciseService exerciseService) {
    this.exerciseService = exerciseService;
  }

  @GetMapping("/doubling")
  public ResponseEntity<?> doubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number == null) {
      return ResponseEntity.ok(exerciseService.error(number));
    }
    return ResponseEntity.ok(exerciseService.doubling(number));
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name == null || title == null) {
      return exerciseService.nameTitleError(name, title);
    }
    return exerciseService.greeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object appended(@PathVariable(value = "appendable", required = false) String word) {
    if (word == null) {
      ResponseEntity.status(HttpStatus.NOT_FOUND);
    }
    return exerciseService.append(word);
  }
}

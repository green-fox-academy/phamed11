package com.greenfoxacademy.jsonexercises.controllers;


import com.greenfoxacademy.jsonexercises.models.Array;
import com.greenfoxacademy.jsonexercises.models.ErrorMessage;
import com.greenfoxacademy.jsonexercises.models.Result;
import com.greenfoxacademy.jsonexercises.models.Until;
import com.greenfoxacademy.jsonexercises.services.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    exerciseService.saveLog("/doubling", exerciseService.doubling(number).toString());
    return ResponseEntity.ok(exerciseService.doubling(number));
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name == null || title == null) {
      return exerciseService.nameTitleError(name, title);
    }
    exerciseService.saveLog("/greeter", exerciseService.greeting(name, title).toString());
    return exerciseService.greeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object appended(@PathVariable(value = "appendable", required = false) String word) {
    if (word == null) {
      ResponseEntity.status(HttpStatus.NOT_FOUND);
    }
    exerciseService.saveLog("/appenda/" + word, exerciseService.append(word).toString());
    return exerciseService.append(word);
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable(value = "action", required = false) String action, @RequestBody(required = false) Until until) {
    Result send = new Result();
    ErrorMessage error = new ErrorMessage();
    if (until == null) {
      error.setError("Please provide a number!");
      return error;
    } else if (action.equals("factor")) {
      send.setResult(exerciseService.factor(until.getUntil()));
      exerciseService.saveLog("/dountil/" + action, send.toString());
    } else if
    (action.equals("sum")) {
      send.setResult(exerciseService.summ(until.getUntil()));
      exerciseService.saveLog("/dountil/" + action, send.toString());
    }
    return send;
  }

  @PostMapping("/arrays")
  public Object arrays(@RequestBody(required = false) Array array) {
    ErrorMessage error = new ErrorMessage();
    Result result = new Result();
    if (array == null) {
      error.setError("Please provide what to do with the numbers!");
      return error;
    }
    exerciseService.saveLog("/arrays", exerciseService.arrayResult(array.getNumbers(),array.getWhat()).toString());
    return exerciseService.arrayResult(array.getNumbers(), array.getWhat());
  }

  @GetMapping("/log")
  public Object logs() {
    return exerciseService.allLogs();
  }
}

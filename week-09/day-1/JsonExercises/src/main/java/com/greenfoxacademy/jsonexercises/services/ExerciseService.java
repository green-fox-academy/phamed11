package com.greenfoxacademy.jsonexercises.services;

import com.greenfoxacademy.jsonexercises.models.*;

import java.util.List;

public interface ExerciseService {

  Doubling doubling(Integer number);
  ErrorMessage error(Integer number);
  User greeting(String name, String title);
  ErrorMessage nameTitleError(String name, String title);
  Appended append(String word);
  int summ(Integer number);
  int factor(Integer number);
  Result arrayResult(List<Integer> numbers, String what);
  void saveLog(String endpoint, String data);
  List<Log> allLogs();

}

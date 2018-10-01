package com.greenfoxacademy.jsonexercises.services;

import com.greenfoxacademy.jsonexercises.models.Appended;
import com.greenfoxacademy.jsonexercises.models.Doubling;
import com.greenfoxacademy.jsonexercises.models.ErrorMessage;
import com.greenfoxacademy.jsonexercises.models.User;

public interface ExerciseService {

  Doubling doubling(Integer number);
  ErrorMessage error(Integer number);
  User greeting(String name, String title);
  ErrorMessage nameTitleError(String name, String title);
  Appended append(String word);
  int summ(Integer number);
  int factor(Integer number);

}

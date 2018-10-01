package com.greenfoxacademy.jsonexercises.services;

import com.greenfoxacademy.jsonexercises.models.Doubling;
import com.greenfoxacademy.jsonexercises.models.ErrorMessage;
import com.greenfoxacademy.jsonexercises.models.User;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {


  @Override
  public Doubling doubling(Integer number) {
    Doubling doubling = new Doubling();
    doubling.setReceived(number);
    doubling.setResult(number * 2);
    return doubling;
  }

  @Override
  public ErrorMessage error(Integer number) {
    ErrorMessage error = new ErrorMessage();
    if (number == null) {
      error.setError("Please provide an input!");
    }
    return error;
  }



  @Override
  public User greeting(String name, String title) {
    User petike = new User();
    petike.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
    return petike;
  }

  @Override
  public ErrorMessage nameTitleError(String name, String title) {
    ErrorMessage error = new ErrorMessage();
    if (name == null) {
      error.setError("Please provide a name!");
    } else if (title == null) {
      error.setError("Please provide a title!");
    }
    return error;
  }
}

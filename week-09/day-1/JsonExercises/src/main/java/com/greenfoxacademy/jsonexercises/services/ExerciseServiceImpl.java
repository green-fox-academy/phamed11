package com.greenfoxacademy.jsonexercises.services;

import com.greenfoxacademy.jsonexercises.models.Appended;
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

  @Override
  public Appended append(String word) {
    Appended toChange = new Appended();
    String toAdd = word + "a";
    toChange.setAppended(toAdd);
    return toChange;
  }

  @Override
  public int summ(Integer number) {
    int sum = 0;
    for (int i = 0; i <= number ; i++) {
      sum+=i;
    }
    return sum;
  }

  @Override
  public int factor(Integer number) {
    int sum = 1;
    for (int i = 1; i <= number; i++) {
      sum*=i;
    }
    return sum;
  }


}

package com.greenfoxacademy.jsonexercises.services;

import com.greenfoxacademy.jsonexercises.models.*;
import com.greenfoxacademy.jsonexercises.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {

  private LogRepository logRepository;

  @Autowired
  public ExerciseServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

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
    for (int i = 0; i <= number; i++) {
      sum += i;
    }
    return sum;
  }

  @Override
  public int factor(Integer number) {
    int sum = 1;
    for (int i = 1; i <= number; i++) {
      sum *= i;
    }
    return sum;
  }

  @Override
  public Result arrayResult(List<Integer> numbers, String what) {
    Result result = new Result();
    Array array = new Array();
    array.setNumbers(numbers);
    if (what.equals("sum")) {
      Integer sum = 0;
      for (int i = 0; i < array.getNumbers().size(); i++) {
        sum += array.getNumbers().get(i);
        result.setResult(sum);
      }
    } else if (what.equals("multiply")) {
      Integer sum = 1;
      for (int i = 0; i < array.getNumbers().size(); i++) {
        sum *= array.getNumbers().get(i);
        result.setResult(sum);
      }
    } else if (what.equals("double")) {
      List<Integer> sum = new ArrayList<>();
      for (int i = 0; i < array.getNumbers().size(); i++) {
        sum.add(array.getNumbers().get(i) * 2);
        result.setResult(sum);
      }
    }
    return result;
  }

  @Override
  public void saveLog(String endpoint, String data) {
    logRepository.save(new Log(endpoint, data));
  }

  @Override
  public List<Log> allLogs() {
    return logRepository.findAll();
  }


}


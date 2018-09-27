package com.greenfoxacademy.connectionmysql.services;


import com.greenfoxacademy.connectionmysql.models.ToDo;

import java.util.List;

public interface ToDoServices {


  List<ToDo> allToDos();
  List<ToDo> allToDosDone(boolean result);
  void saveToDo(ToDo todo);
  void deleteToDoById(Long idToDelete);
  ToDo findById(Long id);
  List<ToDo> searchString(String title);
  List<ToDo> startPage(Boolean isActive, String search);

}

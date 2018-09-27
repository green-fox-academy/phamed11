package com.greenfoxacademy.connectionmysql.services;

import com.greenfoxacademy.connectionmysql.models.ToDo;
import com.greenfoxacademy.connectionmysql.respositories.ToDoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServicesImpl implements ToDoServices{

  private ToDoRespository toDoRespository;

  @Autowired
  public ToDoServicesImpl(ToDoRespository toDoRespository) {
    this.toDoRespository = toDoRespository;
  }

  @Override
  public List<ToDo> allToDos() {
    return toDoRespository.findAll();
  }

  @Override
  public List<ToDo> allToDosDone(boolean result) {
    return toDoRespository.findByDone(result);
  }

  @Override
  public void saveToDo(ToDo todo) {
    toDoRespository.save(todo);
  }

  @Override
  public void deleteToDoById(Long idToDelete) {
  toDoRespository.deleteById(idToDelete);
  }

  @Override
  public ToDo findById(Long id) {
    return toDoRespository.findById(id).get();
  }

  @Override
  public List<ToDo> searchString(String title) {
    List<ToDo> searchResult = new ArrayList<>();
    for (int i = 0; i < allToDos().size(); i++) {
      if (allToDos().get(i).getTitle().toLowerCase().contains(title.toLowerCase())) {
        searchResult.add(allToDos().get(i));
      }
    }
    return searchResult;
  }
}

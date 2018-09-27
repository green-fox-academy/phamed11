package com.greenfoxacademy.connectionmysql.services;

import com.greenfoxacademy.connectionmysql.models.ToDo;
import com.greenfoxacademy.connectionmysql.respositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServicesImpl implements ToDoServices{

  private ToDoRepository toDoRepository;

  @Autowired
  public ToDoServicesImpl(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @Override
  public List<ToDo> allToDos() {
    return toDoRepository.findAll();
  }

  @Override
  public List<ToDo> allToDosDone(boolean result) {
    return toDoRepository.findByDone(result);
  }

  @Override
  public void saveToDo(ToDo todo) {
    toDoRepository.save(todo);
  }

  @Override
  public void deleteToDoById(Long idToDelete) {
  toDoRepository.deleteById(idToDelete);
  }

  @Override
  public ToDo findById(Long id) {
    return toDoRepository.findById(id).get();
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

  @Override
  public List<ToDo> startPage(Boolean isActive, String search) {
    List<ToDo> result = new ArrayList<>();
    if (isActive == null && search == null) {
      result = allToDos();
    } else if (search == null){
      result =  allToDosDone(!isActive);
    } else if (isActive == null) {
      result = searchString(search);
    }
    return result;
  }
}

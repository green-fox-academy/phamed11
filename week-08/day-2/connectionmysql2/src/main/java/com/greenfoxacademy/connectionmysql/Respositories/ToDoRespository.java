package com.greenfoxacademy.connectionmysql.Respositories;

import com.greenfoxacademy.connectionmysql.Models.ToDo;
import com.sun.tools.javac.comp.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRespository extends CrudRepository<ToDo, Long> {

  List<ToDo> findByDone(boolean result);

}

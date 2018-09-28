package com.greenfoxacademy.connectionmysql.respositories;

import com.greenfoxacademy.connectionmysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

  List<ToDo> findByDone(boolean result);
  void deleteById(Long id);
  List<ToDo> findAll();
  List<ToDo> findAllByOrderByIdAsc();

}

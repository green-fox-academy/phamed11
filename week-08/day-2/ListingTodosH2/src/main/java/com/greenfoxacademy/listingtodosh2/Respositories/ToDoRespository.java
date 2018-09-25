package com.greenfoxacademy.listingtodosh2.Respositories;

import com.greenfoxacademy.listingtodosh2.Models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRespository extends CrudRepository<ToDo, Long> {


}

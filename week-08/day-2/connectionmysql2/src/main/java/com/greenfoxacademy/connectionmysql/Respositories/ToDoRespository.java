package com.greenfoxacademy.connectionmysql.Respositories;

import com.greenfoxacademy.connectionmysql.Models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRespository extends CrudRepository<ToDo, Long> {


}

package com.greenfoxacademy.connectionwithmysql.Respositories;

import com.greenfoxacademy.connectionwithmysql.Models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRespository extends CrudRepository<ToDo, Long> {


}

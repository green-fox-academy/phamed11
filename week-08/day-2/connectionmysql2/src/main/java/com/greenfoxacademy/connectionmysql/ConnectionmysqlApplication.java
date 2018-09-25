package com.greenfoxacademy.connectionmysql;

import com.greenfoxacademy.connectionmysql.Models.ToDo;
import com.greenfoxacademy.connectionmysql.Respositories.ToDoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionmysqlApplication implements CommandLineRunner {

  private ToDoRespository toDoRespository;

  @Autowired
  public ConnectionmysqlApplication(ToDoRespository toDoRespository) {
    this.toDoRespository = toDoRespository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoRespository.save(new ToDo("Start the day", true, true));
    toDoRespository.save(new ToDo("Finish H2 workshop1", true, false));
    toDoRespository.save(new ToDo("Finish JPA workshop2", true, true));
    toDoRespository.save(new ToDo("Create a CRUD project", true, false));
    toDoRespository.save(new ToDo("Eat something good", false, false));
    toDoRespository.save(new ToDo("Learn something about Mysql", false, false));
    toDoRespository.save(new ToDo("Have a large Hamburger", true, true));
  }
}
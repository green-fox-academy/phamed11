package com.greenfoxacademy.connectionmysql;

import com.greenfoxacademy.connectionmysql.models.ToDo;
import com.greenfoxacademy.connectionmysql.respositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionmysqlApplication implements CommandLineRunner {

  private ToDoRepository toDoRepository;

  @Autowired
  public ConnectionmysqlApplication(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoRepository.save(new ToDo("Start the day", true, true));
    toDoRepository.save(new ToDo("Finish H2 workshop1", true, false));
    toDoRepository.save(new ToDo("Finish JPA workshop2", true, true));
    toDoRepository.save(new ToDo("Create a CRUD project", true, false));
    toDoRepository.save(new ToDo("Eat something good", false, false));
    toDoRepository.save(new ToDo("Learn something about Mysql", false, false));
    toDoRepository.save(new ToDo("Have a large Hamburger", true, true));
  }
}
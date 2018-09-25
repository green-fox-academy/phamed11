package com.greenfoxacademy.listingtodosh2;

import com.greenfoxacademy.listingtodosh2.Models.ToDo;
import com.greenfoxacademy.listingtodosh2.Respositories.ToDoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodosh2Application implements CommandLineRunner {

  private ToDoRespository toDoRespository;

  @Autowired
  public Listingtodosh2Application(ToDoRespository toDoRespository) {
    this.toDoRespository = toDoRespository;
  }

  public static void main(String[] args) {
    SpringApplication.run(Listingtodosh2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    toDoRespository.save(new ToDo("Start the day", true, false));
    toDoRespository.save(new ToDo("Finish H2 workshop1", true, false));
    toDoRespository.save(new ToDo("Finish JPA workshop2", true, false));
    toDoRespository.save(new ToDo("Create a CRUD project", true, false));
  }
}

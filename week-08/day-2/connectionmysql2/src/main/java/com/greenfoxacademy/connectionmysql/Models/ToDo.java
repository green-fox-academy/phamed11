package com.greenfoxacademy.connectionmysql.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private boolean isUrgent;
  private boolean done;

  public ToDo() {
  }

  public ToDo(String title, boolean isUrgent, boolean done) {
    this.id = id;
    this.title = title;
    this.isUrgent = isUrgent;
    this.done = done;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean done() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }



}

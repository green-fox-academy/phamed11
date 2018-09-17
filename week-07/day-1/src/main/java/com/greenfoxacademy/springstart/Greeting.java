package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private long id;
  private String content;
  private static AtomicLong NUMBER = new AtomicLong(1);


  public Greeting(String content) {
    this.id = NUMBER.getAndIncrement();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;

  }
}

package com.greenfoxacademy.jsonexercises.models;

public class Until {
  private Integer until;

  public Until(Integer until) {
    this.until = until;
  }

  public Until() {
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }

  @Override
  public String toString() {
    return "Until{" +
        "until=" + until +
        '}';
  }
}

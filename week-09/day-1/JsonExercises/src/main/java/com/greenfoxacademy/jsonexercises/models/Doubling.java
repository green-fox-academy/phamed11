package com.greenfoxacademy.jsonexercises.models;

public class Doubling {
  Integer received;
  Integer result;
  String error;


  public Doubling() {
  }

  public Doubling(Integer received, Integer result) {
    this.received = received;
    this.result = result;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "Doubling{" +
        "received=" + received +
        ", result=" + result +
        ", error='" + error + '\'' +
        '}';
  }

}

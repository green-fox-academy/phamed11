package com.greenfoxacademy;

public class BlogPost {
  String authorsName;
  String title;
  String text;
  String publicationDate;


  public void posts() {
    System.out.println("\"" + title + "\" " + " titled by " + authorsName+ " posted at " + publicationDate);
    System.out.println(text);
  }

}

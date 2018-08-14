package com.greenfoxacademy;

import javax.print.DocFlavor;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    Path path = Paths.get("log.txt");
    try {
      List<String> logData = Files.readAllLines(path);
      List<String> lines = new ArrayList<>();
      for (int i = 0; i < logData.size(); i++) {
        lines.add(logData.get(i));
      }
      List<String> ipAddress = new ArrayList<>();
      
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}

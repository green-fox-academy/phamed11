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
//      uniqueIp(logData);
      getPostReturn(logData);
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

  public static void uniqueIp(List<String> data) {
    List<String> uniqueIp = new ArrayList<>();
    for (int i = 0; i < data.size(); i++) {
      String[] splitIp = data.get(i).split("   ");
      if (!uniqueIp.contains(splitIp[1])) {
        uniqueIp.add(splitIp[1]);
      }
    }
    System.out.print(uniqueIp);
  }

  public static void getPostReturn(List<String> data) {
    double numOfGet = 0.;
    double numOfPost = 0.;
    List<String> getPostNumbers = new ArrayList<>();
    for (int i = 0; i < data.size(); i++) {
      String[] splitIp = data.get(i).split("   ");
      getPostNumbers.add(splitIp[2]);
    }
    for (int i = 0; i < getPostNumbers.size(); i++) {
      if (getPostNumbers.get(i).startsWith("G")) {
        numOfGet++;
      } else {
        numOfPost++;
      }
    }
    double result = numOfGet / numOfPost;
    System.out.print(result);
  }
}

package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
  reversedOrder("Assets/reversedOrder.txt");

  }
  public static void reversedOrder(String path) {
    Path mypath = Paths.get(path);
    try {
      List<String> allLines = Files.readAllLines(mypath);
      for (int i = allLines.size() - 1; i >= 0; i--) {
        System.out.println(allLines.get(i));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}

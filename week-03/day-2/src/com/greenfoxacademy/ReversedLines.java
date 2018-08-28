package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
  reversedLines("Assets/reversedLines.txt");

  }
  public static void reversedLines(String path) {
    Path myPath = Paths.get(path);
    try {
      List<String> allReversedLines = Files.readAllLines(myPath);
      for (int i = 0; i < allReversedLines.size(); i++) {
        for (int j = allReversedLines.get(i).length() - 1; j >= 0 ; j--) {
          System.out.print(allReversedLines.get(i).charAt(j));
        }
        System.out.println();
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

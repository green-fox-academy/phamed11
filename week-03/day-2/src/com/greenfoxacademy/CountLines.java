package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    fileLines("day-2.iml");


  }
  public static void fileLines(String fileName) {
    Path path = Paths.get(fileName);
    int sum = 0;
    try {
      List<String> numberOf = Files.readAllLines(path);
      for (String num : numberOf) {
        String[] lines = num.split("\r\n|\r|\n");
        sum++;
      }
      System.out.println(sum);
    } catch (IOException e) {
      System.out.println("0");
    }
  }
}

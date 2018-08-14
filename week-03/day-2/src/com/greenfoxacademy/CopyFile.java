package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    String from = "copyFromHere.txt";
    String toCopy = "filesWillbeInHere.txt";


  }
  public static Boolean copy(String first, String second) {
    Path fromCopy = Paths.get(first);
    Path toCopy = Paths.get(second);
    List<String> writeThis = new ArrayList<>();
    try {
      List<String> firstContent = Files.readAllLines(fromCopy);
      for (int i = 0; i < firstContent.size(); i++) {
        Files.write(second, firstContent.get(i));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}

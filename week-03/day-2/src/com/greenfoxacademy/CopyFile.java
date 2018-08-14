package com.greenfoxacademy;

import com.sun.image.codec.jpeg.TruncatedFileException;

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

    copy(from, toCopy);

  }

  public static Boolean copy(String first, String second) {
    Boolean result = true;
    Path fromCopy = Paths.get(first);
    Path toCopy = Paths.get(second);
    List<String> writeThis = new ArrayList<>();
    try {
      List<String> firstContent = Files.readAllLines(fromCopy);
      for (int i = 0; i < firstContent.size(); i++) {
        writeThis.add(firstContent.get(i));
      }
      Files.write(toCopy, firstContent);
      List<String> toCheckFirst = Files.readAllLines(toCopy);
      List<String> secondChanged = Files.readAllLines(fromCopy);
      System.out.println(result = second.contains(first));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return result;
  }
}

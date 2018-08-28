package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    decryptDuplicated("duplicated.txt");

  }

  public static void decryptDuplicated(String path) {
    Path myPath = Paths.get(path);
    int need = 0;
    List<Character> decryptedText = new ArrayList<>();
    try {
      List<String> eachLines = Files.readAllLines(myPath);
      for (int i = 0; i < eachLines.size(); i++) {
        for (int j = 0; j < eachLines.get(i).length(); j += 2) {
          System.out.print(eachLines.get(i).charAt(j));
        }
        System.out.println();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt
    encodedLines("Assets/encodedMessage.txt");

  }

  public static void encodedLines(String path) {
    Path myPath = Paths.get(path);
    try {
      List<String> allLines = Files.readAllLines(myPath);
      String abc = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ[abcdefghijklmnopqrstuvwxyz /'(,-..--*+!\"");
//      System.out.println(abc.charAt(abc.indexOf(allLines.get(0).charAt(0) - 1)));


      for (int i = 0; i < allLines.size(); i++) {
        for (int j = 0; j < allLines.get(i).length(); j++) {
          if (abc.charAt(abc.indexOf(allLines.get(i).charAt(j))) == ' ') {
            System.out.print(' ');
          } else if (abc.charAt(abc.indexOf(allLines.get(i).charAt(j))) == '/') {
//            System.out.println("\n");
          } else {
            System.out.print(abc.charAt(abc.indexOf(allLines.get(i).charAt(j) - 1)));
          }

        }
        System.out.println();
      }

    } catch (
        IOException e) {
      e.printStackTrace();
    }
  }
}
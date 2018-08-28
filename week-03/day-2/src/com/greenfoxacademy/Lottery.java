package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lottery {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv
    commonNumbers("Assets/lottery.txt");

  }

  public static void commonNumbers(String path) {
    Path myPath = Paths.get(path);
    List<String> lotteryNumbers = new ArrayList<>();
    try {
      List<String> lottery = Files.readAllLines(myPath);
      for (int i = 0; i < lottery.size(); i++) {
        String[] numbers = lottery.get(i).split(";");
        lotteryNumbers.add(numbers[11]);
        lotteryNumbers.add(numbers[12]);
        lotteryNumbers.add(numbers[13]);
        lotteryNumbers.add(numbers[14]);
        lotteryNumbers.add(numbers[15]);
      }
      System.out.println(lotteryNumbers);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv
    commonNumbers("Assets/lottery.txt");

  }

  public static void commonNumbers(String path) {
    Path myPath = Paths.get(path);
    List<String> lotteryNumbers = new ArrayList<>();
    Map<String, Integer> allTheNums = new HashMap<>();
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
    } catch (IOException e) {
      e.printStackTrace();
    }
    for (int i = 0; i < lotteryNumbers.size(); i++) {
      if (!allTheNums.containsKey(lotteryNumbers.get(i))) {
        allTheNums.put(lotteryNumbers.get(i), 1);
      } else {
        allTheNums.put(lotteryNumbers.get(i), allTheNums.get(lotteryNumbers.get(i)) +1);
      }
    }
  }
}
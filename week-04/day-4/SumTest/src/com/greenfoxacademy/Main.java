package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

      ArrayList<Integer> test = new ArrayList<>(Arrays.asList(44, 22));

      Sum testsum = new Sum();

      System.out.println(testsum.sum(test));


    }
}

package com.greenfoxacademy;

import java.util.stream.IntStream;

public class Shifter implements CharSequence{
  String string;
  int shifter = 2;

  public Shifter(String string) {
    this.string = string;
  }
  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    char result = string.charAt(index + shifter);
    return result;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }
}

package com.greenfoxacademy;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return 0;
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
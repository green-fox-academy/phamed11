package com.greenfoxacademy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void sum() {
    SumTest basic = new SumTest();
    ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(11, 33));
    assertArrayEquals(44, basic.sum(testList));
  }


}
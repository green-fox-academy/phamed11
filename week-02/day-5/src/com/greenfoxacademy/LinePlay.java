package com.greenfoxacademy;

import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    int column = 20;
    int row = 0;
    for (int i = 0; i < 15; i++) {
      column += 20;
      row += 20;
      graphics.setColor(Color.green);
      graphics.drawLine(0, column, row, HEIGHT);
    }
    int a = 0;
    int b = 20;
    for (int i = 0; i < 15; i++) {
      a += 20;
      b += 20;
      graphics.setColor(Color.red);
      graphics.drawLine(WIDTH - a, 0, WIDTH, HEIGHT - b);
    }

  }


  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}


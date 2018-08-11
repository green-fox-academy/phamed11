package com.greenfoxacademy;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  public static void mainDraw(Graphics graphics) {

    int x = 150;
    int y = 0;
    int size = 10;

    for (int i = 0; i < 3; i++) {
      graphics.drawLine(x, y, x - size / 2, y + size);
      graphics.drawLine(x - size / 2, y + size, x + size / 2, y + size);
      graphics.drawLine(x + size / 2, y + size, x, y);
      x = x - size /2;
      y += size;
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





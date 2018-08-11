package com.greenfoxacademy;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  public static void mainDraw(Graphics graphics) {
    int steps = 10;
    graphics.setColor(Color.BLACK);
    triangle(graphics, 10);


  }

  public static void triangle(Graphics triangle, int size) {
    size = 10;
    int height = 9;
    triangle.drawLine(WIDTH / 2, HEIGHT - HEIGHT, WIDTH / 2 - size / 2, HEIGHT - HEIGHT + height);
    triangle.drawLine(WIDTH / 2 - size / 2, HEIGHT - HEIGHT + height, WIDTH / 2 + size / 2, HEIGHT - HEIGHT + height);
    triangle.drawLine(WIDTH / 2 + size / 2, HEIGHT - HEIGHT + height, WIDTH / 2, HEIGHT - HEIGHT);
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





package com.greenfoxacademy;

import apple.laf.JRSUIConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Random;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics) {

    int x = WIDTH / 3;
    int y = HEIGHT / 3;
    int size = WIDTH / 3;
    Random random = new Random(255);
    drawMeThis(graphics, x, y, size);


  }

  public static void drawMeThis(Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.black);
    graphics.fillRect(x, y, size, size);


    if (size > 10) {
      drawMeThis(graphics, x - size * 2 / 3, y + size / 3, size / 3);
      drawMeThis(graphics, x + size + size / 3, y + size / 3, size / 3);
      drawMeThis(graphics, x + size / 3, y - size * 2 / 3, size / 3);
      drawMeThis(graphics, x + size / 3, y + size + size / 3, size / 3);
      drawMeThis(graphics, x - size * 2 / 3, y - size * 2 / 3, size / 3);
      drawMeThis(graphics, x - size * 2 / 3, y + size + size / 3, size / 3);
      drawMeThis(graphics, x + size + size / 3, y - size * 2 / 3, size / 3);
      drawMeThis(graphics, x + size + size / 3, y + size + size / 3, size / 3);


    }
  }

  // Don't touch the code below
  static int WIDTH = 700;
  static int HEIGHT = 700;

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

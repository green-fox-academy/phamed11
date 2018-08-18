package com.greenfoxacademy;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Random;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics) {
    Random random = new Random(255);
//    graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
    graphics.setColor(Color.black);
    int xStartingPointX = WIDTH / 3;
    int yStartingPointY = HEIGHT / 3;
    int size = 200;
    graphics.drawRect(0, 0, WIDTH, HEIGHT);
    graphics.fillRect(xStartingPointX, yStartingPointY, size, size);
    graphics.fillRect(xStartingPointX - 2 * (xStartingPointX / 3), yStartingPointY + size / 3, size / 3, size / 3);
    graphics.fillRect(xStartingPointX - 2 * (xStartingPointX / 3), 2 * yStartingPointY + yStartingPointY / 3, size / 3, size / 3);
    graphics.fillRect(xStartingPointX - 2 * (xStartingPointX / 3), yStartingPointY - (2 * yStartingPointY / 3), size / 3, size / 3);
    graphics.fillRect(WIDTH /2 - size / 2 / 2, yStartingPointY - (2 * yStartingPointY / 3), size / 3, size / 3);
    graphics.fillRect(WIDTH /2 - size / 2 / 2, 2 * yStartingPointY + yStartingPointY / 3, size / 3, size / 3);
    graphics.fillRect(2 * xStartingPointX + size / 3, 2 * yStartingPointY + yStartingPointY / 3, size / 3, size / 3);
    graphics.fillRect(2 * xStartingPointX + size / 3, yStartingPointY + size / 3, size / 3, size / 3);
    graphics.fillRect(2 * xStartingPointX + size / 3, yStartingPointY - (2 * yStartingPointY / 3), size / 3, size / 3);


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

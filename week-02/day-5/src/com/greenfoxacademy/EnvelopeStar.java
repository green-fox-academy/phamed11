package com.greenfoxacademy;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    int a = - 15;
    int b = - 15;
    int c = - 15;
    int d = - 15;
    for (int i = 0; i < 12; i++) {
      a += 15;
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH / 2,  a, WIDTH / 2 + a, HEIGHT / 2);
    }
    for (int i = 0; i < 12; i++) {
      b += 15;
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH / 2,  b, WIDTH / 2 - b, HEIGHT / 2);
    }
    for (int i = 0; i < 12; i++) {
      c += 15;
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH / 2,  HEIGHT - c, WIDTH / 2 + c, HEIGHT / 2);
    }
    for (int i = 0; i < 12; i++) {
      d += 15;
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH / 2,  HEIGHT - d, WIDTH / 2 - d, HEIGHT / 2);
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


package com.greenfoxacademy;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  public static void mainDraw(Graphics graphics) {

//    int x = 150;
//    int y = 0;
//    int size = 10;
//    int occurance = 1;
//    int lineNumber = 20;
//    for (int j = 0; j < lineNumber; j++) {
//      trianglerow(graphics, x, y, size, occurance);
//      x -= size / 2;
//      y += size;
//      occurance++;
    dothis(graphics, 150, 0, 10, 1, 22);

  }


  static void triangleObj(Graphics triangles, int x, int y, int size) {
    triangles.drawLine(x, y, x - size / 2, y + size);
    triangles.drawLine(x - size / 2, y + size, x + size / 2, y + size);
    triangles.drawLine(x + size / 2, y + size, x, y);
  }

  static void trianglerow(Graphics row, int x, int y, int size, int occu) {
    for (int i = 0; i < occu; i++) {
      triangleObj(row, x, y, size);
      x += size;
    }
  }


  static void dothis(Graphics piramid, int x, int y, int size, int startsWith, int linenumber) {
    for (int j = 0; j < linenumber; j++) {
      trianglerow(piramid, x, y, size, startsWith);
      x -= size / 2;
      y += size;
      startsWith++;
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







import javax.swing.*;

import java.awt.*;
import java.util.HashMap;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.

    // Create a loop that fills the canvas with rainbow colored squares.
    String colorMy = "";
    HashMap<Integer, String> szinek = new HashMap<>();
    szinek.put(0, "#9400D3");
    szinek.put(1, "#4B0082");
    szinek.put(2, "#0000FF");
    szinek.put(3, "#00FF00");
    szinek.put(4, "#FFFF00");
    szinek.put(5, "#FF7F00");
    szinek.put(6, "#FF0000");
    int size = 343;

    for (int i = 0; i < szinek.size(); i++) {
      colorMy = szinek.get(i);
      fillCenterBox(graphics, size, colorMy);
      size -= 60;


    }
  }

  public static void fillCenterBox(Graphics center, int size, String color) {
    center.setColor(Color.decode(color));
    center.fillRect((WIDTH / 2) - (size / 2), (HEIGHT / 2) - (size / 2), size, size);
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
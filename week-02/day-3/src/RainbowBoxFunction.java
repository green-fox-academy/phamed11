

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
    HashMap<Integer, String> colors = new HashMap<>();
    colors.put(0, "#9400D3");
    colors.put(1, "#4B0082");
    colors.put(2, "#0000FF");
    colors.put(3, "#00FF00");
    colors.put(4, "#FFFF00");
    colors.put(5, "#FF7F00");
    colors.put(6, "#FF0000");
    int size = 343;

    for (int i = 0; i < colors.size(); i++) {
      colorMy = colors.get(i);
      fillCenterBox(graphics, size, colorMy);
      size -= 50;
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
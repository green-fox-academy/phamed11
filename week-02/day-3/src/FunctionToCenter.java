import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.
    int x = 0;
    int y = 0;
    for (int i = 0; i < 4; i++) {
      if (i == 0) {
        for (int j = 0; j < 17; j++) {
          toCenter(graphics, x, y);
          x += 20;
        }
      } else if (i == 1) {
        for (int k = 0; k < 17; k++) {
          x = 0;
          toCenter(graphics, x, y);
          y += 20;
        }
      } else if (i == 2) {
        x = 0;
        y = 340;
        for (int k = 0; k < 17; k++) {
          toCenter(graphics, x, y);
          x += 20;
        }
      } else if (i == 3) {
        x = 340;
        y = 340;
        for (int k = 0; k < 17; k++) {
          toCenter(graphics, x, y);
          y -= 20;
        }
      }
    }
  }

  public static void toCenter(Graphics center, int x, int y) {
    center.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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
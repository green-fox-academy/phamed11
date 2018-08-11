import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    graphics.setColor(Color.black);
    int size = 40;
    int x = 0;
    int y = 0;
    int k = size;
    int l = size;
    int i = 0;
    int j = 0;


    for (i = 0; i < 4; i++) {
      for (j = 0; j < 4; j++) {
        graphics.fillRect(x, y, size, size);
        graphics.fillRect(k, l, size, size);
        x += 2 * size;
        k += 2 * size;
      }
      x -= j * 2 * size;
      k -= j * 2 * size;
      y += 2 * size;
      l += 2 * size;
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
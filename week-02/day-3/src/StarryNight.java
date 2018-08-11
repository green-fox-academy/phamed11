import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0, WIDTH,HEIGHT);
    for (int i = 0; i < 300; i++) {
      int randomR = (int) (Math.random() * 256);
      int randomG = (int) (Math.random() * 256);
      int randomB = (int) (Math.random() * 256);
      int randomX = (int) (Math.random() * WIDTH);
      int randomY = (int) (Math.random() * HEIGHT);
      graphics.setColor(new Color(randomR, randomG, randomB));
      graphics.fillRect(randomX, randomY, 5, 5);

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

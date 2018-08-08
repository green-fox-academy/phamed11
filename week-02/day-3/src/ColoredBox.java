import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    graphics.setColor(Color.green);
    graphics.drawLine(20, 20, 20, 180);
    graphics.setColor(Color.BLACK);
    graphics.drawLine(20,20, 300, 20);
    graphics.setColor(Color.red);
    graphics.drawLine(20,180,300,180);
    graphics.setColor(Color.magenta);
    graphics.drawLine(300, 20, 300, 180);



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



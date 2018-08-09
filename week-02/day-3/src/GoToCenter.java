import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.

// This is a different method with user and only one lines

//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Hello, we will draw today. Gimme a number: ");
//    int param = scanner.nextInt();
//    System.out.print("Gimme the second number: ");
//    int param2 = scanner.nextInt();
//    int param = 0;
//    int param2 = 0;
    for (int i = 1; i <= 3; i++) {
      int param = i *  100 + (int )(Math.random() * 10);
      int param2 = i +  10 + (int) (Math.random() * 10);
      centerLine(graphics, param,param2);
    }
  }
  public static void centerLine(Graphics center, int a, int b) {
    center.setColor(Color.red);
    center.drawLine(a, b, WIDTH /2, HEIGHT /2);
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
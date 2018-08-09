import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication

    for (int i = 1; i < 4; i++) {
      int size = i * 18 + 50;
      anotherSquare(graphics, size);
    }
  }

  public static void anotherSquare(Graphics square, int a) {
    int rand = 19 + (int) (Math.random() * 90);
    square.setColor(new Color(rand, rand + rand, rand));
    square.drawRect((WIDTH / 2) - (a / 2), (HEIGHT / 2) - (a / 2), a, a);
  }

  //    Don't touch the code below
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
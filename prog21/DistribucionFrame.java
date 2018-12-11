import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DistribucionFrame{
  DistribucionFrame(){
    JFrame frame = new JFrame("Border Layout");
    JButton button, button1, button2, button3, button4;
    button = new JButton("Iz");
    button1 = new JButton("right");
    button2 = new JButton("top");
    button3 = new JButton("bottom");
    button4 = new JButton("center");
    frame.add(button, BorderLayout.WEST);
    frame.add(button1, BorderLayout.EAST);
    frame.add(button2, BorderLayout.NORTH);
    frame.add(button3, BorderLayout.SOUTH);
    frame.add(button4, BorderLayout.CENTER);

    frame.setSize(500, 500);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new DistribucionFrame();
  }
}

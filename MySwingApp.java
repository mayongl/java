import javax.swing.*;
import java.awt.*;

public class MySwingApp {
  public static void main (String[] args) {
    MySwingApp app = new MySwingApp();
    app.go();
  }

  public void go() {
    JFrame frame = new JFrame();
    JButton button = new JButton("click me");
    Fong bigFont = new Font("serif", Font.BOLD, 28);
    button.setFont(bigFont);
    frame.getContentPane().add(BorderLayout.EAST, button);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}

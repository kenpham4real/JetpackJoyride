// Components
package app.Frame;
import app.Board.Board;

// Java Packages
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.*;


public class Frame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Jetpack Joyride");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.add(new Board());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize((int)screenSize.getWidth(), (int)screenSize.getHeight());
        frame.setVisible(true);
    }
}
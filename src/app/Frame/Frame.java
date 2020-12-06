package app.Frame;
import java.awt.Toolkit;
import java.awt.Dimension;


// Packages
import javax.swing.*;

import app.Board.Board;


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
package app.Board;

import app.Player.Player;

import javax.swing.*;
import java.awt.Image;
import java.awt.event.*;
import java.awt.*;

public class Board extends JPanel implements ActionListener {
    private Player player;
    private Image img;
    private Timer timer;

    public Board() {
        player = new Player();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon icon = new ImageIcon("D:/IU Study/OOP/Jetpack joyride/src/app/assets/images/background.jpg");
        img = icon.getImage();
        timer = new Timer(5, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        player.move();
        repaint();
    }

    public void paint(Graphics graphic) {
        super.paint(graphic);
        Graphics2D g2d = (Graphics2D) graphic;
        if((player.getX() - 123) % 2400 == 0){
            player.setNx(0);
        }
        if((player.getX() - 1600) % 2400 == 0){
            player.setNx2(0);
        }
        System.out.println("Starting to draw background");
        g2d.drawImage(img, 1350 - player.getNx2(), 0, null);
        if(player.getX() >= 123){
            g2d.drawImage(img, 1350 - player.getNx(), 0, null);
        }
        System.out.println("Starting to draw player");
        g2d.drawImage(player.getImage(), 75, player.getY(), null);

    }

    private class AL extends KeyAdapter {
        public void keyReleased(KeyEvent event) {
            player.keyReleased(event);
        }

        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
    }

}

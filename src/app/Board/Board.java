package app.Board;

import app.Board.Paint.PaintPlayer.PaintPlayer;
import app.Obstacles.Coin.Coin;
import app.Player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener {
    private Player player;
    private Image img;
    private Timer timer;
    private Coin coin;

    public Board() {
        player = new Player();
        coin = new Coin();
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

    @Override
    public void paint(Graphics graphic) {
        super.paint(graphic);

        PaintPlayer currPlayer = new PaintPlayer(graphic, player, img);
        currPlayer.paintPlayer();
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

package app.Board.Paint.PaintPlayer;

import javax.swing.*;

import app.Player.Player;

import java.awt.*;

public class PaintPlayer {

    private Graphics2D g2dGraphics;
    private Player player;
    private Image img;

    public PaintPlayer(Graphics graphic, Player inPlayer, Image inImg) {
        g2dGraphics = (Graphics2D) graphic;
        player = inPlayer;
        img = inImg;
    }

    public void paintPlayer() {

        if ((player.getX() - 123) % 2400 == 0) {
            player.setNx(0);
        }
        if ((player.getX() - 1600) % 2400 == 0) {
            player.setNx2(0);
        }
        System.out.println("Starting to draw background");
        g2dGraphics.drawImage(img, 1350 - player.getNx2(), 0, null);
        if (player.getX() >= 123) {
            g2dGraphics.drawImage(img, 1350 - player.getNx(), 0, null);
        }
        System.out.println("Starting to draw player");
        g2dGraphics.drawImage(player.getImage(), 75, player.getY(), null);
    }
}

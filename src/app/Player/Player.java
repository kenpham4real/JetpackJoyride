package app.Player;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Player {
    private int x, y, dx, dy, nx, nx2;;
    private Image still;

    public Player(){
        ImageIcon icon = new ImageIcon("D:/IU Study/OOP/Jetpack joyride/src/app/assets/images/BarrySteakfries.png");
        this.still = icon.getImage();
        this.x = 75;
        this.nx2 = 1350;
        this.nx = 0;
        this.y = 172;

    }

    public void move(){
        this.x += this.dx;
        this.nx2 += dx;
        this.nx += dx;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getNx(){
        return this.nx;
    }

    public int getNx2(){
        return this.nx2;
    }

    public void setNx2(int inNx2){
        this.nx2 = inNx2;
    }

    public void setNx(int inNx){
        this.nx = inNx;
    }

    public Image getImage(){
        return this.still;
    }

    public void keyPressed(KeyEvent event){
        int key = event.getKeyCode();

        if(key == KeyEvent.VK_LEFT) this.dx = -1;
        if(key == KeyEvent.VK_RIGHT) this.dx = 1;
    }

    public void keyReleased(KeyEvent event){
        int key = event.getKeyCode();

        if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) this.dx = 0;
    }
}

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player extends Sprite implements Commons {

    private final int START_Y = GROUND-PLAYER_HEIGHT;
    private final int START_X = BOARD_WIDTH/2;

    private final String playerImg = "src/images/player.png";

    public Player() {
        initPlayer();
    }

    private void initPlayer() {
        ImageIcon playerIcon = new ImageIcon(playerImg);

        setImage(playerIcon.getImage());
        setX(START_X);
        setY(START_Y);
    }

    public void act() {
        x += dx;
        if (x <= 0) {
            x = 0;
        }
        if (x >= BOARD_WIDTH - PLAYER_WIDTH) {
            x = BOARD_WIDTH - PLAYER_WIDTH;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -3;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 3;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }
}

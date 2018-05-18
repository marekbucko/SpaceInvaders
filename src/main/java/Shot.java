import javax.swing.ImageIcon;

public class Shot extends Sprite implements Commons {

    private final String shotImg = "src/images/shot.png";

    public Shot() {
    }

    public Shot(int x, int y) {
        initShot(x, y);
    }

    private void initShot(int x, int y) {

        ImageIcon shotImage = new ImageIcon(shotImg);
        setImage(shotImage.getImage());

        setX(x + PLAYER_WIDTH/2);
        setY(y - PLAYER_HEIGHT/2);
    }
}

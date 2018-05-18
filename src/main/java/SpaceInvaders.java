import java.awt.EventQueue;
import javax.swing.*;


public class SpaceInvaders extends JFrame implements Commons {

    public SpaceInvaders() {

        initUI();
    }

    private void initUI() {

        setTitle("Space Invaders");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new Board());

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SpaceInvaders ex = new SpaceInvaders();
            ex.setVisible(true);
        });
    }
}


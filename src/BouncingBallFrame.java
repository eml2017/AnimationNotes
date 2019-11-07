import javax.swing.*;
import java.awt.*;

public class BouncingBallFrame extends JFrame {
    public BouncingBallFrame() {
        super("Graphics Fun");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        setVisible(true);
        setUpUI();
        pack();
    }

    public void setUpUI() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
    }
}
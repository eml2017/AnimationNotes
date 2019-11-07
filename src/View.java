import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    public View() {
        super("Bouncing Ball");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        setVisible(true);
        getContentPane().add(new JPanel());
        pack();
    }
}
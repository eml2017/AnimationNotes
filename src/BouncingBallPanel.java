import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class BouncingBallPanel extends JPanel {
    BouncingBallFrame bouncingBallFrame;
    final int DIAMETER = 40;

    public BouncingBallPanel(BouncingBallFrame bouncingBallFrame) {
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        Ellipse2D.Double ball = new Ellipse2D.Double(0, 0, DIAMETER, DIAMETER);
        g2.fill(ball);
    }
}
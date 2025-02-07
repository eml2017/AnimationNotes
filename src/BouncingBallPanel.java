import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class BouncingBallPanel extends JPanel {
    View view;
    final int DIAMETER = 40;
    // Upper left-hand corner
    int x = 0;
    int y = 0;
    // dx and dy represent where the ball is going
    int dx = 2;
    int dy = 2;

    // Animation
    // Change in graphics over time
    // We need to use a timer
    // It's listener is ActionListener!
    static final int DELAY = 10; // Milliseconds (1000 milliseconds = 1 second)
    Timer timer;

    public BouncingBallPanel() {
        // Takes in 1. the time between firings (delay) and 2. a reference to ActionListener
        //      Called every time Timer fires (every DELAY number of millisecond)
        timer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Update the paintComponent
                repaint();
            }
        });
        // DON'T FORGET TO START THE TIMER
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);

        // Right bounds
        if (x > getWidth() - DIAMETER) {
            dx = -Math.abs(dx);
        }
        // Bottom bounds
        if (y > getHeight() - DIAMETER) {
            dy = -Math.abs(dy);
        }
        // Left bounds
        if (x < 0) {
            dx = Math.abs(dx);
        }
        // Top bounds
        if (y < 0) {
            dy = Math.abs(dy);
        }
        // Otherwise, just keep going
        x += dx;
        y += dy;

        Ellipse2D.Double ball = new Ellipse2D.Double(x, y, DIAMETER, DIAMETER);
        g2.fill(ball);
    }
}
package plotnick.physics;

import javax.swing.*;
import java.awt.*;

public class GravityComponent extends JComponent
{
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawLine(0,0, getWidth(), getHeight());
        g.fillOval(30,45,20,20);
        //TODO draw a line that represents the trajectory of the ball
        //use drawOval or fillOval - for the points
    }
}

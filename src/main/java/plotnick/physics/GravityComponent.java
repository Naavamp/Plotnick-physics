package plotnick.physics;

import javax.swing.*;
import java.awt.*;

public class GravityComponent extends JComponent
{
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //g.fillOval(200,5 , 10, 10);

        double x = getWidth();
        double y = getHeight();
        int T = 5;

        Force gravity = new Force(0, -9.8);
        Force f1 = new Force(37.0365, 28.9360);
        Force scaledGravity = gravity.scale(0.001);


        for(double i = 0; i < T; i += 0.001)
        {
            f1 = f1.add(scaledGravity);
            Force scaledF1 = f1.scale(0.001);
            x -= scaledF1.getX() ;
            y -= scaledF1.getY()  ;
            g.fillOval((int) x , (int) y ,5,5);

        }
    }
}

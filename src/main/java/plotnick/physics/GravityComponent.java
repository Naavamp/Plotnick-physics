package plotnick.physics;

import javax.swing.*;
import java.awt.*;

public class GravityComponent extends JComponent
{
    private Force force = new Force(37.0365, 28.9360);
    private Projectile projectile = new Projectile(force, 0, 0);
    private double time = 5;

    public void setForce(Force force)
    {
        this.force = force;
        projectile = new Projectile(force, 0, 0);
        repaint();
    }

    public void setTime(double time)
    {
        this.time = time;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);



        g.setColor(new Color(150, 200, 255));
        for (int i = 0; i < getWidth(); i += 20)
        {
            g.drawLine(i, 0, i, getHeight());
        }
        for (int i = getHeight(); i > 0; i -= 20)
        {
            g.drawLine(0, i, getWidth(), i);
        }

        g.translate(0, getHeight());

        g.setColor(Color.black);

        projectile.apply(.001);


        g.drawOval((int) projectile.getX() , (int) -projectile.getY(), 1, 1);

        double apexX = projectile.getApexX();
        double apexY = projectile.getApexY();

        g.setColor(Color.RED);
        g.drawOval((int) apexX, (int) -apexY, 5, 5);

        // Force vector
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, (int) force.getX(), (int) - force.getY());


    }
}


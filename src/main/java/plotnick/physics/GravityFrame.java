package plotnick.physics;

import javax.swing.*;
import java.awt.*;

public class GravityFrame extends JFrame
{

    public GravityFrame()
    {
        setSize(500,500);
        setTitle("Gravity Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        add(new GravityComponent(), BorderLayout.CENTER);

    }

    public static void main(String[] args)
    {
        GravityFrame frame = new GravityFrame();
        frame.setVisible(true);
    }

}

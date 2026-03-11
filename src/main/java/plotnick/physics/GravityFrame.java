package plotnick.physics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GravityFrame extends JFrame
{

    public GravityFrame()
    {
        setSize(500, 500);
        setTitle("Gravity Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());

        final JLabel xLabel = new JLabel("Force x");
        JTextField xField = new JTextField("37.0365");
        final JLabel yLabel = new JLabel("Force y");
        JTextField yField = new JTextField("28.9360");
        final JLabel timeLabel = new JLabel("Time");
        JTextField timeField = new JTextField("5.0");
        final JLabel ApexLabel = new JLabel();

        final JButton button = new JButton("Draw");

        JLabel angleLabel = new JLabel();
        JLabel magnitudeLabel = new JLabel();

        GravityComponent gravityComponent = new GravityComponent();

        GravityController gravityController = new GravityController(
                gravityComponent, xField, yField, timeField,
                angleLabel, magnitudeLabel, ApexLabel);



        gravityComponent.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                gravityController.updateForce(e.getX(), gravityComponent.getHeight() - e.getY());

            }

            @Override
            public void mousePressed(MouseEvent e)
            {


            }

            @Override
            public void mouseReleased(MouseEvent e)
            {

            }

            @Override
            public void mouseEntered(MouseEvent e)
            {

            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }
        });

        gravityComponent.addMouseMotionListener(new MouseMotionListener()
        {
            @Override
            public void mouseDragged(MouseEvent e)
            {
                gravityController.updateForce(e.getX(), gravityComponent.getHeight() - e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e)
            {

            }
        });

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gravityController.updateForce(
                        Double.parseDouble(xField.getText()),
                        Double.parseDouble(yField.getText())
                );
            }
        });

        GridBagConstraints  constraints;

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.ipadx = 10;
        add(new JLabel("ForceX"), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add((xField), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(new JLabel("ForceY"), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;
        add((yField), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(new JLabel("Time"), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        add((timeField), constraints);


        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 3;
        add(new JLabel("Angle"), constraints);


        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 3;
        add((angleLabel), constraints);


        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 4;
        add(new JLabel("Magnitude"), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 4;
        add((magnitudeLabel),constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 5;
        add(new JLabel("Apex"), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 5;
        add((ApexLabel), constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.anchor = GridBagConstraints.NORTH;
        add((button), constraints);


        constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridheight = 7;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.BOTH;


        add(gravityComponent, constraints);


        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                gravityComponent.repaint();
                try
                {
                    Thread.sleep(16);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException();
                }
            }

        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void main(String[] args)
    {
        GravityFrame frame = new GravityFrame();
        frame.setVisible(true);
    }

}

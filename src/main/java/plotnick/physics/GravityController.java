package plotnick.physics;

import javax.swing.*;

public class GravityController
{
    private GravityComponent gravityComponent;
    private JTextField xFeild;
    private JTextField yFeild;
    private JTextField timeFeild;
    private JLabel angleLabel;
    private JLabel magnitudeLabel;
    private JLabel apexLabel;

    public GravityController(GravityComponent gravityComponent, JTextField xFeild, JTextField yFeild, JTextField timeFeild,
                             JLabel angleLabel, JLabel magnitudeLabel, JLabel Apex)
    {
        this.gravityComponent = gravityComponent;
        this.xFeild = xFeild;
        this.yFeild = yFeild;
        this.timeFeild = timeFeild;
        this.angleLabel = angleLabel;
        this.magnitudeLabel = magnitudeLabel;
        this.apexLabel = Apex;


    }

    public void updateForce(double x, double y)
    {
        Force force = new Force(x,y);
        gravityComponent.setForce(force);
        gravityComponent.setTime(Double.parseDouble(timeFeild.getText()));
        xFeild.setText(String.valueOf(force.getX()));
        yFeild.setText(String.valueOf(force.getY()));
        angleLabel.setText("Angle (Degrees): " + force.getDegrees());
        magnitudeLabel.setText("Magnitude " + force.getMagnitude());
        apexLabel.setText(String.valueOf(force.getApex()));

    }


}

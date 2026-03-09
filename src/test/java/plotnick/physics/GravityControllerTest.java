package plotnick.physics;


import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.mockito.Mockito.*;

public class GravityControllerTest
{
    //goal to test that all the methods on the corrects fields are called
    // use mockito mocking framework for junit test - creates mock objects

    @Test
    void updateForce()
    {
        //given
        GravityComponent gravityComponent = mock();
        JTextField xField = mock();
        JTextField yField = mock();
        JTextField timeFeild = mock();
        doReturn("5").when(timeFeild).getText();
        JLabel angleLabel = mock();
        JLabel magnitudeLabel = mock();
        GravityController controller = new GravityController(gravityComponent, xField, yField, timeFeild, angleLabel, magnitudeLabel);


        //when
        controller.updateForce(7, 5);

        //then
        verify(gravityComponent).setForce(new Force(7, 5));
        verify(gravityComponent).setTime(5);
        verify(xField).setText("7.0");
        verify(yField).setText("5.0");
        verify(angleLabel).setText("Angle (Degrees): 35.53767779197438");
        verify(magnitudeLabel).setText("Magnitude: 8.602325267042627");

    }
}

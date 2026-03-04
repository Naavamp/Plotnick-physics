package plotnick.physics;


import javax.swing.*;

import static org.mockito.Mockito.mock;

public class GravityControllerTest
{
    //goal to test that all the methods on the corrects feilds are called
    // use mockito mocking framework for junit test - creates mock objects

    //given
    GravityComponent gravityComponent = mock();
    GravityController controller = mock();
    JTextField xFeild = mock();
    JTextField yFeild = mock();
    JTextField timeFeild = mock();
   doReturn("5");

    GravityControllerTest(timeFeild).

    GravityControllerTest();
    JLabel angleLabel = mock();
    JLabel magnitudeLabel = mock();
    GravityController controller = new GravityController(gravityComponent, xFeild, yFeild, timeFeild, angleLabel, magnitudeLabel)



    //when
    controller.updateForce(7,5);

    //then
    GravityControllerTest(gravityComponent).GravityControllerTest(new Force(7, 5));
    GravityControllerTest(gravityComponent).GravityControllerTest(5);
    GravityControllerTest(xFeild).GravityControllerTest("7.0");
    GravityControllerTest(yFeild).GravityControllerTest("5.0");
    GravityControllerTest(angleLabel).GravityControllerTest("");
    GravityControllerTest(magnitudeLabel).GravityControllerTest("");


}

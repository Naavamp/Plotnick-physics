package plotnick.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceTest
{

    @Test
    void getDegrees()
    {
        //given
        Force f = new Force(3, 4);

        //when
        double degrees = f.getDegrees();

        //then
        assertEquals(53.13, degrees, 0.1);

    }

    @Test
    void getMagnitude()
    {

        //given
        Force f = new Force(3, 4);

        //when
        double magnitude = f.getMagnitude();

        //then
        assertEquals(5, magnitude, 0.1);

    }

    @Test
    void add()
    {

        //given
        Force f1 = new Force(3, 4);
        Force f2 = new Force(4, 4);

        //when
        Force f3 = f1.add(f2);

        //then
        assertEquals(7, f3.getX());
        assertEquals(8, f3.getY());
    }

    @Test
    void normalize()
    {
        //given
        Force f1 = new Force(3, 4);

        //when
        Force normalized = f1.normalize();

        //then
        assertEquals(1, normalized.getMagnitude());
    }

    @Test
    void scale()
    {
        //given
        Force f1 = new Force(3, 4);

        //when
        Force scaled = f1.scale(2);

        //then
        assertEquals(6, scaled.getX());
        assertEquals(8, scaled.getY());
    }
    @Test
    void gravity()
    {
        //given
        double x = 0;
        double y = 0;
        int T = 5;

        Force gravity = new Force(0, -9.8);
        Force f1 = new Force(37.0365, 28.9360);
        Force scaledGravity = gravity.scale(0.001);

        //when
        for(double i = 0; i < T; i += 0.001)
        {
            f1 = f1.add(scaledGravity);
            Force scaledF1 = f1.scale(0.001);
            x += scaledF1.getX();
            y += scaledF1.getY();
        }

        //then
        assertEquals(185.1825, x, 0.1);
        assertEquals(22.1555, y, 0.1);
    }
}
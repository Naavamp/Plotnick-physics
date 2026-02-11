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
}
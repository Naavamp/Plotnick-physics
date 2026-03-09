package plotnick.physics;

import java.util.Objects;

public class Force
{
    private double x;
    private double y;

    public Force(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }


    public double getY()
    {
        return y;
    }


    double getDegrees()
    {
        double radians = Math.atan2(y, x);
        return Math.toDegrees(radians);

    }

    double getMagnitude()
    {
        double xsqrd = x * x;
        double ysqrd = y * y;
        return Math.sqrt(xsqrd + ysqrd);
    }

    double getApex()
    {
        double apex = (y * y) / (2 * 9.8);
        return apex;
    }

    /**
     * divide each component by the magnitude and run again
     *
     * @return a new Force proportionate to this force where the magnitude is one
     */
    Force normalize()
    {
        double prevMagnitude = getMagnitude();
        double newX = x / prevMagnitude;
        double newY = y / prevMagnitude;

        return new Force(newX, newY);
    }



    /**
     *
     * @return a new Force with x and y multiply by scale
     */
    Force scale(double scale)
    {
        return new Force(this.x * scale, this.y * scale);
    }

    Force add(Force f)
    {
        return new Force(this.x + f.x, this.y + f.y);
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;
        Force force = (Force) o;
        return Double.compare(x, force.x) == 0 && Double.compare(y, force.y) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(x, y);
    }
}

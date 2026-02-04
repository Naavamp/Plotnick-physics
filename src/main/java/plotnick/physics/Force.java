package plotnick.physics;

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
     * @return a new Force with x and y multipled by scale
     */

    Force scale(double scale)
    {
        return new Force(this.x * scale, this.y * scale);

    }


    Force add(Force f)
    {

        return new Force(this.x + f.x, this.y + f.y);
    }

}

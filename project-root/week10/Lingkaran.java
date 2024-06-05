//IlhamAhmadi
//A11.2022.14460

package week10;

public class Lingkaran
{
    private int radius;
    private static double pi = 3.14;

    public Lingkaran(int radius)
    {
        this.radius = radius;
    }

    public double luas()
    {
        return radius*radius*pi;
    }

    public double keliling(){
        return 2 * 3.14 * radius;
    }

    public int getRadius()
    {
        return radius;
    }
}
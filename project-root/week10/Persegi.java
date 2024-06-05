//IlhamAhmadi
//A11.2022.14460

package week10;

public class Persegi extends BangunDatar {

    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    //@Override
    public double luas() {
        return sisi * sisi;
    }

    //@Override
    public double luas(int a) {
        return a * a;
    }

    //@Override
    public double keliling() {
        return 4 * sisi;
    }

    //@Override
    public double keliling(int a) {
        return 4 * a;
    }

    public int getSisi() {
        return this.sisi;
    }
}

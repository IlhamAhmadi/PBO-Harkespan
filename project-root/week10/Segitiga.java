//IlhamAhmadi
//A11.2022.14460

package week10;

public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double luas(int a) {
        // Misalkan a adalah sisi alas dengan tinggi tetap
        return 0.5 * a * tinggi;
    }

    @Override
    public double keliling() {
        // Misalkan ini adalah segitiga sama kaki
        double sisiMiring = Math.sqrt((alas / 2.0) * (alas / 2.0) + tinggi * tinggi);
        return 2 * sisiMiring + alas;
    }

    @Override
    public double keliling(int a) {
        // Misalkan a adalah sisi alas dari segitiga sama kaki
        double sisiMiring = Math.sqrt((a / 2.0) * (a / 2.0) + tinggi * tinggi);
        return 2 * sisiMiring + a;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getAlas() {
        return alas;
    }
}

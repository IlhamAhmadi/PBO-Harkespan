//IlhamAhmadi
//A11.2022.14460


package week10;

public class PersegiPanjang extends BangunDatar {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double luas(int a) {
        // Misalkan a adalah panjang, dan lebar tetap sama
        return a * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double keliling(int a) {
        // Misalkan a adalah panjang, dan lebar tetap sama
        return 2 * (a + lebar);
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
}

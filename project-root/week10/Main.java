//IlhamAhmadi
//A11.2022.14460

package week10;

public class Main{
    public static void main(String[] args){
        Persegi persegi = new Persegi (4);
        Lingkaran lingkaran = new Lingkaran (10);
        Segitiga segitiga = new Segitiga(10, 5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
        System.out.println("Ini Persegi");
        System.out.println("Luas tanpa parameter: " + persegi.luas());
        System.out.println("Luas dengan parameter: " + persegi.luas(4));
        System.out.println("Keliling tanpa parameter: " + persegi.keliling());
        System.out.println("Keliling dengan parameter: " + persegi.keliling(4));
        System.out.println("Ini Segitiga");
        System.out.println("Luas tanpa parameter: " + segitiga.luas());
        System.out.println("Luas dengan parameter: " + segitiga.luas(10));
        System.out.println("Keliling tanpa parameter: " + segitiga.keliling());
        System.out.println("Keliling dengan parameter: " + segitiga.keliling(10));
        System.out.println("Ini Lingkaran");
        System.out.println("Luas tanpa parameter: " + lingkaran.luas());
        //System.out.println("Luas dengan parameter: " + lingkaran.luas(10));
        System.out.println("Keliling tanpa parameter: " + lingkaran.keliling());
        //System.out.println("Keliling dengan parameter: " + lingkaran.keliling(10));
        System.out.println("\nPersegi Panjang");
        System.out.println("Luas tanpa parameter: " + persegiPanjang.luas());
        System.out.println("Luas dengan parameter: " + persegiPanjang.luas(10));
        System.out.println("Keliling tanpa parameter: " + persegiPanjang.keliling());
        System.out.println("Keliling dengan parameter: " + persegiPanjang.keliling(10));
    }
}
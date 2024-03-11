package week_1;

public class Hitung {

	public static void main(String[] args) {
		//keliling lingkaran
		double diameterLingkaran = 35;
		double jariJari = diameterLingkaran / 2;
		double kelilingLingkaran = Math.PI * diameterLingkaran;
		System.out.println("Keliling lingkaran adalah: " + kelilingLingkaran);
		
		//luas segitiga siku-siku
		double alasSegitiga = 9;
		double tinggiSegitiga = 21;
		double luasSegitiga = (alasSegitiga * tinggiSegitiga) / 2;
		System.out.println("Luas segitiga siku-siku adalah: " + luasSegitiga);
		
		//volume tabung
		double diameterTabung = 7;
		double tinggiTabung = 15;
		double jariJariTabung = diameterTabung / 2;
		double volumeTabung = Math.PI * Math.pow(jariJariTabung, 2) * tinggiTabung;
		System.out.println("Volume tabung adalah: " + volumeTabung);

	}

}

package TUGAS;
import java.util.Scanner;
public class Tugas7Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Tugas7 tg = new Tugas7();

		System.out.print("\nMasukkan jumlah mahasiswa : ");
		tg.jumlah = sc.nextInt();

		Tugas7[] nilai = new Tugas7[tg.jumlah];

		for (int i = 0; i < nilai.length ; i++) {
			nilai[i] = new Tugas7();

			System.out.println("\nMahasiswa ke-" + (i+1) + " : ");
			System.out.print("Masukkan Nilai ke 1 : ");
			nilai[i].nilai1 = sc.nextInt();
			System.out.print("Masukkan Nilai ke 2 : ");
			nilai[i].nilai2 = sc.nextInt();
		}

		System.out.println();

		for (int i = 0; i < nilai.length ; i++) {
			System.out.println("Nilai Terbaik Mahasiswa ke-" + (i+1) + " : " + tg.max(nilai[i].nilai1 , nilai[i].nilai2));
		}


	}
}

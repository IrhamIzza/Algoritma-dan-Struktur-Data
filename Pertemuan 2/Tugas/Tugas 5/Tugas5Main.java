package TUGAS;
import java.util.Scanner;
public class Tugas5Main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tugas5 tg = new Tugas5();

		Tugas5[] jajar = new Tugas5[5];

		for (int i = 0 ; i < jajar.length ; i++) {
			jajar[i] = new Tugas5();

			System.out.println("JajarGenjang ke-" + (i+1));
			System.out.print("Masukkan panjang alas ke-" + (i+1) + " : ");
			jajar[i].panjang = input.nextInt();
			System.out.print("Masukkan tinggi ke-" + (i+1) + " : ");
			jajar[i].tinggi = input.nextInt();
			System.out.print("Masukkan panjang Sisi Miring ke-" + (i+1) + " : ");
			jajar[i].sisiMiring = input.nextInt();

			System.out.println("\n");

		}

		for (int i = 0; i < jajar.length ; i++) {
			System.out.println("\nJajarGenjang ke-" + (i+1));
			System.out.println("Luas = " + tg.hitungLuas(jajar[i].panjang , jajar[i].tinggi));
			System.out.println("Keliling = " + tg.hitungKeliling(jajar[i].panjang , jajar[i].sisiMiring));
		}


	}
}

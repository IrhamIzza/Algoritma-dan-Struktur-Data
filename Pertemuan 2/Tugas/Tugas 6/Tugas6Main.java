package TUGAS;
import java.util.Scanner;
public class Tugas6Main {
    	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		Tugas6 tg = new Tugas6();

		System.out.print("Masukkan jumlah tanah : ");
		tg.jumlah = input.nextInt();
		
		Tugas6[] tanah = new Tugas6[tg.jumlah];

		for (int i = 0; i < tanah.length ; i++) {
			tanah[i] = new Tugas6();

			System.out.print("\nMasukkan panjang Tanah ke-" + (i+1) + " : ");
			tanah[i].panjang = input.nextInt();
			System.out.print("Masukkan lebar Tanah ke-" + (i+1) + " : ");
			tanah[i].lebar = input.nextInt();

		}

		System.out.println();

		for (int i = 0; i < tanah.length ; i++) {
			System.out.println("Luas Tanah ke-" + (i+1) + " : " + tg.luasTanah(tanah[i].panjang , tanah[i].lebar));
		}



	}
}

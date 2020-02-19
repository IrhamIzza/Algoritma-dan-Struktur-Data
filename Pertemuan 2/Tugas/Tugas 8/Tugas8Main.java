package TUGAS;
import java.util.Scanner;
public class Tugas8Main {
    public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Tugas8 tg = new Tugas8();
		tg.control = 0;

		System.out.print("Masukkan jumlah tanah : ");
		tg.jumlah = input.nextInt();
		
		Tugas8[] tanah = new Tugas8[tg.jumlah];

		for (int i = 0; i < tanah.length ; i++) {
			tanah[i] = new Tugas8();

			System.out.print("\nMasukkan panjang Tanah ke-" + (i+1) + " : ");
			tanah[i].panjang = input.nextInt();
			System.out.print("Masukkan lebar Tanah ke-" + (i+1) + " : ");
			tanah[i].lebar = input.nextInt();

		}

		System.out.println();

		for (int i = 0; i < tanah.length ; i++) {
			System.out.println("Luas Tanah ke-" + (i+1) + " : " + tg.luasTanah(tanah[i].panjang , tanah[i].lebar));
		}

		tg.max = tg.luasTanah(tanah[0].panjang , tanah[0].lebar);

		
 		for (int i = 0; i < tanah.length ; i++) {
 			if (tg.luasTanah(tanah[i].panjang , tanah[i].lebar) > tg.max) {
 				tg.max = tg.luasTanah(tanah[i].panjang , tanah[i].lebar);
 				tg.control = i;
 			}
 		}

 		System.out.println("\nTanah yang terluas adalah tanah ke-" + (tg.control+1));
 		


	}
}

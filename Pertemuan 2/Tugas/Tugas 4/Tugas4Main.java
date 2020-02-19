package TUGAS;
import java.util.Scanner;
public class Tugas4Main {
    static Scanner input = new Scanner(System.in);
		
	public static void setting(){
		System.out.println("Game PacMan : ");
		System.out.println("w = bergerak ke atas");
		System.out.println("s = bergerak ke bawah");
		System.out.println("a = bergerak ke kiri");
		System.out.println("d = bergerak ke kanan");
		
	}

	public static void warning(){
		System.out.println("\n\nMohon Input anda salah !!!\n\n");
		input();

	}

	public static void over(){
		System.out.println("\n\nKoordinat tidak boleh kurang dari 0 !!!\n\n");
		input();
	}

	public static void input(){
		Tugas4 tg = new Tugas4();
		tg.width = 5;
		tg.height = 5;

		setting();
		System.out.print("\nMasukkan kontrol : ");
		tg.select = input.nextLine() .toLowerCase();

		switch (tg.select) {
			case "w": 
						if ((tg.y-1) < 0) {
							over();
						}
			break;
			case "s":
						if ((tg.y + 1) >= tg.width) {
							over();
						}
						
			break;
			case "a":	
						if ((tg.x-1) < 0) {
							over();
						}
			break;
			case "d":
						if ((tg.x + 1) >= tg.height) {
							over();
						}						
			break;
			default:
		}

		switch(tg.select){
			case "w" : tg.moveUp();
			break;
			case "s" : tg.moveDown();
			break;
			case "a" : tg.moveLeft();
			break;
			case "d" : tg.moveRight();
			break;
			default: warning();
		}

		tg.printPosition();
		System.out.println("Titik Koordinat adalah (" + tg.x + " , " + tg.y + ")");
		input();
	}

	public static void main(String[]args){
		input();
	}
}

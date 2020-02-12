package Pertanyaan;
import java.util.Scanner;
/**
 * Nama     : Irham Izza S
 * Kelas    : TI 1F
 * NIM      : 1941720129
 */
public class Pseudocode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        
        System.out.println("ALGORITMA");
        System.out.print("Masukkan nilai y: ");
        y=sc.nextInt();
        if (y%2==0 && 7%6!=0 && y%15!=0){
            System.out.println("Bilangan kelipatan 2");
        }
        else if (y%6==0 && y%15!=0) {
            System.out.println("Bilangan kelipatan 6");
        }
        else if (y%15==0) {
            System.out.println("Bilangan kelipatan 15");
        }
        else {
            System.out.println("Bilangan bukan kelipatan 2,6,ataupun 15");
        }
    }
}

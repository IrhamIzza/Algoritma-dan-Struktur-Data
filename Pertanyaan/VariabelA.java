package Pertanyaan;
import java.util.Scanner;
/**
 * Nama     : Irham Izza S
 * Kelas    : TI 1F
 * NIM      : 1941720129
 */
public class VariabelA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.print("Masukkan nilai A: ");
        a = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            a -= 3;
            System.out.println("A - 3 = " + a);
        }
        if (a%2 == 0) {
            System.out.println("Nilai A Genap");
        }
        else {
            System.out.println("Nilai A Ganjil");
        }
    }
}

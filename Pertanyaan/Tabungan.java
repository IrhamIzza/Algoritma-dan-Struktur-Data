package Pertanyaan;
import java.util.Scanner;
/**
 * Nama     : Irham Izza S
 * Kelas    : TI 1F
 * NIM      : 1941720129
 */
public class Tabungan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo;
        double bunga;
        
        System.out.println("Saldo bank selama 12 bulan dengan bunga 2%");
        System.out.print("Masukkan saldo awal: Rp ");
        saldo = sc.nextInt();
        System.out.println("Saldo bulan ke-1: Rp" + saldo);
        for (int i = 2; i <= 12; i++) {
            bunga = saldo * 0.02;
            saldo += bunga;
            System.out.println("Saldo bulan ke-" + (i) + ": Rp" + saldo);
        }
    }
}

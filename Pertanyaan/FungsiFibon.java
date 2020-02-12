package Pertanyaan;
import java.util.Scanner;
/**
 * Nama     : Irham Izza S
 * Kelas    : TI 1F
 * NIM      : 1941720129
 */
public class FungsiFibon {
    
    public static void main(String[] args) {
        Scanner awang = new Scanner(System.in);
        int angka, hitung1 = 0, hitung2 = 1, hitung;
        System.out.print("Masukan Angka : ");
        angka = awang.nextInt();
        System.out.println("Hasil bilangan fibonacci: ");
        for (int i = 0; i < angka; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            hitung = hitung1 + hitung2;
            System.out.println(hitung1 + " + " + hitung2 + " = " + hitung);
            hitung1 = hitung2;
            hitung2 = hitung;
        }
        System.out.println("Hasil bilangan fibonacci: ");
        for (int i = 0; i < angka; i++) {
            int hasil = fibonacci(i);
            System.out.print(hasil + " ");
        }
    }

    static int fibonacci(int angka) {
        if (angka == 0 || angka == 1) {
            return angka;
        } else {
            return (fibonacci(angka - 1) + fibonacci(angka - 2));
        }
    }
}

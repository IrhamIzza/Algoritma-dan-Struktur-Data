package Pertanyaan;
import java.util.Scanner;
/**
 * Nama     : Irham Izza S
 * Kelas    : TI 1F
 * NIM      : 1941720129
 */
public class Array1 {
    public static void main(String[] args) {
        Scanner awang = new Scanner(System.in);
        int angka[] = new int[15];
        int genap[] = new int[15];
        int ganjil[] = new int[15];
        int indexGanjil = 0, indexGenap = 0;
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukan angka : ");
            angka[i] = awang.nextInt();
        }
        for (int i : angka) {
            if (i % 2 == 0) {
                genap[indexGenap] = i;
                indexGenap += 1;
            } else {
                ganjil[indexGanjil] = i;
                indexGanjil += 1;
            }
        }
        System.out.print("Angka genap : ");
        for (int i : genap) {
            if (i==0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.print("Angka ganjil : ");
        for (int i : ganjil) {
            if (i==0){
                continue;
            }
            System.out.print(i + " ");
        }
    }

}

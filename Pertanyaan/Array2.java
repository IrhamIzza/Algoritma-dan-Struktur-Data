package Pertanyaan;
import java.util.Scanner;
/**
 * Nama     : Irham Izza S
 * Kelas    : TI 1F
 * NIM      : 1941720129
 */
public class Array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[4][5];
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.print("Masukan angka index ke-[" + i + "][" + j + "] = ");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i[] : array) {
            for (int j : i) {
                total += j;
            }
        }
        System.out.println("Total isi array : " + total);
    }
}

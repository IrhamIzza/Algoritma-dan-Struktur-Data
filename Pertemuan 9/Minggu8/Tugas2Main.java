/*
 * Nama  : Irham Izza
 * NIM   : 1941720129
 * Kelas : TI 1F
 */
package Minggu8;

import java.util.Scanner;

public class Tugas2Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat\t: ");
        String kalimat = sc.nextLine();
        String kata[] = kalimat.split("\\s+");
        Tugas2 tumpukan = new Tugas2(kata.length);

        for(int i = 0; i < kata.length; i++){
            tumpukan.push(kata[i]);
        }
        
        tumpukan.print();

        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}

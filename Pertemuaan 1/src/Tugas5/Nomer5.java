package Tugas5;
import java.util.Scanner;
public class Nomer5 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int menu;
        System.out.println("1. Menghitung Luas Segitiga");
        System.out.println("2. Menghitung Luas Segiempat");
        System.out.println("3. Menghitung Luas Lingkaran");
        System.out.print("Pilih Menu = ");
        menu=sc.nextInt();
        switch (menu) {
            case 1 :
                Segitiga();
                break;
            case 2:
                Segiempat();
                break;
            case 3:
                Lingkaran();
                break;
        }    
    }
    static void Segitiga(){
        int total,alas,tinggi;
        System.out.print("Masukkan Alas = ");
        alas = sc.nextInt();
        System.out.print("Maukkan Tinggi = ");
        tinggi = sc.nextInt();
        total = (int)(alas*tinggi)/2;
        System.out.println("Total Segitiga adalah " + total);
       
    }
    static void Segiempat(){
        int sisi1,sisi2,total;
        System.out.print("Masukkan Sisi 1 = ");
        sisi1 =sc.nextInt();
        System.out.print("Masukkan Sisi 2 = ");
        sisi2 =sc.nextInt();
        total = (int) (sisi1*sisi2);
        System.out.println("Total Segiempat adalah " + total);
    }
     static void Lingkaran(){
        int jari;
        double pi=3.14,total;
        System.out.print("Masukkan Jari-jari = ");
        jari =sc.nextInt();
        total =  (pi*(jari*jari));
        System.out.println("Total Lingkaran adalah " + total);
    }
}

package TUGAS;
import java.util.Scanner;
public class Tugas3Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Tugas3 tg = new Tugas3();
    String namaGame;
    int lamapinjam;
    tg.hargaSatuan = 50000;
    System.out.print("Masukkan Nama = ");
    tg.nama=sc.next();
    System.out.print("Masukkan Jumlah = ");
    tg.jumlah=sc.nextInt();
    
        System.out.println("Nama\t\t= "+tg.nama);
        System.out.println("Harga\t\t= "+tg.hitungHargaTotal(tg.jumlah));
        System.out.println("Diskon\t\t= "+tg.hitungDiskon());
        System.out.println("Harga Total\t= "+tg.hitungHargaBayar());
    }
    
}

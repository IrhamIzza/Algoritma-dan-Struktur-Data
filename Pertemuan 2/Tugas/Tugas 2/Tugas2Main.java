package TUGAS;
import java.util.Scanner;
public class Tugas2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tugas2 tg = new Tugas2();
        
        System.out.print("Masukkan Nomor id\t\t= ");
        tg.id=sc.nextInt();
        System.out.print("Masukkan Nama Member\t\t= ");
        tg.namaMember=sc.next();
        System.out.print("Masukkan Nama Game\t\t= ");
        tg.namaGame=sc.next();
        System.out.print("Masukkan lama pinjam\t\t= ");
        tg.lamapinjam=sc.nextInt();
        System.out.print("Masukkan Harga sewa per hari\t= ");
        tg.harga=sc.nextInt();
        
        System.out.println();
        System.out.println("Tampilkan Data Peminjam");
        System.out.println("----------------------------------");
        tg.Datapeminjaman();
        System.out.println();
        System.out.println("Harga yang harus dibayar= Rp "+tg.Bayar());
        
    }
}

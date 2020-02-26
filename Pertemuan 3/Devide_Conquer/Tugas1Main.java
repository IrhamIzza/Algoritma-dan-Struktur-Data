package Devide_Conquer;
import java.util.Scanner;
public class Tugas1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Tugas1 tg = new Tugas1();
        System.out.print("Masukkan nama\t\t= ");
        tg.namaMhs= sc.next();
        System.out.print("Masukkan Nilai tugas\t= ");
        tg.nilaiTugas=sc.nextInt();
        System.out.print("Masukkan Nilai Kuis\t= ");
        tg.nilaiKuis=sc.nextInt();
        System.out.print("Masukkan Nilai UTS\t= ");
        tg.nilaiUTS=sc.nextInt();
        System.out.print("Masukkan Nilai UAS\t= ");
        tg.nilaiUAS=sc.nextInt();
        
        System.out.println("Total Nilai = "+tg.hitungTotalNilai());
    }
}

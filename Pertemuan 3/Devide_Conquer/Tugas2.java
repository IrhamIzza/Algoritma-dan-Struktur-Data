package Devide_Conquer;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  
        System.out.print("Jumlah Mahasiswa : ");
        int mhs=sc.nextInt();
        Tugas1 [] mhsArr=new  Tugas1[mhs]; 
        
        
        for (int i = 0; i < mhs; i++) {
        System.out.println("==============================");
        mhsArr[i]=new Tugas1();
        System.out.print("Masukkan Nama Mahasiswa\t= ");
        mhsArr[i].namaMhs= sc.next();
        System.out.print("Masukkan Nilai tugas\t= ");
        mhsArr[i].nilaiTugas=sc.nextInt();
        System.out.print("Masukkan Nilai Kuis\t= ");
        mhsArr[i].nilaiKuis=sc.nextInt();
        System.out.print("Mas2ukkan Nilai UTS\t= ");
        mhsArr[i].nilaiUTS=sc.nextInt();
        System.out.print("Masukkan Nilai UAS\t= ");
        mhsArr[i].nilaiUAS=sc.nextInt();        
        System.out.println("Total Nilai\t\t= "+mhsArr[i].hitungTotalNilai());  
        }
        System.out.println("==============================");
        for (int i = 0; i < mhs; i++) {
            System.out.println("Nama Mahasiswa\t\t= "+mhsArr[i].namaMhs);
            System.out.println("Total Nilai\t\t= "+mhsArr[i].hitungTotalNilai());  
        }
    }
}

package Minggu5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        DaftarMahasiswaBerperstasi data = new DaftarMahasiswaBerperstasi();
        int jumMhs = 5;
        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama \t\t= ");
            String nama = s1.nextLine();
            System.out.print("Thn Masuk \t= ");
            int thn = s.nextInt();
            System.out.print("Umur \t\t= ");
            int umur = s.nextInt();
            System.out.print("IPK \t\t= ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama,thn,umur,ipk);
            data.tambah(m);
        }
        System.out.println("Data mahasiswa sebelum sorting = ");
        data.tampil();;
        System.out.println("Data mahasiswa setelah sorting desc bedasarkan ipk = ");
        data.bubbleSort();  
        data.tampil();;
        
        System.out.println("Data Mahasiswa setelah sorting asc Berdasar ipk = ");
        data.selection();
        data.tampil();
        
        System.out.println("Data Setelah di Insertion Sort = ");
        data.insertionSort();
        data.tampil();
    }
}

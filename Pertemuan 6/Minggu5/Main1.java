package Minggu5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        DaftarHargaTiket data = new DaftarHargaTiket();
        int jumTkt = 5;
        for (int i = 0; i < jumTkt; i++) {
            System.out.print("Maskapai \t= ");
            String Maskapai = s1.nextLine();
            System.out.print("TransitCount \t= ");
            int trns = s.nextInt();
            System.out.print("Fligth Time \t= ");
            int ft = s.nextInt();
            System.out.print("Harga \t\t= ");
            float harga = s.nextFloat();
            
            Tiket t = new Tiket(Maskapai,trns,ft,harga);
            data.tambah(t);
        }
        
        System.out.println("        HARGA TIKET         ");
        
        System.out.println("Data Tiket sebelum sorting = ");
        data.tampil();;
        System.out.println("Data Tiket sorting asc bedasarkan Harga (Bubble Sort) = ");
        data.bubbleSort(); 
        data.tampil();;
        System.out.println("Data Tiket sorting desc bedasarkan Harga (Bubble Sort) = ");
        data.bubbleSort1();  
        data.tampil();;
        
        
        System.out.println("Data Tiket sorting asc Berdasar Harga (Selection sort)= ");
        data.selection();
        data.tampil();
        System.out.println("Data Tiket sorting desc Berdasar Harga (Selection sort)= ");
        data.selection1();
        data.tampil();
        
    }
}

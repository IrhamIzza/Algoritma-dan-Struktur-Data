package Tugas2;
public class BANK {
    public static void main(String[] args) {
      double awal=1000000,akhir=1500000,uang=0,bunga=0.02;
      int bulan=1;
        for (bulan =0; awal<akhir; bulan++) {
            awal+=awal*bunga;
        }
        
        System.out.println("Bulan = "+bulan);
        System.out.println("Uang  = RP "+(int)awal);
        
    }  
}

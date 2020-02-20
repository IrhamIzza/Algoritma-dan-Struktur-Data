package Minggu1;

import Minggu2.Barang;

public class BarangMain {
    public static void main(String[] args) {
    Barang b1 = new Barang();
    b1.namaBarang = "Corsair 2 GB"; 
    b1.jenisBarang = "DDR";
    b1.hargaSatuan = 25000;
    b1.stok = 10;
    b1.tambahStok(1);
    b1.kurangStok(3);
    b1.tampilBarang();
    int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buaH = "+hargaTotal);
        
        Barang b2 = new Barang("Logitech", "Wireless Mouse", 150000, 25);
        b2.tampilBarang();
    } 
}

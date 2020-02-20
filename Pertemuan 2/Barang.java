package Minggu2;


public class Barang {
    public String namaBarang,jenisBarang;
    public int stok,hargaSatuan;
    
    public Barang(){
    
    }
    public Barang(String nm,String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    public void tampilBarang(){
        System.out.println("Nama\t= "+namaBarang);
        System.out.println("Jenis\t= "+jenisBarang);
        System.out.println("Stok\t= "+stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
    }
    public void tambahStok(int n){
        stok = stok+n;
    }
    public void kurangStok(int n){
        stok = stok-n;
    }
    public int hitungHargaTotal(int jumlah) {
        return jumlah*hargaSatuan;
    }
}


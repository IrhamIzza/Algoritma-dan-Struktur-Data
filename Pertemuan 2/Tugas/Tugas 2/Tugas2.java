package TUGAS;
public class Tugas2 {
    int id,lamapinjam,harga;
    String namaMember,namaGame;
    
    public void Datapeminjaman(){
        System.out.println("Nomor ID\t\t= "+id);
        System.out.println("Nama Member\t\t= "+namaMember);
        System.out.println("Nama Game\t\t= "+namaGame);
        System.out.println("Lama pinjam(hari)\t= "+lamapinjam);
        System.out.println("Harga sewa per hari\t= "+harga);
    }
    public int Bayar(){
        return lamapinjam*harga;
    }
}

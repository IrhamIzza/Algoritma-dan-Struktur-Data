package TestSearching;
public class SearchingMain {
    public static void main(String[] args) {
        int data[] = {10,30,40,50,60,70,80,90};
        Searching pencarian = new Searching (data,8);
        System.out.println("Isi Array :");
        pencarian.TampilData();
        int cari = 30;
        System.out.println("menggunakan sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        if (posisi != -1) {
            System.out.println("data : "+cari+"ditemaukan pada indeks "+posisi);
        }else {
            System.out.println("data "+cari+"tidak temukan");
        }
        
    }
}

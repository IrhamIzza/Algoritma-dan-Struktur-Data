package UAS;
import java.util.Scanner;
/**
 *  Nama    : Irham Izza
 *  NIM     : 1941720129
 *  Kelas   : TI-1F
 */
public class MainProgram {
    public static void menu() {
        System.out.println("============================================");
        System.out.println("                PERSEWAAN CD");
        System.out.println("============================================");
        System.out.println("Memilih Menu");
        System.out.println("1. CD Masuk");
        System.out.println("2. CD Keluar");
        System.out.println("3. CD Rusak");
        System.out.println("4. Tampilkan Semua Data");
        System.out.println("5. Pencarian CD (Berdasarkan Kode CD)");
        System.out.println("6. Keluar");
        System.out.println("============================================");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList obj = new DoubleLinkedList();
        String judul, distributor;
        int kode, stok, rusak, index, pilih = 0;
        try {
            obj.addFirst("Laskar Pelangi", "Anderea Hirata", 111, 45, 4);
            obj.addLast("Naruto Movie", "Sasuke Hatake",  112, 53, 5);
            do {
               menu();
                System.out.print("Masukkan pilihan Anda : ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("================================================");
                        System.out.println("                  CD YANG MASUK");
                        System.out.println("================================================");
                        sc.nextLine();
                        System.out.print("Masukkan Kode CD\t: ");
                        kode = sc.nextInt();
                        System.out.print("Masukkan Judul\t\t: ");
                        judul = sc.next();
                        System.out.print("Masukkan Distributor\t: ");
                        distributor = sc.next();
                        System.out.print("Masukkan Stok CD\t: ");
                        stok = sc.nextInt();
                        System.out.print("Masukkan CD Rusak\t: ");
                        rusak = sc.nextInt();
                        obj.addFirst(judul, distributor, kode, stok, rusak);
                        System.out.println("================================================");                        
                        System.out.println();
                        break;
                        
                    case 2:
                        System.out.print("Masukkan indeks yang ingin dihapus : ");
                        index = sc.nextInt();
                        obj.remove(index);
                        obj.print();
                        System.out.println("CD keluar pada indeks ke-" + index + "berhasil dihapus!");
                        System.out.println();
                        break;   
                        
                    case 3:
                        System.out.println("===========================================");
                        System.out.println("                CD YANG KELUAR");
                        System.out.println("===========================================");
                        sc.nextLine();
                        System.out.print("Masukkan Indeks\t: ");
                        index = sc.nextInt();
                        System.out.print("Masukkan Kode CD\t: ");
                        kode = sc.nextInt();
                        System.out.print("Masukkan Judul\t: ");
                        judul = sc.next();
                        System.out.print("Masukkan Distributor\t: ");
                        distributor = sc.next();
                        System.out.print("Masukkan Stok CD\t: ");
                        stok = sc.nextInt();
                        System.out.print("Masukkan CD Rusak\t: ");
                        rusak = sc.nextInt();
                        obj.add(judul, distributor, kode, stok, rusak, index);
                        obj.print();
                        System.out.println("===========================================");
                        System.out.println();
                        break;
                        
                    case 4:
                        obj.print();
                        obj.selectionSort();
                        System.out.println();
                        break;
                        
                    case 5:
                        System.out.print("Masukkan data yang ingin dicari : ");
                        kode = sc.nextInt();
                        obj.cari(kode);
                        System.out.println();
                        break;
                }
            } while(pilih != 6);
         } catch(Exception e) {
            System.out.println(e.getMessage());
         }
    }
}

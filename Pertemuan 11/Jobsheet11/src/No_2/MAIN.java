package No_2;
import java.util.Scanner;
public class MAIN {
//STUDY KASUS TENTANG ANTRIAN BANK, yang memanfaatkan queue,
 //dibuat dengan konsep linked list 
    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("Menu Antrian Nasabah Bank:");
        System.out.println("1. Tambah Antrian (Enqueue)");
        System.out.println("2. Hapus Antrian (Dequeue)");
        System.out.println("3. Print Antrian");
        System.out.println("4. Peek Front");
        System.out.println("5. Peek Rear");
        System.out.println("6. Lihat data berdasarkan Id Nasabah");
        System.out.println("7. Lihat data berdasarkan posisi antrian");
        System.out.println("8. Keluar Program");
        System.out.println("-----------------------------------------");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Daftar_Antri antri = new Daftar_Antri();

        int pilih, id, posisi;
        String nama, keperluan;

        System.out.println("Antrian Nasabah Bank");

        do {
            menu();
            pilih = sc.nextInt();
            try {
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan Id : ");
                        id = sc.nextInt();
                        System.out.print("Masukkan Nama : ");
                        nama = sc2.nextLine();
                        System.out.print("Masukkan Keperluan : ");
                        keperluan = sc2.nextLine();
                        antri.enqueue(id, nama, keperluan);
                        break;
                    case 2:
                        antri.Dequeue();
                        break;
                    case 3:
                        antri.print();
                        break;
                    case 4:
                        antri.peekFront();
                        break;
                    case 5:
                        antri.peekRear();
                        break;
                    case 6:
                        System.out.print("Masukkan Id : ");
                        id = sc.nextInt();
                        antri.peekPosition(id);
                        break;
                    case 7:
                        System.out.print("Masukkan posisi antrian : ");
                        posisi = sc.nextInt();
                        posisi -= 1;
                        antri.printNasabah(posisi);
                        break;
                    case 8:
                        System.out.println("Terimakasih telah menggunakan program ini");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih > 0 || pilih <= 8);
    }
}

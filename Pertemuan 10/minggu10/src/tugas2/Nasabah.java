/*
 * Nama  : Irham Izza
 * NIM   : 1941720129
 * Kelas : TI 1F
 */
package tugas2;
public class Nasabah {
    String noRekening, nama;
    Nasabah(String noRek, String nm){
        noRekening = noRek;
        nama = nm;
    }
    Nasabah(){
        
    }
    void print(){
        System.out.println("Nama Nasabah\t: " + nama);
        System.out.println("Rekening\t: " + noRekening);
        System.out.println("------------------------");
    }
}

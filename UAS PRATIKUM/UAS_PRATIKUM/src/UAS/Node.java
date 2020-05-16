
package UAS;
/**
 *  Nama    : Irham Izza
 *  NIM     : 1941720129
 *  Kelas   : TI-1F
 */
public class Node {
    String judul, distributor;
    int kode, stok, rusak;
    Node prev, next;
    
    Node(Node prev, String judul, String distributor, int kode, int stok, int rusak, Node next) {
        this.prev = prev;
        this.judul = judul;
        this.distributor = distributor;
        this.kode = kode;
        this.stok = stok;
        this.rusak = rusak;
        this.next = next;
    }
}

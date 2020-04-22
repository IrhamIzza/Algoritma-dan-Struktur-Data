package tugas1;
public class MHS<T> {

    T nim, nama, alamat;
    MHS<T> next;

    public MHS(T nim, T nama, T alamat, MHS<T> next) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.next = next;
    }
}

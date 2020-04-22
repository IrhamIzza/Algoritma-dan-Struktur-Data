package No_2;
public class Antri<A> {
    A id;
    A keperluan;
    A nama;
    Antri<A> next;
    
    public Antri(A id, A nama, A keperluan, Antri<A> next) {
        this.id = id;
        this.nama = nama;
        this.keperluan = keperluan;
        this.next = next;
    }
}

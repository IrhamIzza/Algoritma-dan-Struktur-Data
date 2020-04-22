package No_2;
public class Daftar_Antri {

    Antri head;
    int size;

    public Daftar_Antri() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String nama, String keperluan) {
        head = new Antri(id, nama, keperluan, head);
        size++;
    }

    public void enqueue(int id, String nama, String keperluan) {
        if (isEmpty()) {
            addFirst(id, nama, keperluan);
        } else {
            Antri tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Antri(id, nama, keperluan, null);
        }
        size++;
        System.out.println("Data berhasil ditambahkan");
    }

    public Object getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.id;
    }

    public Object getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        Antri tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.id;
    }

    public void Dequeue() throws Exception {
        System.out.println("Nasabah dengan id : " + head.id + " telah selesai antri");
        head = head.next;
        size--;
    }

    public void print() {
        if (!isEmpty()) {
            Antri tmp = head;
            while (tmp != null) {
                System.out.println("===========================================================");
                System.out.println("Id Nasabah\t: " + tmp.id);
                System.out.println("Nama Nasabah\t: " + tmp.nama);
                System.out.println("Keperluan\t: " + tmp.keperluan);
                tmp = tmp.next;
            }
            System.out.println("===========================================================");
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            Antri tmp = head;
            System.out.println("Data Nasabah pada antrian paling depan");
            System.out.println("===========================================================");
            System.out.println("Id Nasabah\t: " + tmp.id);
            System.out.println("Nama Nasabah\t: " + tmp.nama);
            System.out.println("Keperluan\t: " + tmp.keperluan);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            Antri tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            System.out.println("Data Nasabah pada antrian paling belakang");
            System.out.println("===========================================================");
            System.out.println("Id Nasabah\t: " + tmp.id);
            System.out.println("Nama Nasabah\t: " + tmp.nama);
            System.out.println("Keperluan\t: " + tmp.keperluan);
        }
    }

    public void peekPosition(int id) {
        Antri tmp = head;
        int index = 0;
        while (tmp.next != null && !tmp.id.equals(id)) {
            tmp = tmp.next;
            index++;
        }
        index += 1;
        if (tmp.id.equals(id)) {
            System.out.println("Nasabah dengan Id : " + id + " berada pada antrian ke-" + index);

        } else {
            System.out.println("Nasabah dengan Id : " + id + " tidak ada dalam antrian");
        }
    }

    public void printNasabah(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Antri tmp = head;
            for (int i = 1; i <= index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Pada antrian ke-" + (index + 1) + " terdapat data : ");
            System.out.println("========================================");
            System.out.println("Id Nasabah\t: " + tmp.id);
            System.out.println("Nama Nasabah\t: " + tmp.nama);
            System.out.println("Keperluan\t: " + tmp.keperluan);
            System.out.println("========================================");
        }
    }
}

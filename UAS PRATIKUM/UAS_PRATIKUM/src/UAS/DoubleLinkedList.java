package UAS;
/**
 *  Nama    : Irham Izza
 *  NIM     : 1941720129
 *  Kelas   : TI-1F
 */
public class DoubleLinkedList {
    Node head;
    int size;
    
    public DoubleLinkedList() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(String judul, String distributor,int kode, int stok, int rusak) {
        if (isEmpty()) {
            head = new Node(null, judul, distributor, kode, stok, rusak, null);
        } else {
            Node newNode = new Node(null, judul, distributor, kode, stok, rusak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
     public void addLast(String judul, String distributor, int kode, int stok, int rusak) {
        if (isEmpty()) {
            addFirst(judul, distributor, kode, stok, rusak);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, judul, distributor, kode, stok, rusak, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(String judul, String distributor, int kode, int stok, int rusak, int index) throws Exception {
        if (isEmpty()) {
            addFirst(judul, distributor, kode, stok, rusak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, judul, distributor, kode, stok, rusak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, judul, distributor, kode, stok, rusak, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public void clear() {
        head = null;
        size = 0;
    }
    
    public void print() {
         if(!isEmpty()){
            Node tmp = head;
            int index = 0;
            index ++;
            System.out.println("==================      PRINT      ==============");
            System.out.println("Index\tKode\tJudul\t\tDistributor\t\tStock\tRusak");
            while(tmp != null){    
                System.out.print(index + "\t" +tmp.kode + "\t" + tmp.judul + "\t" +tmp.distributor +"\t\t"+
                tmp.stok +"\t"+tmp.rusak +"\t\t");
                tmp = tmp.next;
                System.out.println("\n");
            }
        } else {
            System.out.println("Linked Lists Kosong!");
        }
    }
    
    public void cari(int cari) throws Exception {
        Node tmp = head;
        int index = -1;
        int i = 0;
        if(isEmpty()) {
            throw new Exception("Nilai index di luar batas");
        } else {
            while(tmp != null) {
                if(cari == tmp.kode) {
                    index = i;
                }
                tmp = tmp.next;
                i++;
            }
            System.out.println("Data ditemukan pada indeks ke-" + index);
        }
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void remove(int index) throws Exception{
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if(index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.next == null) {
                current.prev.next = null;
            } else if(current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            }else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong");
        }
        return head.kode;
    }
    
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong");
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.kode;
    }
    
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.kode;
    }
    
    void selectionSort() throws Exception {
        Node temp = head;
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        while (temp.next != null) {
            Node min = temp;
            Node r = temp.next;
 
            while (r != null) {
                if (min.kode < r.kode) {
                    min = r;
                }

                r = r.next;
            }
            int x = temp.kode;
            temp.kode = min.kode;
            min.kode = x;
            temp = temp.next;
        }
    }
}

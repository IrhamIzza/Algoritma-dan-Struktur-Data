
public class LinkedLists {

    Tahun2018 head2018;
    Tahun2019 head2019;
    Tahun2020 head2020;
    int size;

    public LinkedLists() {
        head2018 = null;
        head2019 = null;
        head2020 = null;
        size = 0;
    }

    public void addFirst(int item1, int item2, int item3) {
        head2018 = new Tahun2018(item1, head2018);
        head2019 = new Tahun2019(item2, head2019);
        head2020 = new Tahun2020(item3, head2020);
        size++;
    }
    public void addLast(int item1, int item2, int item3) {
    if (isEmpty()) {
        addFirst(item1, item2, item3);
    } else {
        Tahun2018 tmp1 = head2018;
        Tahun2019 tmp2 = head2019;
        Tahun2020 tmp3 = head2020;
        while (tmp1.next != null) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
            tmp3 = tmp3.next;
        }
        tmp1.next = new Tahun2018(item1, null);
        tmp2.next = new Tahun2019(item2, null);
        tmp3.next = new Tahun2020(item3, null);
        size++;
    }
}
  public boolean isEmpty() {
        return head2018 == null && head2019 == null && head2020 == null;
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List KOSONG!");
        }
        Tahun2018 tmp1 = head2018;
        Tahun2019 tmp2 = head2019;
        Tahun2020 tmp3 = head2020;
        int bulan = 1;
        while (tmp1.next != null) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
            tmp3 = tmp3.next;
            bulan++;
        }
        System.out.println("Bulan ke- 2018\t2019\t2020");
        System.out.println(bulan + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
    }


    public void clear() {
        head2018 = null;
        head2019 = null;
        head2020 = null;
        size = 0;
    }

    public void print() throws Exception {
        if (!isEmpty()) {
            Tahun2018 tmp1 = head2018;
            Tahun2019 tmp2 = head2019;
            Tahun2020 tmp3 = head2020;
            int bulan = 1;
            System.out.println("Bulan ke- 2018\t2019\t2020");
            while (tmp1 != null) {
                System.out.println(bulan + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
                bulan++;
            }
            System.out.println();
        } else {
            System.out.println("Linked List KOSONG!");
        }
    }
}

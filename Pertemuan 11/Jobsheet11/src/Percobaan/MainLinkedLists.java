package Percobaan;
public class MainLinkedLists {
    public static void main(String[] args) {
        LinkedList data = new LinkedList();
    try{
        data.addFirst(7);
        data.print();
        data.add(8, 1);
        data.print();
        data.addFirst(1);
        data.print();
        data.remove(1);
        data.print();
        data.clear();
        data.print();
    }catch (Exception e) {
            System.out.println(e.getMessage());
    }
    }
}


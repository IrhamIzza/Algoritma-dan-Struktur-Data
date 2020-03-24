package TestSearching;
/**
 * Nama     : Irham Izza
 * Kelas    : TI 1F
 * NIM      : 1941720129
 */
public class Tugas3Main {
    public static void main(String[] args) {
        int data[]={12,17,2,1,70,50,90,17,2,90};
        System.out.println("sorting dengan merge sort");
        Tugas3 mSort=new Tugas3();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
        
        
    
    
    
    }
}

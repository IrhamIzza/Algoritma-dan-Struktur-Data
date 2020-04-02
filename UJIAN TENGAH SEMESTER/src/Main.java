import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CariUmur ob = new CariUmur(); 
        System.out.println("===========================");
        System.out.println("Budi    (Ayah)  = 35 tahun");
        System.out.println("Diana   (Ibu)   = 30 tahun");
        System.out.println("Mila    (Anak)  = 8  tahun");
        int arr[] = {35,30,8}; 
        ob.sort(arr); 
        System.out.println("Data Setelah Diurutkan"); 
        ob.printArray(arr); 
    
        
        int n = arr.length;
        System.out.print("Masukkan Umur : ");
        int x = sc.nextInt(); 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Tidak ada anggota keluarga yang berumur "+x+" tahun"); 
        else
            System.out.println("Ada anggota keluarga yang berumur " +x+ " tahun"); 
  }
}
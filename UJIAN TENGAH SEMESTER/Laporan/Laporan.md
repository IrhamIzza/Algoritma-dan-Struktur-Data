# Class CARI UMUR 


class CariUmur    
{    
    void sort(int arr[]) 
    {    
        int n = arr.length;    
        for (int i = 0; i < n-1; i++)   
        {    
            int min_idx = i;    
            for (int j = i+1; j < n; j++)   
                if (arr[j] < arr[min_idx])   
                    min_idx = j;   
            int temp = arr[min_idx];   
            arr[min_idx] = arr[i];   
            arr[i] = temp;   
        }    
    } 
  
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            if (arr[mid] == x) 
                return mid; 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
            return binarySearch(arr, mid + 1, r, x); 
        } 
        return -1; 
    } 
  
} 

# Class MAIN 
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

# Capture Gamber
## Class Cari Umur
<img src = 1.png>
<img src = 2.png>

## Class Main
<img src = 3.png>

## OUTPUT
<img src = 4.png>
<img src = 5.png>

# Penjelasan 
Masukkan umur menggunakan input import java.util.Scanner lalu pertama kita urutkan terlebih dahulu menggunakan Selection Sort setelah itu kita cari menggunakan Binary search

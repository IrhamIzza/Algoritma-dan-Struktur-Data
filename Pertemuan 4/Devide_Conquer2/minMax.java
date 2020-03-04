package Devide_Conquer2;
import java.util.Scanner;
public class minMax {
    public int nilaiArray;    // O(1)
    public static void max_min(int[] arr,int indeks_awal,int indeks_akhir,Maxmin hasil){
        int indeks_tengah; // O(1)
        Maxmin hasil1 = new Maxmin(); // O(1)
        Maxmin hasil2 = new Maxmin(); // O(1)
        
        if (indeks_awal == indeks_akhir) { // O(1)
            hasil.minimum = hasil.maximum = arr[indeks_awal];// O(1)
        }else if (indeks_akhir - indeks_awal == 1) { // O(1)
            if (arr[indeks_awal] > arr[indeks_akhir]) { // O(1)
                hasil.minimum = arr[indeks_akhir]; // O(1)
                hasil.maximum = arr[indeks_awal]; // O(1)
            }else{ // O(1)
                hasil.minimum = arr[indeks_awal]; // O(1)
                hasil.maximum = arr[indeks_akhir];// O(1)                   
            }
        }else {// O(1)
            indeks_tengah = (indeks_awal + indeks_akhir/2);// O(1)
            max_min(arr,indeks_awal,indeks_tengah,hasil1);// O(1)
            max_min(arr,indeks_tengah + 1,indeks_akhir,hasil2);// O(1)
        
            hasil.minimum = (hasil.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum; // O(1)
            hasil.maximum = (hasil.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum; // O(1)

        }
    }

}


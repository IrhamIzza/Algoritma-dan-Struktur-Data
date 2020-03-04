package Devide_Conquer2;
import java.util.Scanner;
public class Tugas2 {
    public  int nilai,j=0,jumlah;
    public static void BF(int n) {
        Scanner sc = new Scanner(System.in);
        int fib[] = new int[n];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        } 
         
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
    }
     int DC(int [] arr,int awal,int akhir){
        int tengah;
        if(awal == akhir){    
            return (arr[1]);
        } else if (awal<akhir){
            tengah=(awal+akhir)/2;
            int jumlah1 = DC(arr,awal,tengah-1);
            int jumlah2 = DC(arr,tengah+1,akhir);
            
            return jumlah1+jumlah2+arr[tengah];
        }
        return 0;
    }
     double totalDC(double arr[],int l, int r){
            if (l==r) 
                return arr[l];
            else if (l<r){
            int mid=(l+r)/2;
            double lsum=totalDC(arr,l,mid-1);
            double rsum=totalDC(arr,mid+1,r);
            return lsum+rsum+arr[mid];
            }
            return 0;
    }
}

        


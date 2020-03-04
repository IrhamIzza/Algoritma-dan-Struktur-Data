package Devide_Conquer2;
import java.util.Scanner;
public class Tugas2Main {
//     static int fibo(int n){
//    if(n == 0 || n == 1){
//      return n;
//    } else {
//      return (fibo(n-1) + fibo(n-2));
//    }
//  }
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    Tugas2 tg = new Tugas2();
    System.out.println("=========Brute Force==========");       
    System.out.print("Masukan Jumlah Deret Fibonacci = ");
        int n = sc.nextInt();
        int fib[] = new int[n];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
        
    System.out.println("");
    System.out.println("========Devide Conquer========");
    System.out.print("Masukkan jumlah deret Fibonacci = ");
    tg.nilai=sc.nextInt();
   
    
    
    System.out.println("Devide = " + tg.DC(fib, 0, tg.nilai-1));
    



    
//    int i, j = 0;
//    Scanner scan = new Scanner(System.in);
//    System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
//    int n = scan.nextInt();
//    System.out.print("Hasil bilangan fibonacci: ");
    }
}



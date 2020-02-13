package Tugas3;
import java.util.Scanner;
public class Nomer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] Arr= {'M','I','S','S','I','S','S','I','P','I'};
        System.out.println("Kalimat MISSISSIPI");
        int M = 0,I=0,P=0,S=0;
        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i]=='M'){
            M++;
            }
            if (Arr[i]=='I') {
            I++;   
            }
            if (Arr[i]=='S') {
            S++;    
            }
            if (Arr[i]=='P') {
            P++;
            }
        } System.out.println("Jumlah M = "+M);
        System.out.println("Jumlah I = "+I);
        System.out.println("Jumlah S = "+S);
        System.out.println("Jumlah P = "+P);
    }
}

package Tugas1;
import java.util.Scanner;
public class Waralaba {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pil1,pil2,total=0,total2=0,total3=0,jum;
        int c1=12000,c2=15000,c3=20000,o1=10000,o2=12000,o3=15000;
        
        String ulang = "y";
        while(ulang.equalsIgnoreCase("Y")){
        System.out.println("Paket Menu ");
        System.out.println("1. Paket Chicken");
        System.out.println("2. Paket Oke");    
        System.out.print("Masukkan Pilihan :");
        pil1=sc.nextInt();
        if(pil1==1){
            System.out.println("1. Chicken A(Rp 12.000)");
            System.out.println("2. Chicken B(Rp 15.000)");
            System.out.println("3. Chicken C(Rp 20.000)");
            System.out.print("Masukkan Pilihan Anda : ");
            pil2=sc.nextInt();
            if(pil2==1){
            total=c1;
            }if(pil2==2){
            total=c2;
            }if(pil2==3){
            total=c3;
            }
        }
        
        else if(pil1==2){
            System.out.println("1. Oke A(Rp 10.000)");
            System.out.println("2. Oke B(Rp 12.000)");
            System.out.println("3. Oke C(Rp 15.000)");
            System.out.print("Masukkan Pilihan Anda : ");
            pil2=sc.nextInt();
            if(pil2==1){
            total=o1;
            }if(pil2==2){
            total=o2;
            }if(pil2==3){
            total=o3;
            }           
        }
        else {System.out.println("Menu Salah");}
        
        System.out.print("Berapa Banyak Yang Anda Beli ?");
        jum=sc.nextInt();
        System.out.print("Apakah Anda ingin Memesan Lagi?(Y/T)");
        ulang = sc.next();
        total2=total*jum;
        total3+=total2;
        }  System.out.println("Total Pembayaran = "+ total3);
        
    }   
}

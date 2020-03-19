package Minggu5;
public class Tiket {
//    float harga [] = {20000,5000,1000,3000,4000};
//    String maskapai [] = {"Garuda","Air Asia","Lion Air","CitiLink"};
//    int transitCounr [] =
 
   String maskapai; 
   int transitcount,flightTime;
   float harga ;
   
   Tiket(String m, int f, int t,float h){
       maskapai = m;
       transitcount = t;
       flightTime = f;
       harga = h;
   }

    Tiket() {
      
    }

   
   void Tampil(){
       System.out.println("Maskapai = "+maskapai);
       System.out.println("Transitcount = "+transitcount);
       System.out.println("FlightTime = "+flightTime);
       System.out.println("Harga = "+harga);
   }
}

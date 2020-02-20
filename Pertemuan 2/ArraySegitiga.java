package Segitga;
public class ArraySegitiga {
    public static void main(String[] args) {
        Segitiga [] sgArray = new Segitiga[15];
        sgArray [0] = new Segitiga (30, 12);
        sgArray [1] = new Segitiga (40, 15);
        sgArray [2] = new Segitiga (50, 25);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Luas segitiga ke-"+i+" : "+sgArray[i].hitungLuas());
        } 
        for (int i = 0; i < 3; i++) {
            System.out.println("Keliling Segitiga ke-"+i+" : "+sgArray[i].hitungKeliling());
        }
    }
}

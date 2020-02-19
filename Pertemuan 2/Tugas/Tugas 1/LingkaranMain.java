package TUGAS;
public class LingkaranMain {
    public static void main(String[] args) {
       Lingkaran li= new Lingkaran(); 
       li.r=7;
        System.out.println("Hitung Luas\t= "+ li.hitungLuas());
        System.out.println("Hitung Keliling\t= "+li.hitungKeliling());
    }  
}

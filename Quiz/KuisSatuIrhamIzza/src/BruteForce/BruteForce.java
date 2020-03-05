package BruteForce;
public class BruteForce {
   private static void matchly(char[] kalimat, char[] pola) {
     int j;
     int cek = 0;
     for (int i = 0; i <= kalimat.length - pola.length; i++) {
        j = 0;
        while (j < pola.length && kalimat[i + j] == pola[j]){
           j++;
        }
        if (j >= pola.length) {
           cek++;
        }
     }
     if (cek > 0) {
        System.out.println("DATA COCOK");
     } else {
        System.out.println("DATA TIDAK COCOK");
     }
   }
   public static void main(String[] args) {
      char[] x = {'N', 'G', 'A'};
      char[] y = {'S', 'E', 'M', 'A', 'N', 'G', 'A', 'T'};
      matchly(y, x);
   } 
}

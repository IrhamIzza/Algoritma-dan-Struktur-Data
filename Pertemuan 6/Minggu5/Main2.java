package minggu5;
public class Main2 {  
    /** Method untuk mensorting angka */
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int k;
            
            for (k = i - 1; k >= 0 && array[k] > temp; k--) {
                array[k + 1] = array[k];
                }
            array[k + 1] = temp;
            
            }
        }
        public static void insertionSortASD(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int k;
            
            for (k = i - 1; k >= 0 && array[k] < temp; k--) {
                array[k + 1] = array[k];
                }
            array[k + 1] = temp;
            
            }
        }
    
    public static void main (String [] args){
        
        //array sebelum insertion sort
        int[] poin = {82,57,50,48,43,43,42,41,40,39,39,37,35,34,29,27,27,27,25,21};
        int [] Main = {29,27,28,29,29,28,28,29,28,29,29,29,29,29,29,29,29,29,27,29};
        int [] GD = {45,39,26,9,7,5,12,7,4,-6,-6,-6,-16,-17,-8,-15,-17,-18,-18,-27};
        String [] club = {"Liverpool","Manchester City","Leicester City","Chelsea"
                          ,"Wolves","Sheffield United","Man United","SPURS","Arsenal",
                          "Burnley","Crytal Palace","Everton","Newscastle United",
                          "Southampton","Brighton & Hove Albion","West Ham United",
                          "Watford","AFC Bournemouth","Aston Villa","Norwich City"
        };
        
    
        //for loop untuk menampilkan elemen array
        //setelah insertion sort dilakukan
        Main2.insertionSort(poin);
        int j=20;
        System.out.println("------------------------------------------");
        for (int i = 0; i < poin.length; i++)
          {
          
          j--;
          System.out.println("Peringakat Ke "+(j+1)+" Poin = "+poin[i]);
          }
         System.out.println("-----------------------------------------");
        Main2.insertionSortASD(poin);
        for (int i = 0; i < poin.length; i++)
          {

          System.out.println("Peringakat Ke "+(i+1)+" "+club[i]+" Poin = "+poin[i]);
          }
        System.out.println("-----------------------------------------");
        Main2.insertionSort(Main);
        for (int i = 0; i < Main.length; i++) {
          System.out.println("Main sebanyak = "+Main[i]);
        }
         System.out.println("-----------------------------------------");
        Main2.insertionSortASD(Main);
        for (int i = 0; i < Main.length; i++) {
          System.out.println("Main sebanyak = "+Main[i]);
        }
        System.out.println("-------------------------------------------");
        Main2.insertionSort(GD);   
        for (int i = 0; i < GD.length; i++) {
            System.out.println("Goal Difference "+ GD[i]);
        }
         System.out.println("-----------------------------------------");
        Main2.insertionSortASD(GD);
        for (int i = 0; i < GD.length; i++) {
            System.out.println("Goal Difference "+ GD[i]);
        }
    }
 }

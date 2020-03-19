package Minggu5;
public class Club {
    int no;
    int poin []= { 
        82,57,50,48,43,43,42,41,40,39,
        39,37,35,34,29,27,27,27,25,21
    };
    void tampil (){
        for (int i = 0; i < poin.length; i++) {
            System.out.print(poin+",");
        }
    }
    
    void insertionSort() {
    int i,j;
        for ( i = 0; i < poin.length; i++) {
            int temp;
            temp = poin[i];
            j = i;
            while ((j>0) && (poin[j-1]>temp)){
                poin[j] = poin[j - 1];
                j--;
            }
            poin[j] = temp;
        }
    }
}

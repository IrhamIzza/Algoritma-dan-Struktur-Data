package Minggu5;
public class DaftarHargaTiket {
    Tiket listtkt[]=new Tiket[5];
    int idx;
    
    void tambah(Tiket t){
        if (idx<listtkt.length) {
            listtkt[idx]=t;
            idx++;
        }else{
            System.out.println("Data sudah Penuh!!");
        }
    }
    
    void tampil(){
        for (Tiket t : listtkt) {
            t.Tampil();
            System.out.println("---------------------");
        }
    }
    
    void bubbleSort(){
        for (int i = 0; i < listtkt.length-1; i++) {
            for (int j = 1; j < listtkt.length-i; j++) {
                if (listtkt[j].harga>listtkt[j-1].harga) {
                    // di bwah ini proses swap 
                    Tiket tmp = listtkt[j];
                    listtkt[j] = listtkt[j-1];
                    listtkt[j-1] = tmp;
                }
            }
        }
    }
    void bubbleSort1(){
        for (int i = 0; i < listtkt.length-1; i++) {
            for (int j = 1; j < listtkt.length-i; j++) {
                if (listtkt[j].harga<listtkt[j-1].harga) {
                    // di bwah ini proses swap 
                    Tiket tmp = listtkt[j];
                    listtkt[j] = listtkt[j-1];
                    listtkt[j-1] = tmp;
                }
            }
        }
    }
    
    
    void selection(){
        for (int i = 0; i < listtkt.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listtkt.length; j++) {
                if (listtkt[j].harga < listtkt[idxMin].harga) {
                    idxMin = j;
                }
            }
            //swap
            Tiket tmp = listtkt[idxMin];
            listtkt[idxMin] = listtkt[i];
            listtkt[i] = tmp;
        }
    }
    
    void selection1(){
        for (int i = 0; i < listtkt.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listtkt.length; j++) {
                if (listtkt[j].harga > listtkt[idxMin].harga) {
                    idxMin = j;
                }
            }
            //swap
            Tiket tmp = listtkt[idxMin];
            listtkt[idxMin] = listtkt[i];
            listtkt[i] = tmp;
        }
    }
    
    void insertionSort() {
    int i,j;
        for ( i = 0; i < listtkt.length; i++) {
            Tiket temp = new Tiket();
            temp = listtkt[i];
            j = i;
            while ((j>0) && (listtkt[j-1].harga>temp.harga)){
                listtkt[j] = listtkt[j - 1];
                j--;
            }
            listtkt[j] = temp;
        }
    
    
    }
}
   


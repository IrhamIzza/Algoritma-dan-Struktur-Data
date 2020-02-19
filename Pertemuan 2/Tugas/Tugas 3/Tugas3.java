package TUGAS;
public class Tugas3 {
    public String nama;
    public int hargaSatuan,jumlah;
    double total,diskon;
    
    public int hitungHargaTotal(int a){
    jumlah=hargaSatuan*a;
    return jumlah;
    }
    public int hitungDiskon(){
        if (jumlah>100000) {
            diskon=jumlah*0.1;
        }else if (jumlah>=50000==jumlah<=10000) {
            diskon=jumlah*00.5;
        }else if (jumlah<50000) {
            System.out.println("Tidak mendapatkan Diskon");
        }
        return (int) diskon;
    }
    public int hitungHargaBayar(){
        total=jumlah-diskon;
        return (int) total;
    }
    
}

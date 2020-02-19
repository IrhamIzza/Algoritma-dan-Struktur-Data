# Jawaban 2.3.3

1. Karakteristik Class dan Objek

Class : diawali dengan huruf Kapital
Objek : harus instiasi di method main

2.  •	Class NamaClass{

//isi class

}

3. Ada 4 atribut : namaBarang, jenisBarang, stok, hargaSatuan

4. Deklarasi terdapat pada baris 4 dan baris 5

5. •	Void kurangiStok(int n){

if (stok > 0);

stok = stok – n;

 }
 
 }
 
 6. Karena untuk menyimpan data bilangan bulat, karena variabel stok bertipe int.

 7. Karena untuk menyimpan data bilangan bulat.

8. Karena pada method tambahStok() tidak menggunakan fungsi return

# Jabawan 2.4.3
1. Baris 5 dan objek yang dihasilkan b1
2. Cara akses :

 a. Atribut : objek.namaAtribut; 

b. Method : objek.namaMethod;

# Jawaban 2.5.3
1. Pada baris 9 sampai 14
2. Instansiasi dengan menghasilkan objek “b2”
3. Barang b3 = new Barang(“Lenovo”, “Laptop”, 8000000, 30);
 b3.tampilBarang();

# Jawaban 2.6.3 
1. Kode diatas akan membuat array ppArray yang dapat menampung tiga objek PersegiPanjang.
2. Kode diatas akan mengisikan objek PersegiPanjang kedalam ppArray index ke-1, kemudian memberikan nilai pada atribut panjang = 80 dan lebar = 40.
# Jawaban 2.7.3
1. Hal tersebut dikarenakan pada index pgArray ke-5, belum dibuat objek Persegi.
# Jawaban 2.8.3
1. Konstruktor adalah method yang bernama sama dengan nama class dan tidak memiliki return type.
2. Segitiga[]sgArray = new Segitiga[15];
3. public Segitiga(int a, int t){

alas = a; tinggi = t; 

}

4. public class Segitiga {

    public int alas,tinggi;

    public Segitiga (int a,int t){

    alas = a;
    tinggi = t;
    }

    public double hitungLuas(){

    return 0.5*alas*tinggi;

    }

    public double hitungKeliling(){

    double hasil=Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
    return hasil+alas+tinggi;

    }
}
5. public class ArraySegitiga {
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

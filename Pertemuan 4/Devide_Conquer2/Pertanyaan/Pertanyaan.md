# PERTANYAAN 1

1. Hasil Run
<img src = "16.PNG"> 

2. Maksud dari program tersebut untuk menginstansiasi array of object ppArray   
Dimana :   
minMax[] ppArray = new minMax[5] -> sebagai instansiasi
ppArray[0] = new minMax(); -> sebagai inisialisasi atau memberikan nilai kepada object
3. Code program untuk menghitung nilai minimal dam maksimal    
<img src = "17.PNG">

4. Pada program tersebut berarti bahwa nilai 4 adalah indeks akhir atau batas dari array
yang diinputkan oleh user.
5. Karna menggunakan algoritma divide and conquer dimana array akan di bagi menjadi
beberapa bagian, untuk pembagian yang sama antara bagian kanan dan bagian kiri
maka memerlukan indeks awal yang merupakan indeks ke-0, indeks akhir merupakan
indeks ke-n, dan indeks tengah merupakan batas diantara keduanya
6. Karena merupakan class tersendiri, dimana deklarasi class tidak boleh dilakukan di dalam
class lain.
7. Tidak bisa, karena nilai array pada array objek digunakan sebagai parameter
8. Code program perubahan
<img src = "18.PNG">  
Bisa Langsung memasukkan nilaiArray ke parameter pertama, dengan mengubah objek nilaiArray ke array biasa di main
<img src = "19.PNG">
9. 
10. untuk algoritmanya lebih mudah jika menggunakan Brute Force sedangkan jika memilih efisiensi lebih baik menggunakan Devide Conquer
11. Yang lebih baik dari segi kecepatan memecah masalah adalah divide and conquer,sedangkan Brute force lebih baik untuk yang ingin simpel dalam pengkodeannya
12. Itu dinamakan ternary operation, : adalah sebagai else   
Dimana penjelasanya :   
Tanda “ : “ berarti pembanding/pembatas antara kondisi jika benar dengan kondisi jika salah
Jika a>b ? maka c(jika benar) : d(jika salah)
13. Tanda ? merupakan bagian dari operator ternary, yang sama seperti simbolnya menanyakan kondisi

# PERTANYAAN 2
1. Notasi: O(n)*O(n)*O(1) = n*n*1   
Penjelasanya : 1+1+(n*n*1)+(n*n*1)= 2+2*(n^2)   
Big O(n^2). Tidak ada perubahan operasi dengan praktikum karna sama-sama memiliki 1 intruksi
2. Jumlah instruksi: n*n*1 = 100*100*1 = 10000   
Penjelasan :   
N=100   
1+1+(100*100*1)+(100*100*1)= 2+2*(100^2)
2+2*(100^2) = 20002
Big O(n^2) = 10000.
3. Kode A, notasi: O(n)*O(n)*1   
Kode B, notasi: O(n)*O(∞)*O(1)   
Berbeda karena di for kedua j tidak di iterasi sehingga nilai j selalu 0 sehingga akan terjadi infinity loop
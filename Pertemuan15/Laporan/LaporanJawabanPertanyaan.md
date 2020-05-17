# Jawaban Pertanyaan Percobaan 15.3.3

1. Graph menggunakan node double linked list karena terdapat 2 atribut untuk menunjuk pada node lain(prev dan next). Dalam graph, atribut prev digunakan pada vertex berikutnya, sebaliknya atribut next digunakan untuk meunjuk pada vertex edge berikutnya.

2. loop pertama digunakan untuk melakukan perulangan pada i, dimana i untuk memanggil indeks array, Sedangkan untuk loop kedua digunakan untuk melakukan perulangan pada j, dimana j digunakan untuk memanggil vertex edge yang terhubung pada setiap vertex ke-i.

3. Perbedaannya terdapat pada pengguanaan linked list di graph, setiap vertex mampu terhubung kepada vertex manapun yang diinginkan atau terjadi cycle. Sedangkan pada binary tree, setiap node memiliki parent dan child masing-masing, tidak dapat terhubung ke node lain.

4. edge adalah Garis – garis yang menghubungkan antar vertex sedangkan path lintasan yang melalui edge dan vertex  dalam graf. Perbedaan antara edge dan path, yaitu edge hanya penghubung antar simpul dalam graph, sedangkan path adalah lintasan yang dilalui dari satu vertex ke vertex lain yang akan dituju melalui edge yang terhubung. 

5.    
    - adjacency list, dan diimplementasi dengan menampilkan masing-masing simpul sebagai sebuah struktur data yang mengandung senarai dari semua simpul yang saling berhubungan.
    - Adjacency matrix dimana baris dan kolom dari matriks (jika dalam konteks implementasi berupa senarai dua dimensi) tersebut merepresentasikan simpul awal dan simpul tujuan dan sebuah entri di dalam senarai yang menyatakan apakah terdapat sisi di antara kedua simpul tersebut.
    - Dari kedua implementasi diatas, gabungan dari keduanya menghasilkan implementasi baru bernama Adjacency map yaitu simpul yang disimpan sebagai kunci dalam sebuah Map Structure dengan tujuan agar mempermudah pencarian sebuah simpul
    
6. 
    - Algoritma Kruskal, digunakan untuk menentukan pohon perentang terbobot minimum.
    - Algoritma Brent, digunakan untuk menentukan adanya daur dalam graph (cycle)
    - Algoritma Dijkstra, digunakan untuk menentukan lintasan terpendek pada graf berbobot.
    

7. untuk membuat array dari tipe data class LinkedList. Dalam hal ini array list[] digunakan untuk menyimpan vertex, edge, dan vertex yang terhubung pada edgenya pada graph.

8. Pemanggilan method addFirst() dalam method addEdge() karena ketika terdapat penambahan edge maka harus ada 2 array yang diubah yaitu source atau asal dari edge dan destination atau tujuan dari edge. Ketika menambahkan array index source, maka node harus diberi tahu tujuan edgenya juga, dan pada array index destination, maka node harus diberi tahu asal edgenya juga. Sehingga antara array index source dan array index destination saling terhubung.

9. Dengan cara mencocokkan menggunakan perulangan pada variabel i, ketika i bernilai sama dengan parameter destination yang diinputkan, maka edge akan dihapus.

10. Tidak terjadi kesalahan, dan edge ke-3 dari vertex 1 dapat terhapus.  
<img src = 2.PNG>

# Jawaban Pertanyaan Percobaan 15.4.3

1. 
    * Directed graph adalah suatu graph G yang terdiri dari himpunan vertex V = {v1, v2, …, vp } dan himpunan edge E = {e1, e2, …, eq }dan suatu pemetaan f yang memetakan setiap edge onto terhadap pasangan berurut dari vertex ( vi,vj ), yang mana vertex disajikan dengan titik dan edge disajikan dengan sepotong garis berarah dari vi ke vj. Garis berarah yang menghubungkan dua vertex disebut arcus ( arc ) sehingga dari defenisi di atas dapat ditulis : f : eq ® ( vi,vj )
    * Undirected graph adalah suatu graph G yang terdiri dari pasangan himpunan { V,E } yang mana V adalah himpunan berhingga tak kosong yang anggotanya disebut vertex dan E adalah himpunan berhingga yang anggotanya disebut edge, yang merupakan potongan garis tak berarah yang menghubungkan pasangan vertex tersebut.

2. Hal ini hanya untuk memudahkan pembacaan pencetakan matriks yang membentuk representasi graph, sebenarnya bisa dimulai dari 0, tetapi semua perulangan harus dimulai dari 0.

3. Untuk memeriksa apakah ada vertex yang terhubung antara vertex &#60;to> dan vertex <from&#62;, jika tidak ada data yang terhubung, maka vertex tidak ada

4. Jenis directed graph

5. Karena Statement tersebut digunakan untuk mengurung eksekusi yang menampilkan error dan dapat membuat program tetap berjalan tanpa dihentikan secara langsung. Error yang ditangani oleh try...catch biasa disebut dengan exception.
Ada beberapa hal yang perlu diingat ketika akan menggunakan try..catch di Java:

Kita dapat membuat multiple try..catch
Kita dapat menambahkan statement finally untuk menangani berbagai hal ketika error terjadi atau tidak
Kita dapat membuat exception sendiri disamping menggunakan bawaan Java
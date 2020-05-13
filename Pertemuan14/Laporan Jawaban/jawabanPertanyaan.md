# Jawaban Pertanyaan Praktikum Binary Tree

1. Binary Search Tree adalah struktur data yang mengadopsi konsep Binary Tree namun terdapat aturan bahwa setiap clild node sebelah kiri selalu lebih kecil nilainya dari pada root node. Begitu pula sebaliknya, setiap child node sebelah kanan selalu lebih besar nilainya daripada root node.   

2. Pada class Node, fungsi left adalah sebagai pointer yang menunjuk ke left-child, sedangkan fungsi dari right adalah sebagai pointer yang menunjuk ke right-child.

3. a. Root tidak memiliki induk/parent. Fungsi atribut root adalah sebagai Node khusus dalam tree yang awal pada binary tree dan tidak memiliki predessor maupun parent.
b. Nilai dari root adalah null (kosong).  

4. Ketika tree masih kosong atau bernilai null, dan akan ditambahkan sebuah node baru, maka fungsi add akan dijalankan dan node awal yang bernilai null akan diubah dengan data baru.

5. Yang pertama dilakukan adalah pengecekan jika data baru yang ditambahkan pada method add dengan data pada current(data yang terdapat pada root) jika data tersebut bernilai kurang dari data root maka dilakukan pengecekan pada child sebelah kiri root(current.left). Yang kedua dilakukan pengecekan current.left!=null, yaitu apabila data child punya nilai tidak null maka current akan diubah menjadi current.left, dan proses ini akan berulang hingga proses masuk ke percabangan dari pengecekan current.left!=null, yang ketiga apabila child di kiri sudah punya nilai bernilai null maka current.left akan ditambahkan data baru yang diiinputkan method add. ini akan berhenti jika sudah melakukan break.

6.  Terdapat tiga macam traversal pohon, yaitu :  
A).    Traversal Pre-order, dilakukan berturut-turut :   
a.   Kunjungi simpul akar (root)   
b.   Lakukan traversal subpohon kiri   
c.   Lakukukan traversal subpohon kanan                         
B).   Traversal In-order, dilakukan berturut-turut :  
a.   Lakukan traversal subpohon kiri  
b.   Kunjungi simpul akar (root)   
c.   Lakukan traversal subpohon kanan  
C).   Traversal Post-order, dilakukan berturut-turut :  
a.   Lakukan traversal subpohon kiri   
b.   Lakukan traversal subpohon kanan  
c.   Kunjungi simpul akar (root)  

7. Untuk mengetahui node tersebut kita harus mengetahui parent. jika parent data node tersebut lebih kecil dari parent, berarti letak node yang akan dihapus berada di child sebelah kiri parent. sebaliknta jika data lebih besar dari parent, maka node tersebut berada di child sebelah kanan parent.

8. Dalam method delete(), variabel isLeftChild yang bertipe data boolean digunakan untuk mengetahui letak dari node yang akan dihapus. Jika data berada pada child sebelah kiri parent, maka variabel isLeftChild akan bernilai true, dan data berada pada child sebelah kanan parent, maka variabel  isLeftChild akan bernilai false.

9. Method getSuccessor digunakan untuk mendapatkan successor dari node yang akan dihapus yang nantinya akan digunakan ketika menghapus node yang memiliki 2 child.

10. Dalam method getSuccessor() di program yang dilakukan pada percobaan cara yang diimplementasikan adalah dengan cara mencari nilai terkecil dari subtree sebelah kanannya, pada statement Node successor = del.right dapat diketahui bahwa successor yang dicari dimulai dari subtree sebelah kanan node yang akan dihapus.

11. Pada class BinaryTreeArray kegunaan dari atribut data adalah sebagai array yang menyimpan data bertipe data integer dan atribut idxLast digunakan untuk menyimpan data indeks terakhir data array yang merupakan leaf paling kanan binary tree dengan tipe data integer.

12. Kegunaan dari method populateData() adalah untuk mengisi atribut data dan idxLast pada class BinaryTreeArray. Method traverseInOrder digunakan untuk mencetak data secara in-order yaitu data dicetak ditengah proses, yaitu setelah mengunjungi left child dan sebelum mengunjungi right child.

13. Suatu node binary tree disimpan dalam array indeks 2, maka posisi left-child berada pada indeks: 2*indeks+1 = 2*2+1 = 5 dan posisi right-child berada pada indeks: 2*indeks+2 = 2*2+2 = 6. Jadi posisi indeks left-child dan right child masing-masing adalah 5 dan 6.
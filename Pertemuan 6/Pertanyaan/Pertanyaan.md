Pertanyaan

1. Terdapat pada void bubbleSort
2. Terdapat pada void selection
3. Yaitu pertukaran antara indeks,   
if (listMhs[j].ipk>listMhs[j-1].ipk) {   
                    // di bwah ini proses swap 
                    Mahasiswa tmp = listMhs[j];   
                    listMhs[j] = listMhs[j-1];   
                    listMhs[j-1] = tmp;   
                }
4. Untuk melakukan swap
5. a. Untuk yang i untuk mengartikan indeks 0 sedangkan untuk yang j mengartikan indeks 1    
b. karena indeks dimulai dari 0 jadi harus dikurangi satu agar tepat    
c. Karena persyaratan harus dikurangi oleh i agar indeks j dapat bekerja menjadi indeks ditambah 1 atau indeks setelah i ditambah 1  
d.i akan melakukan perulangan sebanyak 50 dan tahap bubble akan menempuh sebanyak 49
6. Untuk mencari indeks yang lebih kecil dari j jika terdapat yang lebih kecil idxMin akan berubah menjadi j
7. void insertionsort(boolean ascending){   
        int i,j;    
        for ( i = 0; i < listMhs.length; i++) {   
            Mahasiswa temp = new Mahasiswa();   
            temp = listMhs[i];   
            j = i;   
            if (ascending) {    
                while ((j>0) && (listMhs[j-1].ipk>temp.ipk)){    
                    listMhs[j] = listMhs[j - 1];   
                    j--;    
                }  
            }else{    
                while ((j>0) && (listMhs[j-1].ipk<temp.ipk)){   
                    listMhs[j] = listMhs[j - 1];   
                    j--;   
                }    
            }      
            listMhs[j] = temp;   
        }   
    }

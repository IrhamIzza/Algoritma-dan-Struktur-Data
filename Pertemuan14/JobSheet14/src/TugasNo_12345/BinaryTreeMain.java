/*
 * Nama  : Irham Izza
 * NIM   : 1941720129
 * Kelas : TI 1F
 */
package TugasNo_12345;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);
        bt.insert(10);
        bt.insert(15);
        
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Nilai terbesar : " + bt.findMax(bt.root));
        System.out.println("Nilai terkecil : " + bt.findMin(bt.root));
        System.out.print("Leaf : ");
        bt.printleaf(bt.root);
        System.out.println("");
        System.out.println("Jumlah leaf : " + bt.hitungLeaf(bt.root));
        
        //Tugas 5
        Scanner sc = new Scanner(System.in);
        int pilih = 0, data;
        do {
            System.out.println("===Binary Tree Tugas 5===");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Find");
            System.out.println("4. Traverse inOrder");
            System.out.println("5. Traverse preOrder");
            System.out.println("6. Traverse postOrder");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu\t: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("===Add===");
                    System.out.print("Masukkan data\t: ");
                    data = sc.nextInt();
                    bt.add(data);
                    break;
                case 2:
                    if (bt.isEmpty()) {
                        System.out.println("Binary Tree masih kosong!");
                    } else {
                        System.out.println("===Delete===");
                        System.out.print("Data\t: ");
                        bt.traverseInOrder(bt.root);
                        System.out.print("\nMasukkan data yang ingin dihapus\t: ");
                        data = sc.nextInt();
                        bt.delete(data);
                    }
                    break;
                case 3:
                    if (bt.isEmpty()) {
                        System.out.println("Binary Tree masih kosong!");
                    } else {
                        System.out.println("===Find===");
                        System.out.print("Masukkan data yang ingin dicari\t: ");
                        data = sc.nextInt();
                        if (bt.find(data)) {
                            System.out.println("Data ditemukan!");
                        } else {
                            System.out.println("Data tidak ditemukan!");
                        }
                    }
                    break;
                case 4:
                    if (bt.isEmpty()) {
                        System.out.println("Binary Tree masih kosong!");
                    } else {
                        System.out.println("===Traverse inOrder===");
                        bt.traverseInOrder(bt.root);
                        System.out.println("");
                    }
                    break;
                case 5:
                    if (bt.isEmpty()) {
                        System.out.println("Binary Tree masih kosong!");
                    } else {
                        System.out.println("===Traverse preOrder===");
                        bt.traversePreOrder(bt.root);
                        System.out.println("");
                    }
                    break;
                case 6:
                    if (bt.isEmpty()) {
                        System.out.println("Binary Tree masih kosong!");
                    } else {
                        System.out.println("===Traverse postOrder===");
                        bt.traversePostOrder(bt.root);
                        System.out.println("");
                    }
                    break;
                case 7:
                    System.out.println("===Keluar===");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak ada menu tersebut!");
            }
            System.out.println("====================\n");
        } while (pilih != 7);
        
    }
}
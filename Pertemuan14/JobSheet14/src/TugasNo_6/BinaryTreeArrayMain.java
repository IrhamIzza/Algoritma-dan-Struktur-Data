/*
 * Nama  : Irham Izza
 * NIM   : 1941720129
 * Kelas : TI 1F
 */
package TugasNo_6;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        BinaryTreeArray bta = new BinaryTreeArray(data.length, idxLast);
        for(int i = 0; i < data.length; i++){
            bta.add(data[i]);
        }
        System.out.print("Traverse inOrder\t: ");
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.print("Traverse preOrder\t: ");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.print("Traverse postOrder\t: ");
        bta.traversePostOrder(0);
        System.out.println("");
    }
    
}
/*
 * Nama  : Irham Izza
 * NIM   : 1941720129
 * Kelas : TI 1F
 */
package JS15;

public class Node {

    int data;
    Node prev;
    Node next;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

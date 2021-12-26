package LinkedList;

/**
 * The ArrayList and the LinkedList  data structures are commonly compared because
 * LinkedList are dynamic and linked just like arrayList whereas Arrays are fixed in length.
 *
 * In LinkedList, we are not going to have indexes where we can go directly to a
 * particular item.
 *
 * Also, In LinkedList instead of all the items being in a contiguous place in memory,
 * they are going to be spread out.
 *
 * LinkedList also going to have variables called head that points to the first node and
 * one called tail that points to the last node.
 *
 * The head and tail are pointer that points to node and then each node is going to have
 * a pointer that points to the next node.
 *
 * The last node has the pointer that point to null.
 *
 */

/**
 * Big O for LinkedList
 *
 * To append a new node to the end => O(1)
 * The reason being it doesn't matter how many nodes we have in the list,
 * the number of operations to add it to the end is exactly the same.
 *
 * To remove the item from end => O(n)
 *
 * To add item in front => O(1)
 *
 * To remove from the front => O(1)
 *
 * Adding item somewhere in the middle => O(n)
 *
 * Removing from middle => O(n)
 *
 * Access element which is in middle => O(n)
 */




public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
         int value;
         Node next;

         Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }
    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}

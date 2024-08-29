package CircularSLL;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }
    public CircularSinglyLinkedList(){
        last = null;
        length = 0;

    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(11);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next= first;

        last = fourth;

    }

    public void insertFirst(int data){
        ListNode temp = new ListNode(data);
        if(last == null){
            last = temp;
        } else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public void insertLast(int data){
        ListNode temp = new ListNode(data);
        if(last == null){  //isEmpty
            last = temp;
            last.next = last;
        } else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public ListNode removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("Circular Singly Linked List is already empty");
        }
        ListNode temp = last.next;
        if(last.next == last){
            last = null;
        } else{
            last.next = temp.next;
        }
        temp.next = null;
        length --;
        return temp;
    }

    public void display() {
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while(first !=last){
            System.out.println(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularLinkedList();
        csll.insertFirst(5);
        csll.insertFirst(9);
        csll.display();
        csll.removeFirst();
        csll.display();


    }
}

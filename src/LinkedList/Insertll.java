package LinkedList;

public class Insertll {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Display the linked list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Display the linked list starting from a given node
    public void display(ListNode node) {
        ListNode current = node;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Insert a new node at the beginning of the list
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert a new node at the end of the list
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert a new node at a specified position
    public void insertAtPosition(int position, int value) {
        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }

        ListNode newNode = new ListNode(value);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Delete the first node of the list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete the last node of the list
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
    }

    // Delete a node at a specified position
    public void deleteAtPosition(int position) {
        if (position < 1 || head == null) {
            System.out.println("Invalid position or list is empty");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        ListNode current = head;
        ListNode previous = null;
        int count = 1;

        while (current != null && count < position) {
            previous = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
        } else {
            previous.next = current.next;
        }
    }

    // Get the middle node
    public ListNode getMiddleNode(){
        if(head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next !=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    // Get Nth node from end
    public ListNode getNithNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value: n = " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;

        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    // Reverse the linked list
    public ListNode reverse() {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;  // Update the head to the new head (last element)
        return head;
    }

    public void removeDuplicates(){
        if(head==null){
            return;
        }
        ListNode current = head;

        while(current !=null && current.next !=null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else{
                current = current.next;
            }
        }
    }

    public ListNode insertInSortedList(int value){
        ListNode newNode = new ListNode(value);

        if(head == null || head.data >= value){
            newNode.next = head;
            head = newNode;
            return head;
        }

        ListNode current = head;
        ListNode temp = null;

        while(current !=null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    // Delete a node with a specific key
    public void deleteNode(int key){
        ListNode current = head;
        ListNode temp = null;

        if(current !=null && current.data == key ){
            head = current.next;
            return;
        }
        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if (current == null ){
            return;
        }
        temp.next = current.next;
    }

    // Detect loop
    public boolean containsLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr !=null && fastPtr.next !=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    // Get the starting node of the loop
    public ListNode startNodeInALoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr !=null && fastPtr.next !=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    private ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;
        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;  // starting node of the loop
    }

    // Remove loop
    public void removeLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr !=null && fastPtr.next !=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr){
                removeLoop(slowPtr);
                return;
            }
        }
    }

    private void removeLoop(ListNode slowPtr) {
        ListNode temp = head;
        while(temp.next != slowPtr.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    // Create a loop in the linked list
    public void createALoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third; // Creating the loop
    }

    public static ListNode merge (ListNode a,ListNode b){
        // a --> 1 --> 3 --> 5 --> null
        // b --> 2 --> 4 --> 6 --> null
        // result --> 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> null

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a !=null && b !=null)
        {
            if(a.data <= b.data){
                tail.next = a ;
                a = a.next;
            }
            else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;

        } // a --> 1 --> 3 --> 5 --> null
        // b --> 2 --> 4 --> 6 --> null
        // result --> 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> null

        if(a == null){
            tail.next = b;
        } else{
            tail.next = a;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Insertll sll = new Insertll();

        // Insert at various positions
        sll.insertFirst(1);  // Insert 1 at the beginning
        sll.insertLast(3);   // Insert 3 at the end
        sll.insertAtPosition(2, 2); // Insert 2 at position 2

        // Display the linked list
        sll.display(); // Expected: 1 --> 2 --> 3 --> null

        // Delete nodes
        sll.deleteFirst();   // Delete first node (1)
        sll.deleteLast();    // Delete last node (3)
        sll.deleteAtPosition(1); // Delete node at position 1 (2)

        // Display the linked list
        sll.display(); // Expected: null (empty list)

        // Insert more elements
        sll.insertFirst(5);
        sll.insertFirst(10);
        sll.insertLast(15);

        // Display the linked list before reversing
        System.out.println("Original List:");
        sll.display(); // Expected: 10 --> 5 --> 15 --> null

        // Reverse the linked list
        sll.reverse();

        // Display the linked list after reversing
        System.out.println("Reversed List:");
        sll.display(); // Expected: 15 --> 5 --> 10 --> null

        ListNode nthNodeForEnd = sll.getNithNodeFromEnd(3);
        System.out.println("Nth node from end is " + nthNodeForEnd.data);

        sll.display();
        sll.insertInSortedList(11);
        sll.display();

        sll.deleteNode(5);
        sll.display();

        sll.createALoopInLinkedList();
        System.out.println(sll.containsLoop());
        System.out.println(sll.startNodeInALoop().data);

        sll.removeLoop();
        sll.display();


        Insertll sll1 = new Insertll();
        sll1.insertLast(1);
        sll1.insertLast(4);
        sll1.insertLast(8);


        Insertll sll2 = new Insertll();
        sll2.insertLast(3);
        sll2.insertLast(5);
        sll2.insertLast(8);
        sll2.insertLast(9);
        sll2.insertLast(14);
        sll2.insertLast(18);


        sll1.display();
        sll2.display();

        Insertll result = new Insertll();
        result.head = merge(sll1.head,sll2.head);
        result.display();


    }
}


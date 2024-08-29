package LinkedList;

public class TwoSum {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to add two numbers represented by linked lists
    public ListNode add(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0); // Dummy node to start the result list
        ListNode tail = dummy;
        int carry = 0;

        while (a != null || b != null) {

            int x = (a != null) ? a.val : 0;
            int y = (b != null) ? b.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return dummy.next; // Return the head of the resultant list
    }

    // Main method to test the add function
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Creating first linked list: 2 -> 4 -> 3 (represents the number 342)
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);

        // Creating second linked list: 5 -> 6 -> 4 (represents the number 465)
        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);

        // Adding the two linked lists
        ListNode result = solution.add(a, b);

        // Printing the result: should be 7 -> 0 -> 8 (represents the number 807)
        System.out.print("Resultant list: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}

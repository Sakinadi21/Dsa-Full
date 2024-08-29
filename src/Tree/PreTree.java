package Tree;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PreTree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;  // root ---> first
        first.left = second;
        first.right = third; // second <--- first ----> third

        second.left = fourth;
        second.right = fifth;
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void pre1() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void in1(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void post1() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> output = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            output.push(current);

            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }

        while (!output.isEmpty()) {
            System.out.print(output.pop().data + " ");
        }
    }

    public void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    public int findMax(){
        return findMax(root);
    }

    public int findMax(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);

        if(left > result){
            result = left;
        }
        if(right>result){
            result = right;
        }
        return result;
    }


    public int findMin() {
        return findMin(root);
    }

    public int findMin(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int minValue = root.data;
        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);

        if (leftMin < minValue) {
            minValue = leftMin;
        }
        if (rightMin < minValue) {
            minValue = rightMin;
        }

        return minValue;
    }


    public static void main(String[] args) {
        PreTree pt = new PreTree();
        pt.createBinaryTree();
        System.out.println("Pre-order traversal (recursive):");
        pt.preOrder(pt.root);
        System.out.println("\nPre-order traversal (iterative):");
        pt.pre1();
        System.out.println("\nIn-order traversal (recursive):");
        pt.inOrder(pt.root);
        System.out.println("\nIn-order traversal (iterative):");
        pt.in1(pt.root);
        System.out.println("\nPost-order traversal (recursive):");
        pt.postOrder(pt.root);
        System.out.println("\nPost-order traversal (iterative):");
        pt.post1();
        System.out.println("\nLevel-order traversal:");
        pt.levelOrder();
        System.out.println(pt.findMax());
        System.out.println(pt.findMin());
    }
}







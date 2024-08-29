package BinarySearch;

public class BinarySearchTree {
    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public TreeNode search(int key) {
        return search(root, key);
    }

    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
  /*
    boolean isValid(TreeNode root,long min,long max){
        if(root == null) { //base case
            return true;
        }
        if(root.val <= min || root.val >=max){
            return false;
        }
        boolean left = isValid(root.left,min,root.val);
        if(left){
            boolean right = isValid(root.right,root.val,max);
            return right;
        }return false;
    }
    */





    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 5);  // Insert the first node
        bst.root = bst.insert(bst.root, 3);
        bst.root = bst.insert(bst.root, 7);
        bst.root = bst.insert(bst.root, 1);

        bst.inOrder(bst.root);  // Call inOrder traversal

        System.out.println();

        if (null != bst.search(10)) {
            System.out.println("key found !!! ");
        } else {
            System.out.println("Key not found !!! ");
        }
    }
}

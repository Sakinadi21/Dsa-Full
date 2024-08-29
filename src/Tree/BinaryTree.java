package Tree;

public class BinaryTree<T> {  // Generic BinaryTree class
    private TreeNode<T> root;

    // TreeNode class definition
    private static class TreeNode<T> {
        private T data;
        private TreeNode<T> left;
        private TreeNode<T> right;

        public TreeNode(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }




    // This method now creates a binary tree with Integer nodes
    public void createBinaryTree() {
        TreeNode<Integer> first = new TreeNode<>(1);
        TreeNode<Integer> second = new TreeNode<>(2);
        TreeNode<Integer> third = new TreeNode<>(3);
        TreeNode<Integer> fourth = new TreeNode<>(4);
        TreeNode<Integer> fifth = new TreeNode<>(5);

        // Cast root to TreeNode<Integer>
        root = (TreeNode<T>) first; // root ---> first
        first.left = second;
        first.right = third; // second <-- first --> third

        second.left = fourth;
        second.right = fifth;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.createBinaryTree();

        // Further operations like traversals can be added here
    }
}

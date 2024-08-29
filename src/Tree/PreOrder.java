package Tree;

public class PreOrder {
    /*
    Visit the root node
    Traverse the left subtree in preorder fashion
    Traverse the right subtree in preorder fashion

    public void preOrder(TreeNode root){
    if(root == null) {
    //base case
    return;
    }
    System.out.print(root.data + " " );
    preOrder(root.left);
    preOrder(root.right);
    }
           root -->   9
                   /    \
                  v      v
                 2       3
                / \     /  \
               v   v    v   v
              4   null null null
             /  \
            v    v
           null  null


    call stack
    method call  | line number | root
     preOrder()       6           9
     preOrder()       6           2
     preOrder()       6           4
     preOrder()                   null  then simply remove hbe
     preOrder()       7           4       then simply remove hbe
     preOrder()                   null  then simply remove hbe
     preOrder()       7           2       then simply remove hbe
     preOrder()       6           3
     preOrder()                   null  then simply remove hbe
     preOrder()       6           3       then simply remove hbe
     preOrder()       7           3
     preOrder()                  null  then simply remove hbe
     preOrder()       7           3       then simply remove hbe
     preOrder()       7           9      then simply remove hbe


     */
}

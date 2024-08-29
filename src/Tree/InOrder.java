package Tree;

public class InOrder {
    /*
    Traverse the left subtree in In order fashion
    Visit the root node
    Traverse the right subtree in In order fashion


    public void inOrder(TreeNode root){
    if(root == null ) { //base case
       return;
    }
    inOrder(root.left);
    System.out.println(root.data + " " );
    inOrder(root.right);


               Call stack
    method call    |  line number  | root
    InOrder()      |    5          |  9
    InOrder()      |    5          |  2
    InOrder()      |    5          |  4
    InOrder()      |    5          |  null  return hbe remove hbe
    InOrder()      |    7          |  4
    InOrder()      |    7          |  4 remove hbe
    InOrder()      |    5          |  4

    InOrder()      |              |  null  return hbe remove hbe
    InOrder()      |    7          |  2  remove hbe
    InOrder()      |    5          |  9 remove hbe

        root -->   9
                /     \
               v       v
               2        3
              / \      / \
             v   v     v   v
            4   null  null null

           / \
          v   v
        null  null

    output :- 4293


     */
}

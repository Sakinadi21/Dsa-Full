package BinaryHeap;

public class ParentChild {
    /*
               9
             /    \
            V      V
            3      6
           / \    / \
          V  V   V  V
          2  1   5  4
             Max Heap

      Children of 1st index = 2,3
      Children of 2nd index = 4,5
      Children of 3rd index = 6,7
      Children of kth index = 2*k , 2*k+1


      Parent of 7th index = 3 ==> 7 / 2 = 3.5 ~ 3
      Parent of 6th index = 3 ==> 6 / 2 = 3
      Parent of 5th index = 2 ==> 5 / 2 = 2.5 ~ 2
      Parent of kth index = k/2

     */
}

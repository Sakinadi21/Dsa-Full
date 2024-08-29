package Hashing;

public class Problem {
    /*
    Linear Search
    -----------------------------------------------------------
    | 5  |  1 |  9  |  2  |  10  |  6  |  4 |  3  |  0  |  7  |
    -----------------------------------------------------------
      0    1     2     3     4      5     6     7    8     9
             Time Complexity - 0(n)


     Binary Search

    ----------------------------------------------------------------
    | 1  |  3 |  5  |  9  |  10  |  12  |  15 |  19  |  21  |  25  |
    ----------------------------------------------------------------
      0    1     2     3     4      5     6     7    8     9



      Solutions - Arrays
      Arrays can be used to provide 0(1) searches using indexes

                          key space
                      ---------------
                   /  3           9  \
                   |6               7 |                Search
                   \  1            5 /                    3      found
                     ---------------                      0      not found

   ----------------------------------------------------------------
    |   |  1 |    |  3  |     |  5  |  6  |  7    |     |  9 |
   ----------------------------------------------------------------
      0    1     2     3     4      5     6     7    8     9


      Aadhar Card Number - 12 digits

      Direct addressing would require huge array to store numbers
      Memory of most of the array elements will remain un-utilized and wasted.


      What is Hashing?
      Hashing is a technique used for storing , retrieving and removing
      information as quick as possible.
      It's process of converting an arbitrary size key into fixed sized value.
      The conversion is done via special function called as HASH function.
      The operations supported by hashing such as sorting , retrieving and
      removing information have average runtime complexity of 0(1).

      What are Hash Functions?
      A Hash function simply takes an arbitrary size key and provides fixed size value
      also called as index .


      Modular Hash Function
        A Modular Hash function simply takes a key and size , returns
        remainder by dividing key by side.

        The remainder is used as an index to store the key in an array of
        provided size.

        index = h(key)
              = key % size
              size = 10

                                       0   | 10 |
                                           ------                      5 % 10 = 5
                                       1   | 1  |
                                           ------                       1 % 10 = 1
                                       2   |    |
                                           ------                      10 % 10 = 0
                                       3   |    |
                                           ------                       26 % 10 = 6
                                       4   |    |
                                           ------                       99 % 10 = 9
            key Space                  5   |  5 |
                                           ------
                5                      6   | 26 |
                                           ------
                1                      7   |    |
                                           ------
                10                     8   |    |
                                           ------
                26                     9   | 99 |
                                           ------
                99



        What is a Hash table?
        It is generalized form of an array .
        It stores the data in form of key-value pair .
        It converts key to an index using hash function .
        Taking the index we store key-value in array .
        The primary operations supported by HashTable are -
             put(key,value) - Adds key-value pair against unique key.
             get(key) - Get value for the provided key.
             remove(key) - Removes the key-value pair from HashTable.

          Average running time is of 0(1).
          Java Collections Framework has HashMap class - if we want to
          deal with key-value pair and HashSet class if we want to deal
          with only keys.



                   Simple Hash Table

           index = h(key)
                 = key % size
             size =

                                              ----
                                            0 |   |   10,James
                                              -----
                                            1 |   |   1,Tom
                                              ------
                                            2 |   |
                                              -----
             Key - Value Space               3|   |
                                              -----
                                             4|   |
                                             -------
                 5, John  ---------------->  5|    |   5,John       5 % 10 = 5
                                              ------                1 % 10 = 1
                 1, Tom                      6|    |   26,Tina     10 % 10 = 0
                10, James                     ------               26 % 10 = 6
                26, Tina                     7|    |               99 % 10 = 9
                99, Sana                      ------              105 % 10 = 5   (Collision)
               105, Mary                     8|    |
                                              ------
                                             9|    |
                                              ------


                                         Separate Chaining


           index = h(key)
                 = key % size
             size = 10
                                              ----    --------------------
                                            0 |   |   | 10 | James |  ---|--> null      5 % 10 = 5
                                              -----   --------------------              1 % 10 = 1
                                            1 |   |   |  1 |  Tom  |  ---|--> null      10 % 10 = 0
                                              ------  --------------------
                                            2 |   |
                                              -----
             Key - Value Space               3|   |
                                              -----
                                             4|   |
                                             -------   -------------------       -----------------
                 5, John  ---------------->  5|    |   |  5 |  John  | ---|----> | 105 |Mary | --|--> null
                                              ------   --------------------      -----------------
                 1, Tom                      6|    |   | 26 | Tina   |  --|----> null
                10, James                     ------   -------------------          26 % 10 = 6
                26, Tina                     7|    |                                99 % 10 = 9
                99, Sana                      ------                                105 % 10 = 5
               105, Mary                     8|    |
                                              ------
                                             9|    |
                                              ------
                             Representation of a HashNode in HashTable
                A HashNode class in HashTable consists of three data members .
                1. K key - It is a unique value which helps in storing data . Here, k signifies generic type.
                2. V value - It is data that is stored based on location computed by key. Here, V
                signifies generic type .
                3. HashNode next - It refers to next HashNode in chain of hash nodes.

                        HashNode
                        K key
                        V value                  | key | value | next |
                        HashNode next                 HashNode



public class HashTable {
  private HashNode[] buckets;
  private int numOfBuckets;
  private int size;

  public HashTable(int capacity){
  this.numOfBuckets = capacity;
  buckets = new HashNode[capacity];
  }
  private class HashNode{
  private Integer key ;
  private String value ;
  private HashNode next;

  public HashNode(Integer key , String value) {
  this.key = key ;
  this.value = value;
       }
   }
}


     */
}

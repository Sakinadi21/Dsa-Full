package Trie;

public class Basic {
    /*
    Trie basically comes from the word ReTRIeval.
    The main purpose of this data structure is to reverse stored information
    very fast .

    A trie with 4 words -
    1. dog
    2. dust
    3. hat
    4. home

        root -->  ----
                  |  |
                  ----
                 /    \
                V      V
               d       h
              / \     / \
             V   V   V   V
             o   u   a   0
             |   |   |   |
             V   V   V   V
             g   s   t   m
                 |       |
                 V       V
                 t       e


   Applications - Auto complete words
   Auto complete feature is implemented by Tries.
   Many websites have used autocomplete feature , which suggest
   user rest of the world,while user is typing.

   Applications - Search Contacts in phone
   Searching a person contact number in contact list is efficiently implemented
   by Trie .As soon as user enters letter the application auto suggest the name of the person.

   Applications - Spell Checking
   Tries help to check and correct word spelling entered by user. In case , user doesn't know exact
   spelling it auto suggest the correct spelling .


   Representation of a TrieNode in Trie
   A TrieNode class in Trie consists of two data members .
   1. TrieNode[] children -
   An array which refers to other TrieNodes in Trie , also called as child nodes of a TrieNode .
   The size of array is usually taken as 26(if we are storing English words)
   2. boolean isWord - A boolean value to indicate the end of word. This value is set as
   true when a word is inserted completely.

                                 TrieNode
                               TrieNode[] children
                               boolean isWord


   Implementation of the Trie class
   A Trie will be implemented using TrieNode class .
   A root TrieNode is at top with empty value having 26 links (one per alphabet )
   The links are either null or points to another TrieNode.





   a -> 0th index                                    a b  c    g h      n o       r s t u        z
   b -> 1st index         TrieNode[] children  -->  | | | |...| | | ...| | | ....|  |  |  |  |..| |
   c -> 2nd index                                    0 1 2     6  7    13 14      17 18 19 20    25
      .                          boolean isWord --> false
      .
   j -> 9th index
   k -> 10th index
   l -> 11th index
      .                              char a = 'a'
      .                              System.out.println((int ) a) ; //prints 97
    x -> 23rd index                  System.out.println(a - 'a') ; // prints 0
    y -> 24th index                  char h = 'h';
    z -> 25th index                  System.out.println(h - 'a') ; // prints 7
                                     char z = 'z';
                                     System.out.println(z - 'a') ; // prints 25

                                     public int getIndex(char letter) {
                                       return letter - 'a';
                                       }
     */
}

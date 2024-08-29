package Interval;

public class Basic {
    /*                                                      s  e
    An interval is a range represented by two numbers like (5,8).
    The two numbers are termed as - start and end.
    Example - Time interval in tasks or jobs -
    a => (1,3) , b =>(4,5)  , c => (8,10) , d => (9,11)

    0     1     2    3   4    5    6    7    8    9    10   11
    ----|----|----|----|----|----|----|----|----|----|----|----> time axis  (sec,ms,ns)
        |  1,3    |
             a
                       | 4,5| (1 sec)           c
                         b                 | 8,10    | (2 sec)
                                                |  9,11   |  (2sec)
                                                     d


                                     Interval Representation

                           public class Interval {
                              private int start;
                              private int end ;

                              public Interval(int start , int end ){
                                  this.start = start;
                                  this.end = end;
                                  }
                              }

    
    
    
     */
}

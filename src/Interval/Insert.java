package Interval;

public class Insert {

    /*
    c(min(a.start , b.start ) , max (a.end , b.end)
    |   a    | |   b    |  =>   a and b do not overlap,simply insert a

    |  a    |             => a and b overlap,new merged interval will be
         |    b    |             c(a.start,b.end)

    |         a        |             => a and b overlap,new merged interval will be
         |    b    |             c(a.start,a.end)


           |       a      |             => a and b overlap,new merged interval will be
    |        b    |                      c(b.start,a.end)


        |    a    |             => a and b overlap,new merged interval will be
   |          b         |             c(b.start,b.end)




   intervals = [{1,3},{5,7},{8,10},{11,12}]
   newInterval = [{4,9}]
   0   1    2    3    4    5    6    7    8    9    10   11   12
   ----|----|----|----|----|----|----|----|----|----|----|-----|----> time axis
       | 1,3     |         | 5,7     |    | 8,10    |    |11,12|
                      |    4,9                 |
                      |           4,10              |
                      
       Skip and add intervals that come before new interval to result.
       Merge all intervals that overlap with new interval
       Add the merged interval to result
       Insert the remaining intervals to result






     */
}

package Kadanes;

public class Max {
    /*
    -----------------------------------------------------
    |  4  |  3  |  -2  |  6  | -12  |  7  |  -1  |  6   |
    -----------------------------------------------------


    currentMax           |    maxSoFar/ best sum   |      Should I become a part of current sub array?

    4,  {4}                  4 - {4}                              {4,3} ->  7
    7, {4,3}                 7-{4,3}                              7+(-2) --> 5
    5, {4,3,-2}               7-{4,3}                             5+6=11
    11,{4,3,-2,6}             11-{4,3,-2,6}                        11+(-12)=-1
    -1,{4,3,-2,6,-12}           11-{4,3,-2,6}                        -1+7=6
    7,{7}                       11 - {4,3,-2,6}                      7+(-1) = 6
    6,{7,-1}                    11-{4,3,-2,6}                          6+6=12
    12,{7,-1,6}                  12-{7,-1,6}
                                                           Should I start a new sub array?
                                                               {3} --->  3
                                                               (-2)
                                                               6
                                                               (-12)
                                                               7
                                                               (-1)
                                                               6


           arr[]   |  4  |  3  |  -2  |  6  |  -12  |  7  |  -1   |  6
                      0    1      2      3      4      5     6       7

                                                           CM= Math.max(cm+arr[i],arr[i] )
                                                           CM=5+6 =11


          CM                        MSF
          4 {4}                    4{4}
          7{4,3}                   7{4,3}
          5{4,3,-2}                7{4,3}
          11{4,3,-2,6}


          public int maxSubArraySum(int[] arr)  {
               int maxSoFar = arr[0];
               int currentMax = arr[0];
               for(int i = 1; i<arr.length;i++){
                     currentMax = currentMax + arr[i];
                     if(currentMax < arr[i] ) {
                        currentMax = arr[i];
                        }
                          if(maxSoFar < currentMax) {
                            maxSoFar = currentMax;
                             }
                         }
                          return maxSoFar;
                      }
     */
}












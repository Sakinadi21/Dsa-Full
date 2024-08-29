package Basic;

public class AverageExample {
  /*  Print average of 3 given numbers.
    Let say you want to write algorithm for it.
            So,the steps would be-
    1.perform sum of 3 numbers
    2.store in a variable sum.
    3.divide the sum by 3.
    4.store the value in variable avg.
    5.print the value stored in avg

   */

    public void findAvg(int a,int b,int c){
         int sum = a+b+c;
         int avg = sum/3;
         System.out.println(avg);
            }
}

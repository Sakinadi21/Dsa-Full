package DynamicProgramming;

public class Basic {
    /*
    Jonathan Paulson amazingly explains What's Dynamic Programming on
    Quora as -
    Writes down "1+1+1+1+1+1+1+1=" on a sheet of paper
    What's the equal to?
    Writes down another "1+" on the left.
    What's about that ?
    "Nine!" - "How'd you know it was nine so fast?"
    "You just added one more!"
    "So you didn't need to recount because you remembered there were eight!"
    Dynamic Programming is just a fancy way to say remembering stuff to save time later !"

                        Dynamic Programming
        It is a technique in which a complex problem is solved by -
        1.Breaking it into smaller sub-problems.
        Solving those stored result if sub-problems occurs/overlaps again.(Again solving
        sub-problem again)
        Finally using solutions to smaller problems build up solution to complex problem.


        It is mainly an optimization over recursion
        Dynamic Programming = Recursion + Memorization

                        Fibonacci Series

       It is a series of numbers in which first two numbers are 0 and 1 .
       After that each number is the sum of the two preceding numbers .
                 0,1,1,2,3,5,8,13,21

                 fib(0) = 0
                 fib(1) = 1
                 fib(n) = fib(n-1) + fib(n-2)


         public int fib(int n){
           if( n == 0) return 0;
           if( n == 1) return 1;
           int left = fib(n-1);
           int right = fib(n-2);
           return left + right ;
           }

   Optimal Substructure
   A given problem has Optimal Substructure Property if optimal solution of the given problem
   can be obtained using the optimal solution of its sub-problems .
   Example - fib(n) = fib(n-1) + fib(n-2)

   Overlapping Sub problems
   A given problem has Overlapping Sub problems Property if solution of the given
   problem is obtained by solving same sub problems multiple times.

   Bottom Up Approach
   We try to solve smaller sub-problems first, use their solution to build on and arrive at solutions
   to bigger sub-problems .
   It is also called as Tabulation method.
   The solution is build in a tabular form by using solutions of smaller sub-problems
   iteratively and generating solutions to bigger sub-problems.

   Top Down Approach
   It is also called as Memoization .
   We break the large problem into multiple sub-problems.
   Each of the sub - problems are solved and solutions are remembered.
   If the sub-problem is solved already, reuse the answer.
   Else solve the sub-problem and store the result .
   Thus, it memorizes the solution of the sub-problem to avoid recomputing the value
   if sub-problem is encountered again.









     */
}

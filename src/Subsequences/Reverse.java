package Subsequences;

public class Reverse {
    public long reverse(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number = number * -1;
        }
        long reverse = 0;
        int lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return isNegative ? reverse * -1 : reverse;
    }

    public static void main(String[] args) {
        Reverse rev = new Reverse();
        System.out.println(rev.reverse(1234));  // Output: 4321
        System.out.println(rev.reverse(-1234)); // Output: -4321
        System.out.println(rev.reverse(1353));  //Output: 3531
    }
}

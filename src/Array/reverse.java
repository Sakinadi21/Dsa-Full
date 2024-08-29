package Array;
//Give an array or string , the task is to reverse the array or string
//Example - Give array of integers - {2,11,5,10,7,8}
//Solution - return  reverse of array - {8,7,10,5,11,2}

public class reverse {
    public static void reverse(int[] numbers,int start,int end){
        while(start<end){
            int temp = numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }

    public static void printArray(int []arr){
        for(int i = 0 ;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {2, 11, 5, 10, 7, 8};
        printArray(numbers);
        reverse(numbers,0, numbers.length-1);
        printArray(numbers);
        printArray(numbers);
    }
}

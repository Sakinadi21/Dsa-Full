package Array;

public class ArrayUtill {
    public void printArray(int []arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayUtill arrUtil = new ArrayUtill();
        arrUtil.printArray(new int[]{5,2,1,9,10});
    }
}

package Array;

public class Resize {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int[] resize (int [] arr, int capacity){
        int [] temp = new int[capacity];
        for(int i = 0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;

        return


                arr;
    }

    public static void main(String[] args) {
        Resize re = new Resize();
        int [] orginal = new int[] {5,1,2,9,10};
        System.out.println("The size of original array = "+orginal.length);
        orginal = re.resize(orginal,10);
        System.out.println("The size of original array after resize = "+orginal.length);
    }
}

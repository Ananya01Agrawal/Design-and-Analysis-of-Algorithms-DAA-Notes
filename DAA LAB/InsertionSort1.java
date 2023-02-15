import java.util.Arrays;
class Main{
    public static void main(String []args){
        int arr[]=new int[]{2,1,4,3,2,6,7};
        InsertionSort1.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

public class InsertionSort1 {
    public static void insertionSort(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int hole =i;
            int value=arr[hole];
            while(hole>0&&arr[hole-1]>value){
                arr[hole]=arr[hole-1];
                hole=hole-1;
            }
            arr[hole]=value;
        }
    }
}

/*
 analysis of insertion sort:

Time Complexity: O(n^2)
Space Complexity: O(1)
Stable: Yes
In-Place: Yes
Adaptive: Yes

Best Case: O(n)
Worst Case: O(n^2)
Average Case: O(n^2)

 */
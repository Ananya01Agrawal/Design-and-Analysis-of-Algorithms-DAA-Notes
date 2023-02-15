
import java.util.Arrays;
class Main{
    public static void main(String []args){
        int arr[]={9,1,4,5,8,9,2,0};
        SelectionSort1.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
public class SelectionSort1 {
    public static void selectionSort(int []arr){
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            int iMin=i;
            for(int j=i+1;j<n;j++){
                if(arr[iMin]>=arr[j])
                iMin=j;
            }
            int temp=arr[i];
            arr[i]=arr[iMin];
            arr[iMin]=temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}

/*
[0, 1, 4, 5, 8, 9, 2, 9]
[0, 1, 4, 5, 8, 9, 2, 9]
[0, 1, 2, 5, 8, 9, 4, 9]
[0, 1, 2, 4, 8, 9, 5, 9]
[0, 1, 2, 4, 5, 9, 8, 9]
[0, 1, 2, 4, 5, 8, 9, 9]
[0, 1, 2, 4, 5, 8, 9, 9]
[0, 1, 2, 4, 5, 8, 9, 9]

Analysis of Selection Sort:

Time Complexity: O(n^2)
Space Complexity: O(1)
Stable: No
In-Place: Yes 
Adaptive: No
what is adaptive sorting algorithm ?     
The sorting algorithms in which the order of elements affects the time complexity of the sorting algorithm is known as an adaptive sorting algorithm.
 

 */

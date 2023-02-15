import java.util.Arrays;
class Main{
    public static void main(String []args){
        int arr[]=new int[]{9,1,2,1,8,7,5,2};
        BubbleSort1.bubbleSort(arr);
        System.out.println();
        BubbleSort1.improvedBubbleSort(arr);
        System.out.println();
        BubbleSort1.bubbleSort(arr);
    }
}
public class BubbleSort1 {
    public static void bubbleSort(int []arr){
        int n=arr.length;
        for(int i=1;i<=n-1;i++){
            for(int j=0;j<=n-2;j++){
                // if(arr[j]<arr[j+1]) --for descending order
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void improvedBubbleSort(int []arr){
        int n=arr.length;
        for(int k=1;k<=n-1;k++)
        {
            boolean flag =false;
        for(int i=0;i<=n-k-1;i++){
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                flag=true;
            }

        }
        System.out.println(Arrays.toString(arr));
        if(flag==false){
            break;
        } 
        }
    }
}

/*
  
[1, 2, 1, 8, 7, 5, 2, 9]
[1, 1, 2, 7, 5, 2, 8, 9]
[1, 1, 2, 5, 2, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]

in n pass it get sorted


perform sorting using without improvement
[1, 2, 1, 8, 7, 5, 2, 9]
[1, 1, 2, 7, 5, 2, 8, 9]
[1, 1, 2, 5, 2, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]

with improvement
[1, 1, 2, 2, 5, 7, 8, 9] in single pass

without improvement
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9] 
[1, 1, 2, 2, 5, 7, 8, 9]
[1, 1, 2, 2, 5, 7, 8, 9]  --- n-1 pass
 */
/*
 * Time complexity: o(n^2)
 * Space Complexity: o(1)
 * inplace: yes
 * stable: yes
 * comparison:yes
 * adaptive: yes-- if array is already sorted then it will take less time sort
 */
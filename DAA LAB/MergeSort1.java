import java.util.Arrays;
class Main{
    public static void main(String []args){ 
        int arr[]=new int[]{2,1,5,7,1,6,9,0,4};
        System.out.println(Arrays.toString(arr));
        MergeSort1.mergeSort(arr);
       String str= Arrays.toString(arr);
       System.out.println(str);
    }
}

 class MergeSort1 {
    public static void mergeSort(int []arr){
       
        int n=arr.length;
        if(n<2)return;
        int mid=n/2;
        int []left=new int[mid];
        int []right=new int[n-mid];

        for(int i=0;i<=mid-1;i++){
            left[i]=arr[i];
        }
    //    System.out.println( Arrays.toString(left));
        for(int i=mid;i<n;i++){
            right[i-mid]=arr[i];
        }
        // System.out.println( Arrays.toString(right));
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);
      
    }

  private static void merge(int []left,int []right, int []arr){
int n=left.length;
int m=right.length;
int i=0;
int j=0;
int k=0;

while(i<n&&j<m){
    if(left[i]<=right[j]){
        arr[k]=left[i];
        i++;
    }
    else{
        arr[k]=right[j];
        j++;
    }
    k++;
}

while(i<n){
    arr[k]=left[i];
    i++;
    k++;
}

while(j<m){
    arr[k]=right[j];
    j++;
    k++;
}
// System.out.println(Arrays.toString(arr));
    }
}

/*
How mergesort work?
                            
                       [2, 1, 5, 7, 1, 6, 9, 0, 4]
               [2, 1, 5, 7]                  [1, 6, 9, 0, 4]
             [2, 1]    [5, 7]              [1, 6]      [9, 0, 4]
            [2]  [1]  [5]  [7]            [1]  [6]    [9]   [0, 4]
                                                          [0]   [4]


                       [2, 1, 5, 7, 1, 6, 9, 0, 4]
               [2, 1, 5, 7]                  
             [2, 1]                  
            [2]  [1]  --> [1,2]           
                                                                                                   

                       [2, 1, 5, 7, 1, 6, 9, 0, 4]
               [2, 1, 5, 7]                  
             [1,2]      [5, 7]  
                       [5]  [7]   --> [5,7]

                       
                       [2, 1, 5, 7, 1, 6, 9, 0, 4]
               [2, 1, 5, 7]                  
             [1,2]     [5,7] --->[1,2,5,7]

                       [2, 1, 5, 7, 1, 6, 9, 0, 4]
               [1,2,5,7]             [1, 6, 9, 0, 4]
                                   [1, 6]    
                                  [1]  [6]  -->[1,6]

                       [2, 1, 5, 7, 1, 6, 9, 0, 4]
               [1,2,5,7]             [1, 6, 9, 0, 4]
                                   [1,6]      [9, 0, 4]
                                             [9]   [0, 4]
                                                 [0]   [4] --> [0,4]
                                                   
                       [2, 1, 5, 7, 1, 6, 9, 0, 4]
               [1,2,5,7]             [1, 6, 9, 0, 4]
                                   [1,6]      [9, 0, 4]
                                             [9]   [0,4] -->[0,4,9]

                       [2, 1, 5, 7, 1, 6, 9, 0, 4]
               [1,2,5,7]             [1, 6, 9, 0, 4]
                                   [1,6]      [0,4,9]
                                                                                    

                       [2, 1, 5, 7, 1, 6, 9, 0, 4]
               [1,2,5,7]             [1, 6, 9, 0, 4]
                                   [1,6]      [0,4,9] -->[0,1,4,6,9]                                                                                      
                                                    
                       [2, 1, 5, 7, 1, 6, 9, 0, 4]
               [1,2,5,7]                 [0,1,4,6,9]   --> [0,1,1,2,4,5,6,7,9]

                          [0,1,1,2,4,5,6,7,9]

                             
                   





 */
import java.util.Arrays;

class Main{
    public static void main(String []args){
Quick obj=new Quick();
int arr[]=new int[]{2,1,5,7,1,6,9,0,4};
System.out.println(Arrays.toString(arr));
obj.quickSort(arr,0,arr.length-1);
System.out.println(Arrays.toString(arr));
    }
}

class Quick{
    public void quickSort(int []arr,int start,int end){
if(start<end){
int pIndex=partion(arr, start, end);   
quickSort(arr, start, pIndex-1);      
quickSort(arr, pIndex+1, end);        
}
    }

    public int partion(int []arr,int start,int end){
        int pIndex=start;
        int pivot=arr[end];
        for(int i=start;i<=end-1;i++){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[pIndex];
                arr[pIndex]=temp;
                pIndex +=1;
            }
        }
        arr[end]=arr[pIndex];
        arr[pIndex]=pivot;
        return pIndex;
         
    }
}
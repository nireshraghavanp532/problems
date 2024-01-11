/*Given a random set of numbers, Print them in sorted order.

Example 1:

Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: {1, 2, 3, 5}
Explanation: After sorting array will
be like {1, 2, 3, 5}.*/
public class QuickSort {
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[]arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){//(arr[j)>pivot) for descending
                i++;
                swap(arr,i,j);

            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void quickSort(int[]arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    public static void main(String[] args) {
        int []A={2,1,6,3,9,4,3};
        int n=A.length-1;
        quickSort(A,0,n);
        for(int k:A){
            System.out.print(k+" ");
        }
    }
}

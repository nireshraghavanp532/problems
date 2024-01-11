/*A sorted(in ascending order) array A[ ] with distinct elements is rotated at some unknown point, the task is to find the minimum element in it.

Example 1

Input:
N = 5
arr[] = {4 ,5 ,1 ,2 ,3}
Output: 1
Explanation: 1 is the minimum element in the array.
Example 2

Input:
N = 7
arr[] = {10, 20, 30, 40, 50, 5, 7}
Output: 5
Explanation: Here 5 is the minimum element.


Your Task:
Complete the function findMin() which takes an array arr[] and n, size of the array as input parameters, and returns the minimum element of the array.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(log N).*/
public class MinInSortedAndRotatedArr {
    public static void main(String[] args) {
        int[]arr={10, 20, 30, 40, 50,5,7};
        System.out.print(findMin(arr,arr.length));
    }
    static int findMin(int arr[], int n)
    {
        //complete the function here
        if(arr[0]<arr[n-1]){
            return arr[0];
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                return arr[i];
            }
        }
        return 0;
    }
}

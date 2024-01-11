import java.util.HashMap;

/*Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
Example 2:

Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120.*/
public class MaxProductInSubArray {
    public static void main(String[] args) {
        int[]arr={2, 3, 4, 5, -1, 0};
        System.out.print(maxProduct(arr,arr.length));
    }
    static long maxProduct(int[] arr, int n) {
        // code here
        long minMul=arr[0];
        long globalMul=arr[0];
        long maxMul=arr[0];
        for(int i=1;i<n;i++){
            long a=(long)arr[i];
            long temp=Math.max(Math.max(a,a*maxMul),a*minMul);
            minMul=Math.min(Math.min(a,a*maxMul),a*minMul);
            maxMul=temp;
            globalMul=Math.max(maxMul,globalMul);

        }

        return globalMul;
    }
}

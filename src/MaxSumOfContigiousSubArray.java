import java.util.Collections;

/*Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which
is a contiguous subarray.
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1
of element (-1)*/
public class MaxSumOfContigiousSubArray {
    public static void main(String[] args) {
        int[]arr={1,5,-6,4,2,8,-1};
        System.out.print(maxSubarraySum(arr,arr.length));
    }
    static long maxSubarraySum(int arr[], int n){

        // Your code here

        long currSum=0;
        long globalSum=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            currSum+=(long)arr[i];
            if(currSum>globalSum){
                globalSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }

        return globalSum;
    }
}

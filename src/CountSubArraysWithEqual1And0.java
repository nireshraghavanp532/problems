import java.util.HashMap;

/*Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s.

Example 1:

Input:
n = 7
A[] = {1,0,0,1,0,1,1}
Output: 8
Explanation: The index range for the 8
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4),
(4, 5) ,(2, 5), (0, 5), (1, 6)
Example 2:

Input:
n = 5
A[] = {1,1,1,1,0}
Output: 1
Explanation: The index range for the
subarray is (3,4).
Your Task:
You don't need to read input or print anything. Your task is to complete the function countSubarrWithEqualZeroAndOne() which takes the array arr[] and the size of the array as inputs and returns the number of subarrays with equal number of 0s and 1s.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= n <= 106
0 <= A[i] <= 1*/
public class CountSubArraysWithEqual1And0 {
    public static void main(String[] args) {
        int[]arr={1,0,0,1,0,1,1};
        System.out.print(countSubarrWithEqualZeroAndOne(arr,arr.length));
    }
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=(arr[i]==0)? -1:1;
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;


    }
}

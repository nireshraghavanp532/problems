import java.util.HashMap;
import java.util.Map;

/*Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.


Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation:
arr[0] + arr[1] = 1 + 5 = 6
and arr[1] + arr[3] = 5 + 1 = 6.

Example 2:

Input:
N = 4, K = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation:
Each 1 will produce sum 2 with any 1.
*/
public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[]A={1,3,3,5,5,1,8,10};
        int n=A.length;
        int k=6;
        System.out.print(getPairsCount(A,n,k));

    }
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int currSum=0;
        int count=0;
        int []pairs=new int[k+1];
        for(int i=0;i<n;i++){
            if(arr[i]<k){
                pairs[arr[i]]++;
            }
        }
        for(int i=1;i<=k/2;i++){
            if(k%2==0 && i==k/2){
                if(pairs[i]>1){
                    count+=pairs[i]*(pairs[i]-1)/2;
                }

            }
            else{
                count+=pairs[i]*pairs[k-i];
            }
        }
        return count;
    }
}

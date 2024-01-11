import java.util.Scanner;

/*Given an array of integers of size N, for all, i's [1, N], the task is to find the minimum subarray sum in the subarray [i, N].

Input:
1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
2. The first line of each test case contains a single integer N.
3. The second line contains N space-separated positive integers represents array.

Output: For each test case, print N space-separated integers

Constraints:
1. 1 <= T <= 10
2. 1 <= N <= 100000
3. -10000 <= arr[i] <= 10000

Example:
Input:
2
3
3 -1 -2
5
5 -3 -2 9 4

Output:
-3 -3 -2
-5 -5 -2 4 4

Explanation:
Test case 1:

1. i = 1, subarray is [3, -1, -2], all possible subarrays are [3], [-1], [-2], [3, -1], [-1, -2], [3, -1, -2]. Minnimum sum is -3 [-1, -2].
2. i = 2, subarray is [-1, -2], all possible subarrays are [-1], [-2], [-1, -2]. Minnimum sum is -3 [-1, -2].
3. i = 3, subarray is [-2], all possible subarrays are [-2]. Minnimum sum is -2[-2].*/
public class MinSumOfContigiousSubArray {
    public static void main (String[] args) {
        //code
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-- >0){
            int n=in.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            for(int i=0;i<n;i++){
                int globalMin=Integer.MAX_VALUE;
                int currMin=0;
                for(int j=i;j<n;j++){
                    currMin+=arr[j];
                    if(currMin<globalMin){
                        globalMin=currMin;
                    }
                    if(currMin>0){
                        currMin=0;
                    }

                }
                System.out.print(globalMin+" ");

            }
            System.out.println();
        }
    }
}

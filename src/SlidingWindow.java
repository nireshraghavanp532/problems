/*Given an array arr of integers of size N and an integer K, the task is to find the length of the longest subarray with at most K even elements

Input:
1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
2. The first line of each test case contains two space-separated integers N and K.
3. The second line contains N space-separated positive integers represents array arr.

Output: For each test case, print the length of the longest subarray with at most K even elements.

Constraints:
1. 1 <= T <= 10
2. 1 <= K <= N <= 100000
3. 0 <= arr[i] <= 100000

Example:
Input:
2
4 2
1 2 3 4
4 1
1 2 3 4

Output:
4
3

Explanation:
Test case 1: {1, 2, 3, 4} has 2 even elements
Test case 2: {1, 2, 3} has 1 even elements*/
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class SlidingWindow {
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]%2 == 0) {
                    arr[i]=1;
                }
                else{
                    arr[i]=0;
                }
                sum+=arr[i];
            }
            //  System.out.println(sum);
            //int s=0,e=n-1;
            //  while(sum>k){
            //      sum-=arr[s];
            //      ++s;
            //  }
            //  int windowSize = e - s + 1;
            //         maxSize = Math.max(maxSize, windowSize);
            System.out.println(WindowSize(arr,n,k));
        }
    }
    public static int WindowSize(int[] arr, int n, int k) {
        int currentSum = 0;
        int start = 0;
        int maxSize = 0;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            while (currentSum > k) {
                currentSum -= arr[start];
                start++;
            }

            int windowSize = end - start + 1;
            maxSize = Math.max(maxSize, windowSize);
        }

        return maxSize;
    }
}

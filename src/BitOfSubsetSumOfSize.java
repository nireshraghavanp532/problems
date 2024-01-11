/*Given an array arr of positive integers of size N and an integer K, the task is to find the sum of all subsets of size K.

Input:
1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
2. The first line of each test case contains two integers N and K.
3. The next line contains N space-separated integers.


Output: For each test case, print the answer

Constraints:
1. 1 <= T <= 10
2. 1 <=  K <= N <= 12
3. 1 <= arr[i] <= 100

Example:
Input:
2
4 2
1 2 3 5
1 1
20

Output:
33
20

Explanation:
Test Case 1: Subsets are {1, 2}, {1, 3}, {1, 5}, {2, 3}, {2, 5}, {3, 5}, Summation of all subsets sum = 3 + 4 + 6 + 5 + 7 + 8 = 33*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class BitOfSubsetSumOfSize {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt(), p = sc.nextInt();

            int a[] = new int[n];
            for(int j=0;j<n;j++)
                a[j] = sc.nextInt();
            long sum = 0;
            for(int j=1; j<(1 << n);j++){
                int tempsum = 0, countOfBits = 0, k = j, l = 0;
                while(k != 0){
                    if((k&1) == 1){
                        tempsum += a[l];
                        countOfBits++;
                    }
                    l++;
                    k = k >> 1;
                }
                if(countOfBits == p){
                    sum += tempsum;
                }
            }
            System.out.println(sum);
        }
    }
}

import java.util.Scanner;

/*Reena had been given an array arr[] of positive integers of size N.Help her to find the value A.

A = arr[n]*arr[n] - arr[n-1]*arr[n-1] + arr[n-2]*arr[n-2] - ......... upto index 1

Input:
1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
2. The first line of each test case contains a single integer N.
3. The second line contains N space-separated positive integers represents array arr.

Output: For each test case, print the value of A in a single line

Constraints:
1. 1 <= T <= 10
2. 1 <= N <= 100000
3. 1 <= arr[i] <= 100

Example:
Input:
2
3
1 2 3
4
4 8 1 2

Output:
6
51

Explanation:
Test case 1 : 3*3 - 2*2 + 1*1 = 6

*/
public class ReverseSquaredSum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-- >0){
            int n=in.nextInt();
            int []arr=new int[n];
            in.nextLine();
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            int A=0;
            if(n%2!=0){
                for(int i=n-1,j=n-2;i>-1 || j>-1 ;i-=2,j-=2){
                    if(j==0){
                        A+=-(arr[j]*arr[j]);
                    }
                    else if(i==0){
                        A+=arr[i]*arr[i];
                    }
                    else{
                        A+=(arr[i]*arr[i])-(arr[j]*arr[j]);
                    }
                }
            }
            else{
                for(int i=n-1,j=n-2;i>-1 || j>-1 ;i-=2,j-=2){

                    A+=(arr[i]*arr[i])-(arr[j]*arr[j]);

                }
            }

            System.out.println(A);
        }
    }
}
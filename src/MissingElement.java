/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)*/
public class MissingElement {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,6,10,7,9,8};
        int n=arr.length+1;
        System.out.println(missingNumberBySum(arr,n));
        System.out.println(missingNumberByXOR(arr,n));
    }
   static int missingNumberBySum(int array[], int n) {
        // Your Code Here
        // int a=0,b=0;
        int sum=n*(n+1)/2;
        int s=0;
        for(int i=0;i<n-1;i++){
            //a=a^array[i];
            //b=b^(i+1);
            s+=array[i];
        }
        //b=b^n;
        //return(a^b);
        return sum-s;
    }
    static int missingNumberByXOR(int []arr,int n){
        int a=0,b=0;
        for(int i=0;i<n-1;i++){
            a=a^arr[i];
            b=b^(i+1);
        }
        b=b^n;
        return(a^b);
    }
}

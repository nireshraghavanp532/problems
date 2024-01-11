import java.util.*;
/*Geek's file currently has zero lines of codes. Each morning geek can add some arbitrary lines of code(possibly zero too). Each night, each line of the code splits into two lines. Geek wants N lines of code at some moment. Find the minimum lines of code geek adds.

Input:
1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
2. The first line of each test case contains a single integer N.


Output: For each test case, print the answer

Constraints:
1. 1 <= T <= 105
2. 1 <=  N <= 109

Example:
Input:
2
14
1

Output:
3
1

Explanation:
Test Case 1: The first-morning geek can add one line of code, then in the next morning geek file will contain 2 lines of code, and then geek again can add one line of code, then in the next morning geek file will contain 6 lines of code and then geek again can add one line of code, then in the next morning geek file will contain 14. So, in the whole process geek adds 3 lines of code.

*/
public class BrianKernighanAlgo {
    public static void main (String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-- >0){
            int n=in.nextInt();
            int day=0;
            while(n>0){
                day++;
                n&=n-1;
            }
            System.out.println(day);
        }
    }
}

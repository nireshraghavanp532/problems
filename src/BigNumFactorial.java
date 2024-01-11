/*Given an integer N, find its factorial. return a list of integers denoting the digits that make up the factorial of N.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120
Example 2:

Input: N = 10
Output: 3628800
Explanation :
10! = 1*2*3*4*5*6*7*8*9*10 = 3628800
*/
import java.util.*;
public class BigNumFactorial {
    public static void main(String[] args) {
        factorial(897);
    }
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        //int []arr=new int[Integer.MAX_VALUE-1];
        //arr[0]=1;
        arr.add(0,1);
        int arrSize=1;
        for(int x=2;x<=N;x++){
            arrSize=multiply(x,arr,arrSize);
        }
        for(int i=arrSize-1;i>=0;i--){
            list.add(arr.get(i));
        }
        return list;
    }
    static int multiply(int x, List<Integer> res ,int res_size)
    {
        int carry = 0; // Initialize carry

        // One by one multiply n with individual
        // digits of res[]
        for (int i = 0; i < res_size; i++) {
            int prod = (res.get(i) * x )+ carry;
            if(i <res.size()){
                res.set(i,prod % 10);
            }
            else{
                res.add(i,prod%10);
            }
            // Store last digit of
            // 'prod' in res[]
            carry = prod / 10; // Put rest in carry
        }

        // Put carry in res and increase result size
        while (carry != 0) {
            if(res_size<res.size()){
                res.set(res_size, carry % 10);
            }
            else{
                res.add(res_size,carry%10);
            }
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }
}

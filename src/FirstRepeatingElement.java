import java.util.HashSet;

/*Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

Note:- The position you return should be according to 1-based indexing.

Example 1:

Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation:
5 is appearing twice and
its first appearence is at index 2
which is less than 3 whose first
occuring index is 3.

Example 2:

Input:
n = 4
arr[] = {1, 2, 3, 4}
Output: -1
Explanation:
All elements appear only once so
answer is -1.*/
public class FirstRepeatingElement{
    public static void main(String[] args) {
        int []arr={1,5,4,3,5,3,6,9};
        System.out.print(firstRepeated(arr,arr.length));
    }
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int a=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=arr.length-1;i>=0;i--){
            if(set.contains(arr[i])){
                a=i+1;//ibased indexing
            }
            else{
                set.add(arr[i]);
            }
        }
        return a;
    }
}
import java.util.*;
/*Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.


Example 1:

Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6
numbers form the longest consecutive
subsquence.
Example 2:

Input:
N = 7
a[] = {1,9,3,10,4,20,2}
Output:
4
Explanation:
1, 2, 3, 4 is the longest
consecutive subsequence.
*/
public class LongestConsequentSubSequence {
    public static void main(String[] args) {
        int []arr={1,9,3,10,4,20,2};
        System.out.print(findLongestConseqSubseq(arr,arr.length));
    }
    static int findLongestConseqSubseq(int arr[], int N)
    {
        // add your code here
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<N;i++){
            set.add(arr[i]);
        }
        int ans=0;
        for(int i=0;i<N;i++){

            if(!set.contains(arr[i]-1)){
                int j=arr[i];
                while(set.contains(j)){
                    set.remove(j);
                    j++;
                }
                if(ans<j-arr[i]){
                    ans=j-arr[i];
                }
            }


        }

        return ans;
    }
}

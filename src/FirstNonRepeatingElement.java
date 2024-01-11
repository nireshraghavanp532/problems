import java.util.HashMap;

/*Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.

Example 1:

Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation:
-1 and 2 are repeating whereas 3 is
the only number occuring once.
Hence, the output is 3.


Example 2:

Input : arr[] = {1, 1, 1}
Output : 0
*/
public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[]arr={-1,2,-1,3,2,4};
        System.out.print(new FirstNonRepeatingElement().firstNonRepeating(arr,arr.length));
    }
    public int firstNonRepeating(int arr[], int n)
    {
        // Complete the function
        int a=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int freq=map.get(arr[i]);
                freq++;
                map.put(arr[i],freq);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1 && a==0){
                a=arr[i];
            }
        }

        return a;
    }
}

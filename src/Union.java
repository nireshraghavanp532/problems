import java.util.Arrays;
import java.util.HashSet;

/*Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

Note : Elements are not necessarily distinct.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3
Output:
5
Explanation:
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2
85 25 1 32 54 6
85 2
Output:
7
Explanation:
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
Your Task:
Complete doUnion function that takes a, n, b, m as parameters and returns the count of union elements of the two arrays. The printing is done by the driver code.

Constraints:
1 ≤ n, m ≤ 105
0 ≤ a[i], b[i] < 105

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)*/
public class Union {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int[]b={1,2,3};
        int n= a.length;
        int m=b.length;
       System.out.println( doUnion(a,n,b,m));
       System.out.print(Union(a,n,b,m));
    }
    private static int Union(int[] a, int n, int[] b, int m) {
        HashSet<Integer> unionSet = new HashSet<>();

        // Add elements from array a to the set
        for (int i = 0; i < n; i++) {
            unionSet.add(a[i]);
        }

        // Add elements from array b to the set
        for (int i = 0; i < m; i++) {
            unionSet.add(b[i]);
        }

        // Return the size of the union set
        return unionSet.size();
    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        int []ab=new int[n+m];
        int i;
        for(i=0;i<n;i++){
            ab[i]=a[i];
        }
        for(int j=0;j<m;j++,i++){
            ab[i]=b[j];
        }
        Arrays.sort(ab);
        int count=1;
        for(int k=0;k<n+m-1;k++){
            if(ab[k]!=ab[k+1]){
                count++;
            }
        }
        return count;
    }
}

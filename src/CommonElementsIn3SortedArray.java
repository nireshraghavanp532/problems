import java.util.ArrayList;

/*Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:

Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
 */
public class CommonElementsIn3SortedArray {
    public static void main(String[] args) {
        int []A={1, 5, 10, 20, 40, 80};
        int[]B={6, 7, 20, 80, 100};
        int []C={3, 4, 15, 20, 30, 70, 80, 120};
        int a=A.length;
        int b=B.length;
        int c=C.length;
        ArrayList<Integer>list=commonElements(A,B,C,a,b,c);
        System.out.print(list);
    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here

        int i=0,j=0, k=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<A.length && j<B.length && k<C.length){
            if(A[i]==B[j] && B[j]==C[k]){
                if(!list.contains(A[i])){
                    list.add(A[i]);
                }
                i++;
                j++;
                k++;
            }
            else if(A[i]<B[j]){
                i++;
            }
            else if(B[j]<C[k]){
                j++;
            }
            else{
                k++;
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
}

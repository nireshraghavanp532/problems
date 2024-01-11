/*Given an array, rotate the array by one position in clock-wise direction.


Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/
public class onePlaceRotationInArray {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int n=a.length;
        rotate(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void rotate(int arr[], int n)
    {
        int a=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=a;
    }
}

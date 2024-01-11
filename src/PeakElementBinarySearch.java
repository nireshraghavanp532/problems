/*An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists). Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. Also, arr[] will be in ascending order before the peak element, and in descending order after that.


Example 1:

Input:
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3.
It is the peak element as it is
greater than its neighbour 2.
If 2 is returned then the generated output will be 1 else 0.
Example 2:

Input:
N = 3
arr[] = {3,4,2}
Possible Answer: 1
Output: 1
Explanation: 4 (at index 1) is the
peak element as it is greater than
it's neighbor elements 3 and 2.
If 1 is returned then the generated output will be 1 else 0.*/
public class PeakElementBinarySearch {
    public static void main(String[] args) {
        //it returns the index of the peak element
        int n= 3;
        int []arr={3,4,2};
        System.out.print(peakElement(arr,n));
    }
    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a peak
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n- 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }

            // If the element on the right is greater, go right
            if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                // If the element on the left is greater, go left
                high = mid - 1;
            }
        }

        return -1;
    }
}

import java.util.ArrayList;
import java.util.List;

public class SubarrayWithGvenSumBySlidingWindow {
    public static void main(String[] args) {
        int[]a={1,2,3,7,5};
        int n=a.length;
        int k=15;
        List<Integer> ans=subarraySum(a,n,k);
        System.out.println(ans);
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int start_idx = -1;
        int end_idx = -1;
        int first_idx = 0;

        if (s == 0 && arr[0] != 0) {
            ArrayList<Integer> sol0 = new ArrayList<>();
            sol0.add(-1);
            return sol0;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // add ith element to sum

            while (sum > s) {
                sum -= arr[first_idx];
                first_idx++;
            }

            if (sum == s) {
                start_idx = first_idx + 1;
                end_idx = i + 1;
                break;
            }
        }

        // one element case
        if (n == 1) {
            if (arr[0] == s) {
                start_idx = 1;
                end_idx = 1;
            }
        }

        ArrayList<Integer> sol = new ArrayList<>();

        if ((start_idx == -1)) {
            sol.add(-1);
        } else {
            sol.add(start_idx);
            sol.add(end_idx);
        }

        return sol;
    }
}

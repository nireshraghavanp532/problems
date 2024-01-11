/*There is one meeting room in a firm. There are N meetings in the form of (start[i], end[i]) where start[i] is start time of meeting i and end[i] is finish time of meeting i.
What is the maximum number of meetings that can be accommodated in the meeting room when only one meeting can be held in the meeting room at a particular time?

Note: Start time of one chosen meeting can't be equal to the end time of the other chosen meeting.


Example 1:

Input:
N = 6
start[] = {1,3,0,5,8,5}
end[] =  {2,4,6,7,9,9}
Output:
4
Explanation:
Maximum four meetings can be held with
given start and end timings.
The meetings are - (1, 2),(3, 4), (5,7) and (8,9)
Example 2:

Input:
N = 3
start[] = {10, 12, 20}
end[] = {20, 25, 30}
Output:
1
Explanation:
Only one meetings can be held
with given start and end timings.

Your Task :
You don't need to read inputs or print anything. Complete the function maxMeetings() that takes two arrays start[] and end[] along with their size N as input parameters and returns the maximum number of meetings that can be held in the meeting room.


Expected Time Complexity : O(N*LogN)
Expected Auxilliary Space : O(N)


Constraints:
1 ≤ N ≤ 105
0 ≤ start[i] < end[i] ≤ 105*/
import java.util.*;

class Meeting{
    int start,end;
    public Meeting(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class Sorting implements Comparator<Meeting> {
    public int compare(Meeting a,Meeting b){
        return a.end-b.end;
    }
}
public class ActivitySelectionCount
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.


    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        List<Meeting> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            Meeting meet=new Meeting(start[i],end[i]);
            list.add(meet);
        }
        Collections.sort(list,new Sorting() );
        int count=1;
        for(int i=0,j=1;j<n;j++){
            if(list.get(i).end<list.get(j).start){
                count++;
                i=j;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int n=6;
        int start[] = {1,3,0,5,8,5};
        int end[] =  {2,4,6,7,9,9};
        System.out.print(maxMeetings(start,end,n));
        
    }
}



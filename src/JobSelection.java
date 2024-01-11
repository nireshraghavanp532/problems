import java.util.*;

/*Given a set of N jobs where each jobi has a deadline and profit associated with it.

Each job takes 1 unit of time to complete and only one job can be scheduled at a time. We earn the profit associated with job if and only if the job is completed by its deadline.

Find the number of jobs done and the maximum profit.

Note: Jobs will be given in the form (Jobid, Deadline, Profit) associated with that Job.


Example 1:

Input:
N = 4
Jobs = {(1,4,20),(2,1,10),(3,1,40),(4,1,30)}
Output:
2 60
Explanation:
Job1 and Job3 can be done with
maximum profit of 60 (20+40).
Example 2:

Input:
N = 5
Jobs = {(1,2,100),(2,1,19),(3,2,27),
        (4,1,25),(5,1,15)}
Output:
2 127
Explanation:
2 jobs can be done with
maximum profit of 127 (100+27).

Your Task :
You don't need to read input or print anything. Your task is to complete the function JobScheduling() which takes an integer N and an array of Jobs(Job id, Deadline, Profit) as input and returns the count of jobs and maximum profit as a list or vector of 2 elements.


Expected Time Complexity: O(NlogN)
Expected Auxilliary Space: O(N)


Constraints:
1 <= N <= 105
1 <= Deadline <= N
1 <= Profit <= 500

*/
public class JobSelection
{

    //Function to find the maximum profit and the number of jobs done.
    public static int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        List<Job> list= Arrays.asList(arr);
        List<Job>result=new ArrayList<>();
        Collections.sort(list,(a,b)->{return a.deadline-b.deadline;});
        PriorityQueue<Job> pq=new PriorityQueue<>((a, b)->{return b.profit-a.profit;});
        for(int i=n-1;i>-1;i--){
            int slots;
            if(i==0){
                slots=list.get(i).deadline;
            }
            else{
                slots=list.get(i).deadline-list.get(i-1).deadline;
            }
            pq.add(list.get(i));
            while(slots>0 && pq.size()>0){
                Job job=pq.remove();
                result.add(job);
                slots--;
            }
        }
        Collections.sort(result, (a, b) -> {return b.profit - a.profit;});
        int[]ans=new int[2];
        ans[0]=result.size();
        for(Job a:result){
            ans[1]+=a.profit;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=4;
        Job[]arr=new Job[n];
        arr[0]=new Job(1,4,20);
        arr[1]=new Job(2,1,10);
        arr[2]=new Job(3,1,40);
        arr[3]=new Job(4,1,30);
        int ans[]=JobScheduling(arr,n);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}


class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}


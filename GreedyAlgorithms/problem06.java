// Job Sequencing Problem :

// Given an array of jobs where every job has a deadline and profit if the job is finished
// before the deadline. It is also given that every job takes a single unit of time, so the
// minimum possible deadline for any job is 1. Maximize the total profit if only one job can
// be scheduled at a time.
// Job A = 4, 20
// Job B = 1, 10
// Job C = 1, 40
// Job D = 1, 30
// ans C, A


import java.util.*;
public class problem06 {
    static class job {
        int id;
        int deadline;
        int profit;

        public job(int i, int d, int p){
            id =i;
            deadline= d;
            profit = p;
        }
    
        
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4, 20}, {1, 10}, {1,40}, {1, 30}};
        ArrayList<job> jobs = new ArrayList<>();

        for(int i=0; i<jobInfo.length;i++){
            jobs.add(new job(i, jobInfo[i][0], jobInfo[i][1]));

        }
        Collections.sort(jobs,(obj1, obj2) -> obj2.profit-obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for(int i=0; i<jobs.size();i++){
            job curr= jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;

            }
        }

        System.out.println("Max jobs : "+seq.size());
        for(int i=0; i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();

    }
    
}

// Activity selection :

// You are give n activities with their start and end time . select the maximum number of activities 
// that can be performed by a single person, assuming that a person can only work on a single
// activity at a time. Activities are sorted according to end time .

// start = [10, 12, 20]
// end = [20, 25, 30]             anss = 2( AO & A2 )

import java.util.*;
public class Problem01 {

    public static void main(String[] args) {
        int start[]={1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // sorting 
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=1;
            activities[i][1]=start[i];
            activities[i][2]=end[i];

        }

        // 2D Array Sorting 
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        

        // main code 
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();


        // 1st activities
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd= activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];

            }

        }
        System.out.println("MaxAct : "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
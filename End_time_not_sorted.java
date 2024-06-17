import java.util.*;

public class End_time_not_sorted {          
    public static void main(String[] args) { // nlog(n)
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // if end time is not sorted then,

        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxActivites = 0; // count
        ArrayList<Integer> ans = new ArrayList<>();

        // always first activity ko pehle perform karenge because first activity sabse pehle khatam hoti hai...
        maxActivites = 1;
        ans.add(activities[0][0]);
        int Lastend = activities[0][2];      // end of activity 1

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= Lastend) {
                // activity select
                maxActivites++;
                ans.add(activities[i][0]);
                Lastend = end[i];
            }
        }

        System.out.println("max activities = " + maxActivites);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i));
        }
    }
}

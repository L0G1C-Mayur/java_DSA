import java.util.*;
public class activity_selection {
    public static void main(String[] args) {      //O(n)
        int start[] = {1,3,0,5,8,5};
          int end[] = {2,4,6,7,9,9};

          int maxActivites = 0;  // count
          ArrayList <Integer> ans = new ArrayList<>();

          // always first activity ko pehle perform karenge because first activity sabse pehle khatam hoti hai...
          maxActivites =1;
          ans.add(0);
          int Lastend = end[0];   // end of activity 1

          for(int i=1; i<end.length;i++){
            if(start[i] >= Lastend){
                // activity select
                maxActivites++;
                ans.add(i);
                Lastend = end[i];
            }
          }

          System.out.println("max activities = " + maxActivites);

          for(int i =0; i<ans.size();i++){
            System.out.println("A" + ans.get(i));
          }
    }
}

import java.util.*;
import java.util.Comparator;

public class Fractional_knapsack {
    public static void main(String[] args) {
        int val []= {60,100,120};
        int weight[] = {10,20,30};
        int w =50;    //capacity

        double ratio[][] = new double[val.length][2];    // double because of , decimal value bhi imp hai  ... 0.9 hai to 0.9 he aye, 0 na ho jaye islye double
        
        // 0th col pe  store karenge original index and first col pe ratio

        for(int i =0; i< val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];   //typecast   // decimal value bhi imp hai  ... 0.9 hai to 0.9 he aye, 0 na ho jaye islye double
        }
            // acending order sorting
            Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));  // sorting basis on 1 col // jiska ratio kam hoga vh pehle ayega and jiska jyada hoga vh baadme ayega

            int capacity = w;
            int finalval=0;
            // but we need in decending order so,
            for(int i=ratio.length-1; i>=0;i--){
                int idx = (int) ratio[i][0];
                if(capacity >= weight[idx]){
                    finalval += val[idx];      //total item include
                    capacity -= weight[idx];
                }
                else{// include fractional item
                    finalval += (ratio[i][1] * capacity);
                    capacity = 0;
                    break;
                }
            }
            System.out.println("final value = " + finalval);
        }
    }


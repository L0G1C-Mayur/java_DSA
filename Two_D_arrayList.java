import java.util.*;
public class Two_D_arrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();   // 2D arraylist syntax
        // hame agar koyi uper list store karni hai to us list ko pehle create karna hoga as below,
        ArrayList<Integer>list = new ArrayList<>(); 
        list.add(1);  list.add(2);
        mainlist.add(list);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(3);  list2.add(4);
        mainlist.add(list2);

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>Currlist = mainlist.get(i);
            for(int j=0;j<Currlist.size();j++){
                System.out.print(Currlist.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}

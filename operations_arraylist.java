import java.util.ArrayList;

public class operations_arraylist {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>(); 

        // * Add elements    -->   hrr no. ko add karne mai --> O(1) Time complexity lagi hai...

         list.add(1);       // O(1)
         list.add(2);   
         list.add(3);      
         list.add(4);            // output - [1, 2, 3, 4]

         list.add(1,10);    //  O(n)   // 1 is an index and 10 is an element.  

         System.out.println(list);      



        // * Get elements  -->  O(1) Time complexity 

         list.get(2);
         System.out.println(list);      

         int element =  list.get(2);
         System.out.println(element);     



        // * Remove element/Delete element  -->  O(n) Time complexity 

         list.remove(2);
         System.out.println(list);       `



         // * set elements at index   -->  O(n) Time complexity 

        // [1, 2, 3, 4]  isme muzhe index=2 mai 3 ki jagah 10 store karne ke liye set elements at index use hota hai
        
        list.set(2,10);   // where 2 is an index
        System.out.println(list);     // output - [1, 2, 4] (this to) --->  [1, 2, 10]



        // * contains element

        //contains element check karta hai ki kya koyi bhi element mere array ke under exist karta hai ya nhi karta
       // Agar exist karta ho to milega True, nhi karta hoga to milega False

        System.out.println(list.contains(1));        // 1 is an element    output - True
        System.out.println(list.contains(11));       // output - false

    }
}

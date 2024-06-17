public class largest_String {
    public static void main(String args[]){
        String fruits [] = {"apple","mango","banana"};

        String largest = fruits[0];    // hamne pehle wali index ki string ko he largest consider krr liya

        for (int i=1; i< fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}

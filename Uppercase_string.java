//import java.text.CharacterIterator;

public class Uppercase_string {

    public static String toUpperCase(String str){

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));     // kisi bhi character ko uppercase mai convert karne ke liye  Character.toUpperCase() function use karte hai...  //  hamne   char ch = Character.toUpperCase(str.charAt(0));   line likhi kyu ki hame starting word ke first char ko capital banana hai.. 

        sb.append(ch);

        for (int i =1; i<str.length();i++){
            if (str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }          
        }
        return sb.toString();
    }                                                          

   
    public static void main(String[] args) {
        String str = "hi i am shrdha";

        System.out.println(toUpperCase(str));
    }
}

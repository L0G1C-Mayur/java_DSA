import java.util.*;

public class string_intro {
    public static void main (String args[]){

        char arr []= {'a','b','c','d'};  

        String str = "abcd";                          //you can write string in this manner
        String str2 = new String ("xyz");   //you can write string in this manner

        Scanner sc = new Scanner(System.in);

        String name = sc.next();        // single word as output deta hai, isme space ko input nhi lete...

        String hello = sc.nextLine();    // isme puri line print karata hai, space ko bhi input lete hai...

        // String length
        
        String fullname = "tony stark";
        System.out.println(fullname.length());     // isme space bhi count hota hai...

        // concatenation     // do chijo ko jodna

        String first_name = "Shradha";
        String Last_name = "khapra";

        String Full_name =  first_name + " " + Last_name ;

    }
}

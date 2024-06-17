//import java.util.*;

public class Type_promotion {
    public static void main(String args[]){
    
    //rule 1 :  byte, short, char rha to int mai convert hota hai unka sum , substrac., add.....
        char a = 'a';
        char b = 'b';

        System.out.println(b-a);          //char b convert into int and char a also convert into int i.e. type promotion
        System.out.println(a);        // agar normal variable print karoge to   a   he ayega, 
                             //but substraction,add,multi. karoge to  b ka int form i.e 98 and a ka 97 ayega aur print hoga
        //char a = 'a';
        //char b = 'b';
        //char c =  a-b     lossy conersion error show karega , 
                            //c char hoga and a-b int hoga. so,int se char mai convert nhi krr sakte                
                            
        short m = 5;       
        byte n = 25;
        char o ='o';
        byte bt = (byte) (m+n+o);        //m+n+o kiya to yeh int mai convert hoga   
                         // m+n+o likha to lossy conversion from, int to byte error show karega,so  we write (byte) (m+n+o)
        System.out.println(bt);     
        
        
//rule 2:    int , float , double, long rha to jo bada hai value mai usme  mai convert hota hai unka sum , substrac., add.....
        
        int i = 10;
        float j = 10.99f;
        long k = 20;
        double l = 30;
        double ans = i+j+k+l;  //yeh i+j+k+l ko double mai convert karega because --> double ans = i+j+k+l; as per rule 2
        System.out.println(ans);


// extra

byte x = 5;
byte y = (byte) (x * 2);      // hum  byte y = x * 2  nhi likh sakte because as per rule 1, x * 2 int mai convert hota hai
                             //  lekin hame ans byte mai he nikalana hai to  byte y = (byte) (x * 2); use karte hai
                             // we use type casting
System.out.println(y);
    }
}

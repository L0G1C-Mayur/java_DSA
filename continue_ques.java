import java.util.*;

public class continue_ques {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
            {
        do {
            System.out.println("enter the no: ");
            int i = sc.nextInt();
            if (i%10==0){
                continue;
            }
            
           System.out.println(i);
         // sc.close();          //it will show error but written because of problems, which is side of output below 

        }while(true);       
     }
    
   }
}





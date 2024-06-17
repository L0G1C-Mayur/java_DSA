public class else_if {
    public static void main(String args []){
        int age = 15;

        if (age > 18){
            System.out.println("adult");
        }
        else if (age > 13 && age < 18){               // if statement is false,then only else if can be execute
            System.out.println("teenager");
        }
        else{
            System.out.println("no adult");
        }
     
              //  understand the diff...b/w if and else if
    //   int age=21;
    //   if (age>18){
    //       System.out.println("yes");
    //   }
    //  if(age>20){
    //       System.out.print("no");
    //   }
    }
}

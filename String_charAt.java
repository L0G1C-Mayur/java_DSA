public class String_charAt {

    public static void printletters(String full_name){
        for(int i=0; i<full_name.length();i++){
            System.out.print(full_name.charAt(i)+ " ");
        }
    }
    public static void main(String args[]){

        String first_name =  "shradha";
        String last_name = "khapra";

        String full_name =  first_name + " " + last_name ;

        printletters(full_name);
    }
}

public class String_Substring {
    public static String substring(String str, int start_index, int end_index){

        String subStr = "";      // imp...   //jaise hum f=f*i karte hai to multiply mai f ko hum f=1 se intialize karte hai vaise he String subString = "" ; substring ko empty ke sath initialize kiya ...
        for(int i=start_index; i<end_index; i++){
           subStr =  subStr + str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "helloworld";
       System.out.print(substring( str,0,5));
    }
}




     // shortcut 

//      public static void main(String[] args) {
//         String str = "helloworld";
//         System.out.println(str.substring(0,5));       // itna liknese direct substring aa jayega...
//     }
// }

   
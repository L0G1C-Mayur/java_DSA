public class string_compression {

    public static String compress(String str){
        String newstr= "";

        for (int i=0;i<str.length();i++){
            Integer count = 1;                               // we write here Integer cause hame aage Integer ko string mai convert karna padega kyuki jo number aya he count ka usko to string mai add karna padega, toString function use karna padega to count ko pehlese he class bana lenge

            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){     // hamne i<str.length()-1 ke jagah i<str.length() kyu nhi liya, kyunki hum   str.charAt(i) == str.charAt(i+1) ke sath compare krr rhe hai..
                count++;
                i++;
            }

            newstr += str.charAt(i);
            
            if(count > 1){
                newstr += count.toString();
            }
        }
        
        return newstr;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";

        System.out.println(compress(str));
    }
}

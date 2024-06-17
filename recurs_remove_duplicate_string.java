public class recurs_remove_duplicate_string {

    public static void remove_duplicates(String str, int index ,StringBuilder newStr, boolean arr[]){
        if(index == str.length()){    // base case
            System.out.println(newStr);
            return;
        }

        char currchar = str.charAt(index);     // jis bhi index pe hu, vha jo char hai usko currchar mai store kiya...

        if(arr[currchar - 'a'] == true){
            // if value true hai, to mera currchar ek duplicate value hai , to hame next index ke liye call karni hai
            remove_duplicates(str,index+1,newStr,arr);
        }
        else{    // agar value false aa jaye then
            arr[currchar - 'a'] = true;
            remove_duplicates(str,index+1,newStr.append(currchar),arr);  // newstring ke piche ye currchar jud jayega because ye char first time aa rha hai and arr mai iski value ko true bhi krr diya hai uper ke line mai
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        remove_duplicates(str,0, new StringBuilder(""),new boolean[26]);
    }
}

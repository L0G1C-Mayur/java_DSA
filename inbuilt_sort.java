import java.util.Arrays;  //imp

public class inbuilt_sort {

    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
    int arr[] = {5,3,4,1,2};
    Arrays.sort(arr);  //imp
    Arrays.sort(arr,0,3);  // Arrays.sort(arr,starting index, ending index) ending index means agar sorting index 2 tk karni ho to ending index 3 likhe
    printArr(arr);
   }
}
  
//upper Arrays.sort(arr);  ye pehle run kiya hai to output mai upper wala he run hoga na ki niche wala... 
// Arrays.sort(arr,0,3);   and agar upper wala comment kiya to niche wale ka output run hoga...

//  Arrays.sort(arr);  
//  Arrays.sort(arr,0,3);   call only one function at time  as explain above...
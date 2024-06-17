import java.util.Arrays;
import java.util.Collections;
public class reverse_order_inbuilt_sort {

     public static void printArr(Integer arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Integer arr[] = {1,24,26,32,42,54,87,67};   //int use nhi hota hai cause reverseorder function cannot accept primitive datatype... it accept object datatype which is Integer 
       // Arrays.sort(arr,Collections.reverseOrder());  
        Arrays.sort(arr,0,8,Collections.reverseOrder());  
        printArr(arr);
    }
}

 // Arrays.sort(arr,Collections.reverseOrder());  
 //Arrays.sort(arr,0,3,Collections.reverseOrder());     //  call only one function at time 
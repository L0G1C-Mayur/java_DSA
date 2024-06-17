public class binary_search {

    public static int Binary_Search(int numbers[],int key){
        int start =0 ; int end = numbers.length-1;    // imp...

        while(start<=end){   // <= used because during end we compare with single element..
            int mid = (start+end)/2;

            //comparision
            if (numbers[mid] == key){  //found
                return mid;
            }
            else if (numbers[mid] < key){  //right
                start = mid+1;
            }
            else{                     //left
               end = mid - 1;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int numbers[]= {2,4,6,8,10};
        int key =10;

        System.out.println( "index for key is "  + Binary_Search(numbers, key));
    }
}


//this is by using for loop....

// public class trial {
//     public static int Binary_Search(int numbers[],int key){
//        for(int start=0;start<numbers.length;start++){
//         for(int end=numbers.length-1;end<numbers.length;){    //if we not use end++/-- then also ok ,no error occurs
           
//             int mid = (start+end)/2;
//             //comparision
//             if (numbers[mid] == key){  //found
//                 return mid;
//             }
//             if (numbers[mid] < key){  //right
//                 start = mid+1;
//                break;
//             }
//             else{  //left
//                end = mid - 1;
//                break;
//             }
//         }

//        }
//        return -1;
//     }
//     public static void main (String args[]){
//         int numbers[]= {2,4,6,8,10,12,14,16};
//         int key =14;

//         System.out.println( "index for key is "  + Binary_Search(numbers, key));
//     }
// }

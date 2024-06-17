public class array_func_argument {

    public static void update(int marks[]){       //update hamare array ko as argument lega...

        for(int i=0; i<marks.length; i++){
            marks[i]= marks[i] + 1;   // i indicates index.....
            System.out.print(marks[i] + " ");
        }
    }    
    public static void main (String args[]){
        
        int marks[]= {97,98,99};
        update(marks);

        //To print marks 

        // for (int i=0; i<marks.length; i++){
        //  System.out.print(marks[i] + " ");
        // }
        System.out.println();
    }   
}

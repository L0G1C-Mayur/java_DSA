public class Oops_deep_copy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shradha";
        s1.roll = 457;
        s1.password = "abcd";
        s1.marks [0]=100;
        s1.marks [1]=90;
        s1.marks [2]=80;

       
        Student s2 = new Student(s1);   
        s2.password = "xyz";
        s1.marks[2]=100;                // Because of deep copy s1 ke marks change nhi milenge output mai...

        for(int i=0; i<3;i++){
            System.out.println(s2.marks[i]);    
        }
    }    
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        // marks ko copy karne ke liye chalayenge loop...
        for(int i=0; i<3;i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is called...");
    }

    Student(String name){      
        marks = new int[3];     
        this.name = name;
    }

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}


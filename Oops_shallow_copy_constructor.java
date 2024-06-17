public class Oops_shallow_copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shradha";
        System.out.println(s1.name);
        s1.roll = 457;
        s1.password = "abcd";
        s1.marks [0]=100;
        s1.marks [1]=90;
        s1.marks [2]=80;

        // if s1 forget password then 
        Student s2 = new Student(s1);   //copy  // s1 ki sari prop s2 mai copy ho, uske liye ek function/constructor create karenge Student(Student s1) name se..
        s2.password = "xyz";
        s1.marks[2]=100;       // written in note

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

    //Shallow copy constructor
    Student(Student s1){       // khud he ka object khud constructor mai as parameter  aa rha hai...
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
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

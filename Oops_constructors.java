public class Oops_constructors {
    public static void main(String[] args) {
        Student s1 = new Student("shradha");   // parametrized constructor
        System.out.println(s1.name);

        Student s2 = new Student();    //Non-parametrized constructor
    }
}

class Student{
    String name;
    int roll;
    
    Student(String name){           // constructor...
        this.name = name;
    }

    Student(){
        System.out.println("constructor is called...");
    }
}

public class Oops_types_of_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("shradha");
        Student s3 = new Student(111);
      //  Student s4 = new Student("shradha", 123);  // ye error show karega kyuki yesa consructor exist he nhi karta jisme parameter string bhi ho and int bhi...
    }
}

class Student{
    String name;
    int roll;

    // parameterized constructor
    Student(){
        System.out.println("constructor is called...");       // agar hum sirf ye constructor ko commentout krr de to - Student s1 = new Student(); error show karega... reason written in notebook
    }

    // non-parameterized constructor
    Student(String name){                           // agar hum sirf ye constructor ko commentout krr de to - Student s2 = new Student("shradha");   error show karega... reason written in notebook
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}

// hamne uper 3 constructor create kiye hai, vh parameter dekhenge class mai kisse match hota hai then usse call karenge
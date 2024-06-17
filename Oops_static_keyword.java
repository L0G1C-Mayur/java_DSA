public class Oops_static_keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "jmv";

        Student s2 = new Student();
        System.out.println(s2.schoolname); // like this-> s1.schoolname = "jmv";  s2 ke liye abhi tk hamne schoolname define nhi kiya , to output mai empty string ani chahiye, lekin output mai jo s1 mai declere kiya vhi ayega 

    }
}

class Student{

    static int marks(int phy, int chem, int maths){
         return (phy + chem + maths)/3;
    }
    String name;
    int roll;

    static String schoolname;

    void setname(String name){
        this.name = name;
    }

   String getname(){
       return this.name;
    }
}

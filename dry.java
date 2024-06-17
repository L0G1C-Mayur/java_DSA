
class Employee{
    private String name;
    private static int Id = 10;
    private int ph;
    private int salary= 100000;
    private int intensive = 20000;
    private void count_salary () {
        System.out.println(salary+intensive);
    }

    int getph(){
        return ph;
    }
    String getName(){
        return name;
    }
    public void show_salary(){
        count_salary();
    }

    Employee(int phone_no, String his_name){
        ph = phone_no;
        name = his_name;
    }
}

public class dry {
    public static void main (String args[]){
        Employee st = new Employee(99,"jay");
        System.out.println(st.getName());
        System.out.println(st.getph());
        st.show_salary(); 
    }
}

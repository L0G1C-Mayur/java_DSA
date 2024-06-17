import java.util.*;

public class student_pass_fail {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        int marks = sc.nextInt();

        String reportcard = (marks >=33)? "pass" : "fail";          // variable = condition? statement1 : statement2;
        System.out.println(reportcard);

        sc.close();
    }
}

public class Oops_access_modifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();   // myAcc is object...
        myAcc.username = "sharadhakhapra";

       //myAcc.password = "abcd";    //password ko error dikhayega... i.e. The field BankAccount.password is not visible...   becuase of private access modifiers 
                                    // private String password;  
        myAcc.setpassword("asdfg");  // because of private modifier we cannot access myAcc.password directly, so we create 1 function which is setpassword present in that class then by help of  myAcc.setpassword(...) we  change the password and access it...                       
                                // isme hum directly access nhi krr sakte password ko so by help of function which is setpassword ke help se access kiya 
                                // hum myAcc.password se kabhi access nhi krr payenge sirf change krr sakte by function...
                                // myAcc.password ko aap access nhi krr sakte...i.e as we done in , last 
                                // p1.color = "yellow";
                               //System.out.println(p1.color);   
    }
}
class BankAccount{
    public String username;  
    private String password;  // BankAccount class, class ke bahar kisi ko bhi accessible nhi hoga becuase of private access modifiers
    public void setpassword(String Password){
        password = Password;                    // it is accessible because hum class ke function ke under he private thing ko access krr rhe hai
    }

}
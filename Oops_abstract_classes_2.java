public class Oops_abstract_classes_2 {
    public static void main(String[] args) {
        Mustang  myhorse = new  Mustang();  
        // Animal-> Horse-> Mustang...   //hierarcy inheritance
    }
}

// To understand logic of constructor...

abstract class Animal{
    Animal(){
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){                     // jo class ka name ho same vhi constructor ka name hota hai...
        System.out.println("Horse constructor called");
    }
}

class Mustang extends Horse{       // class Mustang extends to Horse....
    Mustang(){                    
        System.out.println("mustang constructor called");
    }
}

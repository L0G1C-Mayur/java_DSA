public class Oops_super_keyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        Mustang s = new Mustang();
        System.out.println(s.color);
    }
}

class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();    // super() likne se hum direct Animal class ke constructor ko call karte hai...
        System.out.println("Horse constructor is called");
    }
}

class Mustang extends Animal{
   Mustang(){
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}
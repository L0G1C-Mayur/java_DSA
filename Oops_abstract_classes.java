public class Oops_abstract_classes {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        
        System.out.println(h.color); // yha horse ka color blue nhi brown print hoga

        Pigeon p = new Pigeon();
        p.eat();
        p.walk();
    }
}

abstract class Animal { // abstract class vh classes hote hai jiske under hum object nhi bna sakte...
    String color;

    Animal() { // constructor ... 3rd prop.
        color = "brown";
    }

    void eat() { // non abstract
        System.out.println("animal eats");
    }

    abstract void walk();   // Idea for next classes 
                           // abstract method vh hote hai jinke under implementation like --
                          // System.out.println("animal eats"); nhi hota...
}

// subclasses of walk()
class Horse extends Animal {

    void changecolor() { // constructor... 3rd prop.
        color = "blue";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Pigeon extends Animal {

    void changecolor() { // constructor... 3rd prop.
        color = "white";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}

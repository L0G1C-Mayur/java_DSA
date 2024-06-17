public class Oops_inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
//Single level inheritance

// Base/Parent class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breaths");
    }
}
// Derived/child/sub class

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

public class Oops_herarchical_inheritance {
    public static void main(String[] args) {
        Bird parrot = new Bird();
        parrot.eat();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breaths");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void fly(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void walk(){
        System.out.println("fly");
    }
}
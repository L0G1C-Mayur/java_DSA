public class Oops_Multi_level_inheritance {
   public static void main(String[] args) {
    Dog dobby = new Dog();
    dobby.eat();
    dobby.legs=4;
    
    System.out.println(dobby.legs);
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
    int legs;
}

class Dog extends Mammal{
    String breed;
}
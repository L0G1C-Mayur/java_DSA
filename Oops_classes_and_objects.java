public class Oops_classes_and_objects {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // By help of this line we created pen object called p1 //
                            // new keyword se hum memory ke under ek jagah bana rhe hai jaha prr hamare pen
                            // ki sari properties store hongi
                            // Pen() ko hum constructor kahte hai.. ***// p1 is object...

        p1.setcolor("blue"); // hum dot operator ka use karte hai, p1 ka function call karne ke liye
        System.out.println(p1.color);

        p1.settip(5);
        System.out.println(p1.tip);

        // also we can write as,

        p1.color = "yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    // props
    String color;
    int tip;

    // functions
    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }
}

class Student {
    // props
    String name;
    int age;
    float percentage; // cgpa

    // function eg.

    void calcpercentage(int maths, int phy, int chem) {
        percentage = (maths + chem + phy) / 3;
    }
}
public class Oops_getter_setter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        // System.out.println(p1.color()); p1.color() se hum nhi access krr sakte... because of private

        p1.settip(5);
        System.out.println(p1.gettip());

        p1.setcolor("yelow");
        System.out.println(p1.getcolor());
    }
}

class Pen{
    //props
    private String color;
    private int tip;

    //functions
    String getcolor(){
        return this.color; // "this" is special keyword of java, this ka matlab hota hai currunt object... i.e jis bhi object ne call kiya hai uska color
    }

    int gettip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        color = newcolor;
    }

    void settip(int tip){     // props wala tip and parameter tip, both are different...
        this.tip = tip;       // this.tip batata hai ki ye wali prop. pen ke under ki hai and tip batata hai ki parameter wala int tip ek external variable hai
                            // jb bhi hamare pass same name ke variable hote hai tb this ka jyada use hota hai...
    }
}


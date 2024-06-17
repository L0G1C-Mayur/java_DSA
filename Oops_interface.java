public class Oops_interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface Chessplayer{
    void moves();     // abstaraction- we just give an idea  // As per property, ye by default public hai, abstract hai... aur isme implementation means--> sout(); bhi nhi krr sakte
}

class Queen implements Chessplayer{
   public void moves(){     // access specifier likhe... eg.public
        System.out.println("left,right,up,down,diagonal(in all 4 directions)");
    }
}

class Rook implements Chessplayer{
    public void moves(){     // access specifier likhe... eg.public
         System.out.println("left,right,up,down");
     }
 }

 class King implements Chessplayer{
    public void moves(){     // access specifier likhe... eg.public
         System.out.println("left,right,up,down,diagonal(by 1 step)");
     }
 }


 // Multiple inheritance in interfaces

 interface harbivores{

 }

 interface carnivores{

 }

 class Bear implements harbivores,carnivores{

 }
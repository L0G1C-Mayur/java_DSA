import java.util.*;
import java.util.LinkedList;
public class top_view_of_tree {    // * Tip - check code video again
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{    // hamne ye static info class banayi kyuki hame level order treverse karna hai to uske liye Queue banayenge, to hrr ek node ke pass 2 infor. hai. one is node ka data and second is HD. too queue mai store karne anne ke liye static info class banayi, then Queue mai infor. object ko store karayenge
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void Top_view(Node root){
        // level order treverse
        Queue<Info> q = new LinkedList<>();
        // HD and nodes ke data ko store karne ke liye map ko banana hai
        HashMap<Integer,Node> map = new HashMap<>();     // integer is HD which is Key and Node is value

        int min=0; 
        int max=0;

        q.add(new Info(root, 0));    // start mai bydefault HD 0 hota hai... queue mai add kiya root node ko .. doubt-> new info kyu banaya..
        q.add(null);  // ye track karta hai ki kaha pe level khatam hone wala hai

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){    // null condition
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                // *  containsKey ke under hum check krr sakte hai ki koyi bhi key map ke under exist krti hai ya nhi...  // true return kre to exist karti hai
            if(!map.containsKey(curr.hd)){   // exist nhi karta means, first time HD is occuring ki condition hai..   * imp-> curr.hd is key
                map.put(curr.hd, curr.node);   // isse hamne map mai key and value ko add krr diya
            }

            if(curr.node.left != null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }

            if(curr.node.right != null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }
         }
            
        }

        // print 

        for(int i= min; i<= max; i++){
            System.out.print(map.get(i).data + " ");   // i is key.. // map.get(i) ye/map return karega value mai ek node... but node is object too usko print nhi krr sakte . too uska data print karenge ... agar node print karne gye to uske address print ho jayenge
        }
    }
    public static void main(String[] args) {
         /*
            1
           / \
          2   3
         / \ / \
        4  5 6  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Top_view(root);
    }
}

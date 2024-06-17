import java.util.ArrayList;
public class Lowest_commen_ancestor_appr1 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
//2.
    public static boolean getpath(Node root, int n, ArrayList<Node>path){
        if(root == null){
            return false;
        }

        path.add(root);
        if(root.data == n){
            return true;
        }

        boolean foundLeft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);

        if(foundLeft || foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
//1.
    public static Node LCA(Node root, int n1 , int n2){   // O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root, n1, path1);   // ye function root se lekar n1 tk ka path, path 1 mai store karega
        getpath(root, n2, path2); 

        // jb done ke path aa jayenge tb last common ancestor ko calc. karenge...

        int i =0;    // *imp -> hum ek pointer le lete i=0;
        for(;i<path1.size() && i< path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        // Last equal node -> i-1
        Node LCA = path1.get(i-1);

        return LCA;
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

        int n1 = 4, n2 = 5;
        System.out.println(LCA(root, n1, n2).data);
    }
}

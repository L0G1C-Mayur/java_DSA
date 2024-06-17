public class Dia_of_tree_appr2 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int LH = height(root.left);
        int RH = height(root.right);
        return Math.max(LH, RH) + 1;
    }

    public static int diameter2(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }

        int left_diam = diameter2(root.left);
        int leftHeight = height(root.left);
        int right_diam = diameter2(root.right);
        int rightHeight = height(root.right);

        int self_diam = leftHeight + rightHeight + 1;

        return Math.max(self_diam, Math.max(left_diam, right_diam)); // ld and rd se max ayega, usse compare karenge
                                                                     // self_dia ke sath...
    }
// appr.2
    static class info{
        int diam;
        int ht;

        public info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static info diameter(Node root){       // imp concept -> info as returntype liya hai and uskeliye return karne ke liye info name ki class create ki

        if(root == null){
            return new info(0,0);
        }

        info Left_info = diameter(root.left);      // info is like int 
        info right_info = diameter(root.right); 

        int diam = Math.max(Math.max(Left_info.diam, right_info.diam) , Left_info.ht + right_info.ht +1);   // Math.max yh 3 variable ko compare nhi krr sakta isliye 2 times likha
        int height = Math.max(Left_info.ht, right_info.ht) + 1;

        return new info(diam, height);    //return krr diya,  new diam and height ko...
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

        System.out.println(diameter(root).diam);   // iss appr. mai jo diameter(root) return karega , info object . to hame object ki diam return karvani hai so, diameter(root).diam  likha    // diameter(root) return karega info object, ussme se hum diam ko print karvayenge

        System.out.println(diameter(root).ht); 
    }       
}

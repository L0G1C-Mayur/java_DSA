public class Diameter_of_tree_appr1 {
    static class Node{
        int data;
        Node left, right;

        public Node (int data){
            this.data= data;
            this.left= null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int LH = height(root.left);
        int RH = height(root.right);
        return Math.max(LH, RH) + 1;
    }

    public static int diameter(Node root){    // O(n^2)
        if(root == null){
            return 0;
        }

       int left_diam = diameter(root.left);
       int leftHeight = height(root.left);
       int right_diam = diameter(root.right);
       int rightHeight = height(root.right);

       int self_diam = leftHeight + rightHeight + 1;

       return Math.max(self_diam , Math.max(left_diam , right_diam));   // ld and rd se max ayega, usse compare karenge self_dia ke sath...
    }
    public static void main(String[] args) {
         /*
                   1
                 /   \
                2     3
               / \   / \
              4   5  6  7
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

         System.out.println(diameter(root));
    }
}

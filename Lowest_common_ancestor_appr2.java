public class Lowest_common_ancestor_appr2 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node LCA(Node root, int n1 , int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = LCA(root.left, n1, n2);
        Node rightLCA = LCA(root.right, n1, n2);

        // left se valid value ayi and right se null value ayi
        if(rightLCA == null){
            return leftLCA;
        }

        if(leftLCA == null){
            return rightLCA;
        }

        return root;   // khudko return krr denge, jb left_subtree mai n1 ya n2 dono me se ek exist karta hai and right_subtree mai n1 ya n2 dono me se ek exist karta hai tb 
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

        int n1=4, n2=7;
        System.out.println(LCA(root, n1, n2).data);
    }
}

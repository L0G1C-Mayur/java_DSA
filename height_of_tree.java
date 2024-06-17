public class height_of_tree {
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

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int left_count = count(root.left);
        int right_count = count(root.right);
        return left_count + right_count + 1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int left_sum = sum(root.left);
        int right_sum = sum(root.right);
        return left_sum + right_sum + root.data;
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

         System.out.println(height(root));

         System.out.println(count(root));

         System.out.println(sum(root));
    }
}

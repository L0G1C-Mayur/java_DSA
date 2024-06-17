import java.util.ArrayList;

public class convert_BST_to_Balanced_BST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root){   // final tree create hone ke baad print karvane ke liye use karte hai, preoder
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root , ArrayList<Integer> inorder){  // inorder seq. nikal lenge...
        if(root == null){
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer>inorder, int start , int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, start, mid-1);
        root.right = createBST(inorder, mid+1, end);

        return root;
    }
//1.
    public static Node balanceBST(Node root){
        // Inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();     // Inorder sequence ko store karenge arraylist ke under
        getInorder(root, inorder);

        // sorted Inorder -> balanced BST
        root = createBST(inorder, 0, inorder.size()-1);
        return root;
    }

    public static void main(String[] args) {

    /*  given BST

            8
           / \
          6   10
         /     \
        5       11
       /         \
      3           12

    */

    Node root = new Node(8);
    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);

    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right = new Node(12);


    root = balanceBST(root);
    preorder(root);
    }
}

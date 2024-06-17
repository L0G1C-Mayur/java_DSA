import java.util.*;
public class Root_to_leaf_path {
        static class Node {
            int data;
            Node left, right;
    
            public Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    
        public static Node insert(Node root , int val){
            if(root == null){     // root == null ho, then hum naya root create karenge and usko bana deb=nge BST ka root
                root = new Node(val);
                return root;
            }
    
            if(root.data > val){
                // left subtree
                root.left = insert(root.left, val);
            }
            else{
                // right subtree
                root.right = insert(root.right, val);
            }
            return root;
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    //2.
        public static void printPath(ArrayList<Integer>path){
            for(int i=0; i<path.size();i++){
                System.out.print(path.get(i) + "-->");
            }
            System.out.println("null");
        }
    //1.    
        public static void printRootToLeaf(Node root, ArrayList<Integer>path){
            if(root == null){
                return;
            }
            path.add(root.data);
            if(root.left == null && root.right == null){  // base case   (leaf node)
                printPath(path);
            }
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
            path.remove(path.size()-1);   
        }
      
        public static void main(String[] args){
            int values[] = {8, 5, 6, 10, 11, 14};
            Node root = null;

            for(int i=0; i<values.length; i++){   // for insert values in subtree i.e treverse in given array to insert values
                root = insert(root, values[i]);
            }

            inorder(root);   // create function inorder to check sorted sequence , if its sorted then also BST is correct
            System.out.println();

            printRootToLeaf(root, new ArrayList<>());
        }     
    }

import java.util.PrimitiveIterator;

public class print_in_range {
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

        public static void printInRange(Node root, int k1, int k2){
            if(root == null){
                return;
            }
            if(root.data >= k1 && root.data <= k2){
                printInRange(root.left, k1, k2);
                System.out.print(root.data + " ");
                printInRange(root.right, k1, k2);
            }
            else if(root.data < k1){
                printInRange(root.left, k1, k2);
            }
            else{
                printInRange(root.right, k1, k2);
            }
        }
        public static void main(String[] args){
            int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
            Node root = null;

            for(int i=0; i<values.length; i++){   // for insert values in subtree i.e treverse in given array to insert values
                root = insert(root, values[i]);
            }

            inorder(root);   // create function inorder to check sorted sequence , if its sorted then also BST is correct
            System.out.println();

            printInRange(root, 5, 12);
        }     
    }
    

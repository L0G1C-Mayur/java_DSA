public class validate_BST {
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

        public static boolean isValidBST(Node root, Node min , Node max){   // min and max null hai..
            if(root == null){
                return true;
            }

            if(min != null && root.data <= min.data){
                return false;
            }
            else if(max != null && root.data >= max.data){
                return false;
            }

            return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
        }
        public static void main(String[] args){
            int values[] = {8, 5, 6, 10, 11, 14};
            Node root = null;

            for(int i=0; i<values.length; i++){   // for insert values in subtree i.e treverse in given array to insert values
                root = insert(root, values[i]);
            }

            inorder(root);   // create function inorder to check sorted sequence , if its sorted then also BST is correct
            System.out.println();

            if(isValidBST(root, null, null)){
                System.out.print("valid");
            }
            else{
                System.out.print("not valid");
            }
        }     
    }



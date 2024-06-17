public class search_in_BST {
        static class Node {
            int data;
            Node left, right;
    
            public Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    
        public static boolean search(Node root ,int key){
            if(root == null){
                return false;
            }

            if(root.data == key){
                return true;
            }

            if(root.data > key){
                return search(root.left, key);
            }
            else{
                return search(root.right, key);
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
        public static void main(String[] args){
            int values[] = {5, 1, 3, 4, 2, 7};
            Node root = null;

            for(int i=0; i<values.length; i++){   // for insert values in subtree i.e treverse in given array to insert values
                root = insert(root, values[i]);
            }

            inorder(root);   // create function inorder to check sorted sequence , if its sorted then also BST is correct
            System.out.println();

            if(search(root, 1)){
                System.out.println("found");
            }
            else{
                System.out.println("Not found");
            }
        }     
    }
    
// mixture of build BST and search BST...

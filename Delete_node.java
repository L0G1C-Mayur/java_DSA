public class Delete_node {
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

        public static Node delete(Node root, int val){   // delete mai pass kiya root and jis value ko delete karna hai vh value
            if(root.data < val){
                root.right = delete(root.right , val);
            }
            else if(root.data > val){
                root.left = delete(root.left , val);
            }
            else{
                // case-1 (leaf node)
                if(root.left == null && root.right == null){
                    return null;
                }

                // case-2 (single child)
                if(root.left == null){
                    return root.right;
                }
                else if(root.right == null){
                    return root.left;
                }

                // case-3 (both children)
                Node IS = findInorderSuccessor(root.right);   // we take root.right because, Bydefault inorder successor in BST is leftmost Node from rightsubtree
                // replace value
                root.data = IS.data;
                root.right = delete(root.right, IS.data);     // delete IS  and root.right mai new wali subtree add ho jayegi
            }
            return root;
        }

        public static Node findInorderSuccessor(Node root){
            while(root.left != null){
                root = root.left;
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
            int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
            Node root = null;

            for(int i=0; i<values.length; i++){   // for insert values in subtree i.e treverse in given array to insert values
                root = insert(root, values[i]);
            }

            inorder(root);   // create function inorder to check sorted sequence , if its sorted then also BST is correct
            System.out.println();

            root = delete(root, 1);
            System.out.println();

            inorder(root);
        }     
    }
    
// mixture of build BST and search BST and delete node ...



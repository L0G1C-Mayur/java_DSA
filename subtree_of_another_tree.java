public class subtree_of_another_tree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node, Node subroot){   // Node node -> ye vh node hai jaha prr subroot match krr gyi hai
       // non_identical conditions
        if (node == null && subroot == null){
            return true;
        }else if(node == null || subroot == null || node.data != subroot.data){
            return false;
        }

        if(!isIdentical(node.left, subroot.left)){   // left identical hai ya nhi check karne ke liye
            return false;
        }

        if(!isIdentical(node.right, subroot.right)){   // right identical hai ya nhi check karne ke liye
            return false;
        }

        return true;    // agar upper ki non_identical conditions satisfy nhi hogyi to ye identical hai. so,return true
    } 
    
    public static boolean issubtree(Node root, Node subroot){   // issubtree is first step
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }

        boolean leftans = issubtree(root.left, subroot);   // root ke left mai find karenge
        boolean rightans = issubtree(root.right, subroot);

        return leftans || rightans;   // jo true hoga vh return hoga
        // also written as, return issubtree(root.left, subroot) || issubtree(root.right, subroot);  -> this is the best method
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

        /*
          2  
         / \ 
        4   5 

        */

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(issubtree(root, subroot));
    }
}

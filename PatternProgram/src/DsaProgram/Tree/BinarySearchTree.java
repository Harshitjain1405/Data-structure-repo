package DsaProgram.Tree;

public class BinarySearchTree {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    private Node root;

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        int[] input = new int[]{50, 30, 20, 10, 60, 70, 5,55};

        for(int i : input) {
            bst.root = bst.insert(bst.root, i);
        }
        bst.inorderTraversal(bst.root);

        System.out.println("\n");
        System.out.println("Search 60? :"+bst.search(bst.root, 60));
        System.out.println("Search 100? :"+bst.search(bst.root,100));

        System.out.println("Total Nodes: "+bst.countTotalNodes(bst.root));
        System.out.println("Total Leafy Nodes: "+bst.countOnlyLeafNode(bst.root));

        bst.root = bst.delete(bst.root, 70);
        System.out.println("Inorder after deleting 70: ");
        bst.inorderTraversal(bst.root);
    }

    private Integer countOnlyLeafNode(Node root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            return 1;
        }
        return countOnlyLeafNode(root.left) + countOnlyLeafNode(root.right);
    }

    private int  countTotalNodes(Node root) {
        if(root == null) return 0;
        return 1 + countTotalNodes(root.left) + countTotalNodes(root.right);
    }

    private Node delete(Node root, int data) {
        if(root == null) return null;

        if(data < root.data) {
            root.left =  delete(root.left, data);
        } else if (data > root.data) {
           root.right =  delete(root.right, data);
        } else {
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int min = root.data;
        while(root.left!= null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    private Boolean search(Node root, int data) {
        if(root == null) return false;
        if(data == root.data) return true;
        else if(data < root.data){
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    private void inorderTraversal(Node root) {
        if(root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data+ " ");
            inorderTraversal(root.right);
        }
    }

    private Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }
        if(data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
}

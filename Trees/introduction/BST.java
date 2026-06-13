public class BST {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        Node(int value) {
            this.value = value;
        }

        public int getValue(Node node) {
            return node.value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(Node node){
          return root == null;
    }

    public void insert(int value){
        root = insert(value,root);
    }

    private Node insert(int value,Node node){
        if (node==null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;

        return node;
    }

    public void populate(int[] arr){
        for(int num : arr){
            this.insert(num);
        }
    }

    public void display(){
        display(this.root,"Root Node : ");
    }

    private void display(Node node,String details){
        if (node==null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "left child of "+node.value+" : ");
        display(node.right, "right child of "+node.value+" : ");
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if (node==null) {
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if (node==null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if (node==null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }



    BST() {

    }
    public static void main(String[] args) {
        int[] arr = {10,5,7,2,8,9,23,45};
        BST tree = new BST();
        tree.populate(arr);
        // tree.display();
        System.out.println("Pre Order traversal : ");
        tree.preOrder();
        System.out.println("In Order traversal : ");
        tree.inOrder();
        System.out.println("Post Order traversal : ");
        tree.postOrder();
    }
}

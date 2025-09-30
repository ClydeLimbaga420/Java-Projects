public class BST {
    Node root;

    public BST() {
        root = null;
    }

    Node insert(Node root,int data) {

        if (root == null) {
            root = new Node(data);
            return root ;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);

        }
        return root;
    }

    public void insertData(int data) {
        root = insert(root,data);
    }

    boolean searchData(int data) {
        return search(root,data);
    }

    boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        if (data < root.data) {
            return search(root.left, data);
        }
            return search(root.right, data);
    }

    public void inOrderData() {
        inOrder(root);
    }

    public void inOrder(Node root) {
        if ( root == null ) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }



    public void preOrder( Node root ) {
        if ( root == null ) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrderData() {
        preOrder(root);
    }

    public void postOrder( Node root ) {
        if ( root == null ) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void postOrderData() {
        postOrder(root);
    }


    public void display() {
        System.out.println(root.data);
    }
}

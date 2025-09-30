public class Main {
    public static void main (String[] args) {

        BST c = new BST();

        c.insertData(68);
        c.insertData(34);
        c.insertData(54);
        c.insertData(98);
        c.insertData(91);
        c.insertData(93);
        c.insertData(45);
        System.out.println("In Order Traversal");
        c.inOrderData();
        System.out.println();
        System.out.println("Pre-Order Traversal");
        c.preOrderData();
        System.out.println();
        System.out.println("Post-Order Traversal");
        c.postOrderData();
        System.out.println();
        System.out.println("Searching 99");
        System.out.println(c.searchData(99));
        System.out.println("Searching 91");
        System.out.println(c.searchData(91));


    }
}
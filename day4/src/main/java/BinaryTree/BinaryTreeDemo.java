package BinaryTree;

public class BinaryTreeDemo {
    Node root;


    public void insert(int value){
        root = insertRecursively(root, value);
    }

    public Node insertRecursively(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = insertRecursively(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursively(current.right, value);
        }
        return current;
    }

    public void printInOrder(Node node){
        if (node != null) {
            printInOrder(node.left);
            System.out.println(node.value + "");
            printInOrder(node.right);
        }
    }
    public void printInOrder(){
        printInOrder(root);
    }

    public int findMin(){
            Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    public int findMax() {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;    }

    public static void main(String[] args) {
        BinaryTreeDemo tree = new BinaryTreeDemo();

        tree.insert(50);
        tree.insert(70);
        tree.insert(30);
        tree.insert(60);
        tree.insert(20);
        tree.insert(10);
        tree.insert(40);

        tree.printInOrder();
        System.out.println("Min: "+ tree.findMin());
        System.out.println("Max: "+ tree.findMax());
    }

}

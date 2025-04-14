package BinaryTreeContains;

public class BinaryTreeExample {
    Node root;

    public void insert(int value) {
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

    public void print(Node node){
        if (node != null) {
            print(node.left);
            System.out.println(node.value);
            print(node.right);
        }
    }

    public void print(){
        print(root);
    }

    public boolean contains(Node current,int searchedValue) {
        if (current == null) {
            return false;
        }
        if (searchedValue == current.value) {
            return true;
        }
        if (searchedValue < current.value) {
            return contains(current.left, searchedValue);
        }
        return contains(current.right, searchedValue);
    }
    public static void main(String[] args) {
        BinaryTreeExample tree = new BinaryTreeExample();

        tree.insert(250);
        tree.insert(300);
        tree.insert(100);
        tree.insert(350);
        tree.insert(150);

        tree.print();

        System.out.println("Coincidencia: " + tree.contains(tree.root,351));
    }
}

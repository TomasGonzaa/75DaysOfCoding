public class Stack {


    String input = "hola";
    java.util.Stack<Character> stack1 = new java.util.Stack<>();
    String output = "";

    public void invertInput(){
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            stack1.push(letter);
            //System.out.println(stack1);
            //PALABRA H-0-L-A formada
        }
        while (!stack1.isEmpty()) {
            output += String.valueOf(stack1.peek());
            stack1.pop();
//            System.out.println(output);
        }
        System.out.println(output);

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.invertInput();
    }
}

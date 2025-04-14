import java.util.Stack;

public class LeetCode1 {
    char simbol;

    public boolean validString(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            simbol = s.charAt(i);
            //SI SON DE APERTURA LOS PUSHEA AL STACK
            if (simbol == '(' || simbol == '[' || simbol == '{'){
                stack.push(simbol);
                //SI SON DE CIERRE DEBEN IR ACOMPAÑADOS PREVIAMENTE POR
                //SU CORRESPONDIENTE DE APERTURA
            } else if (simbol == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (simbol == '}') {
                    if (stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
            } else if (simbol == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
            }
        }return stack.isEmpty();
    }

    public void stackPop(){
        Stack<String> stack2 = new Stack<>();
        System.out.println(stack2);

        stack2.push("1");
        stack2.push("2");
        stack2.push("3");
        stack2.push("4");

        System.out.println(stack2.peek());

        System.out.println(stack2);

        stack2.pop();
        System.out.println(stack2.pop());

        System.out.println(stack2);


    }

        public static void main (String[]args){
            LeetCode1 leetCode1 = new LeetCode1();

            String s1 = "()";
            String s2 = "()[]{}";
            String s3 = "(]";
            String s4 = "([])";
            String s5 = "({)}";

            System.out.println("Resultado: "+ leetCode1.validString(s1));
            System.out.println("Resultado: "+ leetCode1.validString(s2));
            System.out.println("Resultado: "+ leetCode1.validString(s3));
            System.out.println("Resultado: "+ leetCode1.validString(s4));
            System.out.println("Resultado: "+ leetCode1.validString(s5));



            //solo para ver como funciona STACK POP()
//            leetCode1.stackPop();
        }
    }


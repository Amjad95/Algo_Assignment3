package task9;


import javax.swing.JOptionPane;
import java.util.Stack;

public class Brackets {

    public static int checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && stack.peek().equals(ch)) {
                stack.pop();
            } else if (ch == ']' && stack.peek().equals(ch)) {
                stack.pop();
            } else if (ch == '}' && stack.peek().equals(ch)) {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return -1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {

        String input;

        do {
            input = JOptionPane.showInputDialog("Bracketed expression:");
            if (input != null) {

                System.out.println("Input: " + input);
                int checkResult = checkBrackets(input);
                if (checkResult == -1) {
                    JOptionPane.showMessageDialog(null,
                            input + "\nOK", "Result", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("check OK");
                } else {
                    JOptionPane.showMessageDialog(null, input + "\nError at position " + checkResult, "Result", JOptionPane.ERROR_MESSAGE);
                    System.out.println("check: ERROR at position " + checkResult);
                }
            }

        } while (input != null);

    }

}

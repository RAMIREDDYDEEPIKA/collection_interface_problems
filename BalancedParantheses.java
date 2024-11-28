package StackInterface;

import java.util.Stack;

public class BalancedParantheses
{
    public static boolean isBalanced(String str)
    {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray())
        {
            if (ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']')
            {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close)
    {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args)
    {
        String str1 = "{[()]}";
        String str2 = "{[(])}";
        String str3 = "{[}";
        String str4 = "()[]{}";

        System.out.println("Is " + str1 +" balanced? " + isBalanced(str1));
        System.out.println("Is " + str2 + " balanced? " + isBalanced(str2));
        System.out.println("Is " + str3 + " balanced? " + isBalanced(str3));
        System.out.println("Is " + str4 + " balanced? " + isBalanced(str4));
    }
}
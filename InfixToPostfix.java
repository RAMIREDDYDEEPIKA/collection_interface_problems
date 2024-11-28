package StackInterface;

import java.util.Stack;

public class InfixToPostfix
{
    public static String infixToPostfix(String expression)
    {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char ch : expression.toCharArray())
        {
            if (Character.isLetterOrDigit(ch))
            {
                postfix.append(ch);
            }
            else if (ch == '(')
            {
                stack.push(ch);
            }
            else if (ch == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(')
                {
                    stack.pop();
                }
            }
            else
            {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
                {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty())
        {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    private static int precedence(char operator)
    {
        switch (operator)
        {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default: return -1;
        }
    }

    public static void main(String[] args)
    {
        String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";
        String postfixExpression = infixToPostfix(infixExpression);

        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}
package StackInterface;

import java.util.Stack;

public class EvaluatePostfix
{
    public static int evaluatePostfix(String expression)
    {
        Stack<Integer> stack = new Stack<>();

        for (char ch : expression.toCharArray())
        {
            if (Character.isDigit(ch))
            {
                stack.push(ch - '0');
            }
            else
            {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOperator(a, b, ch));
            }
        }
        return stack.pop();
    }

    public static int applyOperator(int a, int b, char operator) {
        switch (operator)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '^':
                System.out.println((int) Math.pow(a, b));
                break;
            default:
                System.out.println("Invalid operator: " + operator);
        }
        return operator;
    }

    public static void main(String[] args)
    {
        String postfixExpression = "231*+9-";
        int result = evaluatePostfix(postfixExpression);

        System.out.println("Postfix Expression: " + postfixExpression);
        System.out.println("Result: " + result);
    }
}
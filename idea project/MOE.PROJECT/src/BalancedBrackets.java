import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    static boolean checkBracket(String brackets) {
        Deque<Character> stack = new ArrayDeque();

        for (int i = 0; i < brackets.length(); i++)
        {
            char x = brackets.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());
    }

    public static void main(String[] args)
    {
        String expr = "([{}])";

        if (checkBracket(expr))
            System.out.println("YES ");
        else
            System.out.println("NO ");
    }

}


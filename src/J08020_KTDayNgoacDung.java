import java.util.Scanner;
import java.util.Stack;

public class J08020_KTDayNgoacDung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        while (T > 0) {
            String S = scanner.nextLine();
            if (isValidBracketSequence(S)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }

        scanner.close();
    }

    private static boolean isValidBracketSequence(String S) {
        Stack<Character> stack = new Stack<>();

        for (char c : S.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

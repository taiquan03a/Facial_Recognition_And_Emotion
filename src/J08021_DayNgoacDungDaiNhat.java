import java.util.Scanner;
import java.util.Stack;

public class J08021_DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        while (T > 0) {
            String S = scanner.nextLine();
            int maxLength = findLongestBracketSequence(S);
            System.out.println(maxLength);
            T--;
        }
    }

    private static int findLongestBracketSequence(String S) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); 
        int maxLength = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    int length = i - stack.peek();
                    maxLength = Math.max(maxLength, length);
                } else {
                    stack.push(i);
                }
            }
        }

        return maxLength;
    }
}
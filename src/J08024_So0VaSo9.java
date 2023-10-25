import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024_So0VaSo9 {
    public static String findSmallestMultiple(int N) {
        if (N == 0) {
            return "0";
        }
        Queue<String> queue = new LinkedList<>();
        queue.add("9");

        while (true) {
            String number = queue.poll();
            if (Long.parseLong(number) % N == 0) {
                return number;
            }
            queue.add(number + "0");
            queue.add(number + "9");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng test
        int T = scanner.nextInt();

        // Đọc các test và tìm số nhỏ nhất chia hết cho N
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            String result = findSmallestMultiple(N);
            System.out.println(result);
        }
    }
}
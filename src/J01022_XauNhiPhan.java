import java.util.Scanner;

public class J01022_XauNhiPhan {
    public static void main(String[] args) {
        long length[] = new long[93];

        length[1] = 1;
        length[2] = 1;

        for (int i = 3; i < 93; i++) {
            length[i] = length[i - 2] + length[i - 1];
        }

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {

            int n = scanner.nextInt();

            long k = scanner.nextLong();

            System.out.println(check(n, k, length));
        }
    }

    private static String check(int n, long k, long[] length) {
        if (n == 1) {
            return "0";
        }

        if (n == 2) {
            return "1";
        }

        if (k > length[n - 2]) {
            return check(n - 1, k - length[n - 2], length);
        }

        return check(n - 2, k, length);
    }
}

import java.util.*;

public class J02016_BoBaSoPytago {
    public static boolean isPythagoreanTriplet(List<Integer> arr,List<Long> check) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            long a = (long)(arr.get(i) * arr.get(i));
            for (int j = i + 1; j < n; j++) {
                long b = (long)(arr.get(j) * arr.get(j));
                long c = a + b;
                if (check.contains(Long.valueOf(c))) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Đọc số lượng bộ test

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Đọc số lượng phần tử của dãy
            List<Integer> arr = new ArrayList<>();
            List<Long> check = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int x = scanner.nextInt();
                arr.add(x);
                check.add((long)(x*x));
            }

            if (isPythagoreanTriplet(arr,check)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
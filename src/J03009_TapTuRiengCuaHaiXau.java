import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03009_TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Số lượng bộ test

        scanner.nextLine(); // Đọc ký tự newline sau T

        for (int t = 0; t < T; t++) {
            String S1 = scanner.nextLine(); // Đọc xâu ký tự S1
            String S2 = scanner.nextLine(); // Đọc xâu ký tự S2

            List<String> wordsS1 = Arrays.asList(S1.split(" ")); // Tách các từ trong S1
            List<String> wordsS2 = Arrays.asList(S2.split(" ")); // Tách các từ trong S2

            Set<String> setS2 = new TreeSet<>(wordsS2); // Tạo tập hợp từ S2
            Set<String> setS1 = new TreeSet<>(wordsS1);

            for (String word : setS1) {
                if (!setS2.contains(word)) {
                    System.out.print(word + " ");
                }
            }

            System.out.println();
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JKT013  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Đọc số lượng bộ test

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Đọc số N
            List<String> result = new ArrayList<>();
            for(int k = N;k >= 1;k--){
                List<String> luckyNumbers = generateLuckyNumbers(k);
                for (int j = luckyNumbers.size() - 1; j >= 0; j--) {
                    result.add(luckyNumbers.get(j));
                }
            }
            System.out.println(result.size());
            for(String it:result){
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }

    public static List<String> generateLuckyNumbers(int N) {
        List<String> luckyNumbers = new ArrayList<>();

        if (N == 1) {
            luckyNumbers.add("6");
            luckyNumbers.add("8");
        } else {
            List<String> previousNumbers = generateLuckyNumbers(N - 1);
            for (String number : previousNumbers) {
                luckyNumbers.add(number + "6");
                luckyNumbers.add(number + "8");
            }
        }

        return luckyNumbers;
    }
}
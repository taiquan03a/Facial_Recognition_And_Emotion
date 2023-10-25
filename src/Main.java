import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] a = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = in.nextInt();
            }
        }
        List<Pair<Integer, Integer>> ed = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[i][j] == 1) {
                    ed.add(new Pair<>(i + 1, j + 1));
                }
            }
        }
        for (Pair<Integer, Integer> it : ed) {
            System.out.println("(" + it.first + "," + it.second + ")");
        }
    }
}
class Pair<T, U> {
    public T first;
    public U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}

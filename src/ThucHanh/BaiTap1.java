import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BaiTap1 {
    public static void main(String[] args) {
        String filename = "DATA.in";
        readMatrix(filename);
    }

    public static void readMatrix(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int numTests = Integer.parseInt(br.readLine());

            for (int t = 0; t < numTests; t++) {
                String[] dimensions = br.readLine().split(" ");
                int n = Integer.parseInt(dimensions[0]);
                int m = Integer.parseInt(dimensions[1]);
                int i = Integer.parseInt(dimensions[2]);

                int[][] matrix = new int[n][m];

                for (int row = 0; row < n; row++) {
                    String[] values = br.readLine().split(" ");
                    for (int col = 0; col < m; col++) {
                        matrix[row][col] = Integer.parseInt(values[col]);
                    }
                }

                int[] columnToSort = new int[n];
                for (int row = 0; row < n; row++) {
                    columnToSort[row] = matrix[row][i - 1];
                }

                Arrays.sort(columnToSort);

                for (int row = 0; row < n; row++) {
                    for (int col = 0; col < m; col++) {
                        if (col == i - 1) {
                            System.out.print(columnToSort[row] + " ");
                        } else {
                            System.out.print(matrix[row][col] + " ");
                        }
                    }
                    System.out.println();
                }

                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
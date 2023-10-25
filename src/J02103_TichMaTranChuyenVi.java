import java.util.Scanner;

public class J02103_TichMaTranChuyenVi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int test = 1; test <= T; test++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            // Đọc ma trận A
            int[][] A = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = scanner.nextInt();
                }
            }
            // Tạo ma trận kết quả B có kích thước m hàng và n cột
            int[][] B = new int[m][n];
            for(int i = 0;i < m;i++){
                for(int j = 0;j < n;j++){
                    B[i][j] = A[j][i];
                }
            }
            int[][] C  = new int[n][n];
            // Tính tích của ma trận A với ma trận chuyển vị của A và lưu kết quả vào ma trận B
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for(int k = 0;k < m;k++){
                        C[i][j] += A[i][k]*B[k][j];
                    }
                }
            }
            // 1 2 3
            // 3 4 5

            // 1 3
            // 2 4
            // 3 5
            // In ra thứ tự bộ test
            System.out.println("Test " + test + ":");

            // In ra ma trận kết quả B
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Đóng Scanner
        scanner.close();
    }
}
//14 77
//32 77
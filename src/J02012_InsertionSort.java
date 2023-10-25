import java.util.Scanner;

public class J02012_InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số phần tử của dãy
        int N = scanner.nextInt();

        // Đọc dãy số nguyên
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Thực hiện thuật toán sắp xếp chèn
        for (int i = 0; i < N; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            // In ra từng bước thực hiện thuật toán
            System.out.print("Buoc " + i + ": ");
            for (int k = 0; k <= i; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
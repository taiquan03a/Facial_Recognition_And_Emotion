import java.util.Scanner;

public class J02020_LietKeToHop_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Đọc dữ liệu vào
        //System.out.print("Nhập N và K: ");
        int N = input.nextInt();
        int K = input.nextInt();
        
        // Khởi tạo mảng chứa tập hợp các số nguyên từ 1 đến N
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }
        
        // Khởi tạo mảng chứa chỉ số của các phần tử trong tổ hợp
        int[] combination = new int[K];
        for (int i = 0; i < K; i++) {
            combination[i] = i;
        }
        
        int count = 0; // Đếm số tổ hợp
        
        // Liệt kê tất cả các tổ hợp
        while (combination[K - 1] < N) {
            // In ra tổ hợp hiện tại
            for (int i = 0; i < K; i++) {
                System.out.print(array[combination[i]] + " ");
            }
            System.out.println();
            
            count++;
            
            // Tìm phần tử cuối cùng có thể tăng
            int t = K - 1;
            while (t >= 0 && combination[t] == N - K + t) {
                t--;
            }
            
            if (t < 0) {
                break; // Tất cả các phần tử đã đạt giá trị lớn nhất
            }
            
            // Tăng giá trị của phần tử t
            combination[t]++;
            
            // Cập nhật các giá trị phía sau phần tử t
            for (int i = t + 1; i < K; i++) {
                combination[i] = combination[i - 1] + 1;
            }
        }
        
        // Ghi ra tổng số tổ hợp
        System.out.println("Tong cong co " + count + " to hop");
    }
}
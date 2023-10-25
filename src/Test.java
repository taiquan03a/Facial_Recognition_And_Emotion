import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Đọc số lượng bộ test
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            // Đọc số lượng phần tử trong mỗi test
            int N = scanner.nextInt();
            
            // Đọc dãy số A
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            
            // Tìm phần tử bên phải đầu tiên lớn hơn từng phần tử trong A
            int[] result = findNextGreaterElements(A);
            
            // In kết quả
            for (int i = 0; i < N; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static int[] findNextGreaterElements(int[] A) {
        Stack<Integer> stack = new Stack<>();  // Ngăn xếp để lưu trữ các phần tử chưa có giá trị kết quả
        int[] result = new int[A.length];  // Mảng kết quả, ban đầu toàn giá trị 0
        
        for (int i = A.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[i] >= stack.peek()) {
                stack.pop();
            }
            
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            
            stack.push(A[i]);
        }
        
        return result;
    }
}
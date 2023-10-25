import java.util.Scanner;

public class J01025_HinhVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc dữ liệu đầu vào
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        // Tìm tọa độ trái dưới và phải trên của hình vuông
        int minX = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int minY = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        int maxX = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int maxY = Math.max(Math.max(y1, y2), Math.max(y3, y4));

        // Tính diện tích của hình vuông
        int sideLength = Math.max(maxX - minX, maxY - minY);
        int squareArea = sideLength * sideLength;

        // In ra diện tích của hình vuông
        System.out.println(squareArea);
    }
}
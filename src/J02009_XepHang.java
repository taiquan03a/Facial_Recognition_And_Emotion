import java.util.Arrays;
import java.util.Scanner;

public class J02009_XepHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] T = new int[N];
        int[] D = new int[N];

        for (int i = 0; i < N; i++) {
            T[i] = scanner.nextInt();
            D[i] = scanner.nextInt();
        }

        // Sắp xếp các vị khách theo thời điểm đến (tăng dần)
        Guest[] guests = new Guest[N];
        for (int i = 0; i < N; i++) {
            guests[i] = new Guest(T[i], D[i]);
        }
        Arrays.sort(guests);

        int currentTime = 0;
        for (int i = 0; i < N; i++) {
            if (guests[i].arrivalTime > currentTime) {
                currentTime = guests[i].arrivalTime;
            }
            currentTime += guests[i].processingTime;
        }

        System.out.println(currentTime);
    }

    static class Guest implements Comparable<Guest> {
        int arrivalTime;
        int processingTime;

        public Guest(int arrivalTime, int processingTime) {
            this.arrivalTime = arrivalTime;
            this.processingTime = processingTime;
        }

        @Override
        public int compareTo(Guest other) {
            return this.arrivalTime - other.arrivalTime;
        }
    }
}
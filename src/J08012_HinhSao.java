import java.util.*;

public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Tạo danh sách kề
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        // Đọc các cạnh và xây dựng danh sách kề
        for (int i = 0; i < N - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        // Kiểm tra đồ thị có phải dạng Hình Sao hay không
        if (isStarGraph(adjacencyList, N)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isStarGraph(List<List<Integer>> adjacencyList, int N) {
        int edges = countEdges(adjacencyList);
        if (edges != N - 1) {
            return false;
        }

        boolean[] visited = new boolean[N + 1];
        int count = dfs(adjacencyList, visited, 1);

        return count == N && edges == N - 1;
    }

    private static int countEdges(List<List<Integer>> adjacencyList) {
        int count = 0;
        for (List<Integer> neighbors : adjacencyList) {
            count += neighbors.size();
        }
        return count / 2;
    }

    private static int dfs(List<List<Integer>> adjacencyList, boolean[] visited, int node) {
        visited[node] = true;
        int count = 1;

        for (int neighbor : adjacencyList.get(node)) {
            if (!visited[neighbor]) {
                count += dfs(adjacencyList, visited, neighbor);
            }
        }

        return count;
    }
}
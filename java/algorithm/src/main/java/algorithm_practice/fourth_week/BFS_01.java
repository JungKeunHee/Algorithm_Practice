package algorithm_practice.fourth_week;

import java.util.*;

public class BFS_01 {
    public static void main(String[] args) {
        // 그래프 초기화 (인접 리스트)
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3, 4));
        graph.put(2, Arrays.asList(1, 5));
        graph.put(3, Arrays.asList(1, 6, 7));
        graph.put(4, Arrays.asList(1, 8));
        graph.put(5, Arrays.asList(2, 9));
        graph.put(6, Arrays.asList(3, 10));
        graph.put(7, Arrays.asList(3));
        graph.put(8, Arrays.asList(4));
        graph.put(9, Arrays.asList(5));
        graph.put(10, Arrays.asList(6));

        List<Integer> result = bfsQueue(graph, 1);
        System.out.println(result);  // 👉 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }

    public static List<Integer> bfsQueue(Map<Integer, List<Integer>> graph, int startNode) {
        List<Integer> visitedOrder = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            visitedOrder.add(current);

            for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return visitedOrder;
    }
}

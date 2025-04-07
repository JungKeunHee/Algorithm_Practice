package algorithm_practice.third_week;

//초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 함수를 완성하세요.
//
// prices = [1, 2, 3, 2, 3]
// answer = [4, 3, 1, 1, 0]

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_02 {
    public static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i); // 인덱스를 큐에 넣음
        }

        while (!queue.isEmpty()) {
            int i = queue.poll(); // 꺼낸 인덱스 기준으로
            int time = 0;

            for (int j = i + 1; j < n; j++) {
                time++;
                if (prices[i] > prices[j]) break;
            }

            answer[i] = time;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println("정답 = [4, 3, 1, 1, 0] / 현재 풀이 값 = " + Arrays.toString(solution(prices)));
    }
}

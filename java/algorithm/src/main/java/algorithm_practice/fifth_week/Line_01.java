package algorithm_practice.fifth_week;

//Q. 연인 코니와 브라운은 광활한 들판에서 ‘나 잡아 봐라’ 게임을 한다.
//이 게임은 브라운이 코니를 잡거나, 코니가 너무 멀리 달아나면 끝난다.
//게임이 끝나는데 걸리는 최소 시간을 구하시오.
//
//조건은 다음과 같다.
//코니는 처음 위치 C에서 1초 후 1만큼 움직이고,
//이후에는 가속이 붙어 매 초마다 이전 이동 거리 + 1만큼 움직인다.
//즉 시간에 따른 코니의 위치는 C, C + 1, C + 3, C + 6, …이다.
//
//브라운은 현재 위치 B에서 다음 순간 B – 1, B + 1, 2 * B 중 하나로 움직일 수 있다.
//코니와 브라운의 위치 p는 조건 0 <= x <= 200,000을 만족한다.
//브라운은 범위를 벗어나는 위치로는 이동할 수 없고, 코니가 범위를 벗어나면 게임이 끝난다

import java.util.LinkedList;
import java.util.Queue;

public class Line_01 {
    public static void main(String[] args) {
        int c = 11;
        int b = 2;

        System.out.println("정답 = 5 / 현재 풀이 값 = " + catchMe(c, b));
    }

    public static int catchMe(int c, int b) {
        final int MAX = 200000;
        boolean[][] visited = new boolean[2][MAX + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(b);
        visited[0][b] = true;

        int time = 0;
        while (true) {
            int cony = c + time * (time + 1) / 2;
            if (cony > MAX) return -1; // 코니가 범위 밖이면 실패

            if (visited[time % 2][cony]) return time; // 브라운이 코니를 잡음

            time++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int now = queue.poll();
                for (int next : new int[]{now - 1, now + 1, now * 2}) {
                    if (next >= 0 && next <= MAX && !visited[time % 2][next]) {
                        visited[time % 2][next] = true;
                        queue.offer(next);
                    }
                }
            }
        }
    }
}

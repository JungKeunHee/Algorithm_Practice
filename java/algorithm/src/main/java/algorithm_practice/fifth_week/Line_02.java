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

public class Line_02 {
    public static void main(String[] args) {
        int c = 11;
        int b = 2;

        System.out.println("정답 = 5 / 현재 풀이 값 = " + catchMe(c, b));
    }

    public static int catchMe(int c, int b) {

        // 범위 설정
        final int MAX = 200000;

        // 방문 기록 배열
        boolean[][] visited = new boolean[2][MAX + 1]; // 0과 1의 2개의 행을 고정으로 MAX 값 범위만큼 2차원 배열 생성

        // BFS, 큐 이용
        Queue<Integer> queue = new LinkedList<>();
        // 큐 변수에 b 위치 값을 넣음
        queue.add(b);
        // 방문 0번째 행의 b 위치에 true 값을 넣음 (브라운 처음 위치 설정)
        visited[0][b] = true;

        // 타이머 초기화
        int time = 0;

        while(true) {
            int cony = c + time * (time + 1) / 2; // 등차수열로 현재 코니 위치 설정
            if(cony > MAX) return -1; // 만약 코니가 범위 밖으로 나간다면 -1 값을 반환 (while 문 멈춤)

            if(visited[time % 2][cony]) return time; // 코니를 잡은 시점의 시간초 반환

            // 만족하지 않는다면 계속 time 변수에 +1 해주기
            time++;

            int size = queue.size(); // 큐 범위 사이즈 설정
            for (int i = 0; i < size; i++) {
                int now = queue.poll(); // 반복문을 통해서 현재 브라운 위치 꺼내서 now 에 담아준다.

                // 향상된 for 문으로 각각의 now 의 이동 거리를 next 변수에 담아서
                for (int next : new int[]{now - 1, now + 1, now * 2}) {
                    // 조건에 맞다면 방문 기록에 true 값으로 넣어준다.
                    if (next >= 0 && next <= MAX && !visited[time % 2][next]) {
                        visited[time % 2][next] = true;

                        // 그리고 next 값을 queue 에 넣어준다.
                        queue.offer(next);
                    }
                }
            }
        }
    }
}

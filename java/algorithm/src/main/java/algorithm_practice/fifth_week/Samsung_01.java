package algorithm_practice.fifth_week;

import java.util.*;

public class Samsung_01 {
    static int N = 4, K = 4;
    static int[][] map;
    static List<Integer>[][] board;
    static Horse[] horses;

    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {1, -1, 0, 0};

    public static void main(String[] args) {
        map = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        // 말 위치 초기화
        horses = new Horse[]{
                new Horse(0, 0, 0),
                new Horse(0, 1, 0),
                new Horse(0, 2, 0),
                new Horse(2, 2, 2)
        };

        // 체스판 위 말 스택 초기화
        board = new ArrayList[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) 
                board[i][j] = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            Horse h = horses[i];
            board[h.row][h.col].add(i); // 말 번호 i를 칸에 쌓음
        } 

        System.out.println(simulate());
    }

    static int simulate() {
        for (int turn = 1; turn <= 1000; turn++) {
            for (int i = 0; i < K; i++) {
                if (move(i)) return turn;
            }
        }
        return -1;
    }
    

    static boolean move(int i) {
        Horse h = horses[i];
        int r = h.row;
        int c = h.col;
        int d = h.dir;

        int nr = r + dr[d];
        int nc = c + dc[d]; 

        // 이동 전 말 스택 확인
        List<Integer> stack = board[r][c];
        int idx = stack.indexOf(i); 
        List<Integer> moving = new ArrayList<>(stack.subList(idx, stack.size()));
        stack.subList(idx, stack.size()).clear();

        // 이동 불가능(범위 밖 or 파란색)
        if (!inRange(nr, nc) || map[nr][nc] == 2) {
            // 방향 반전
            h.dir = reverseDir(h.dir);
            nr = r + dr[h.dir];
            nc = c + dc[h.dir];

            // 반전 후에도 불가능하면 제자리
            if (!inRange(nr, nc) || map[nr][nc] == 2) {
                stack.addAll(moving); // 다시 제자리로
                return false;
            }
        }

        // 이동 가능 → 흰색/빨간색
        if (map[nr][nc] == 1) Collections.reverse(moving); // 빨간색이면 뒤집기

        for (int num : moving) {
            horses[num].row = nr;
            horses[num].col = nc;
            board[nr][nc].add(num); 
        }

        // 종료 조건
        return board[nr][nc].size() >= 4; 
    }

    static boolean inRange(int r, int c) {
        return r >= 0 && r < N && c >= 0 && c < N;
    }

    static int reverseDir(int d) {
        if (d == 0) return 1;
        if (d == 1) return 0;
        if (d == 2) return 3;
        return 2;
    }

    static class Horse {
        int row, col, dir;
        Horse(int r, int c, int d) {
            this.row = r;
            this.col = c;
            this.dir = d;
        }
    }
}


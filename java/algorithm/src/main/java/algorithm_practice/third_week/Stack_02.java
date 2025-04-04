package algorithm_practice.third_week;

import java.util.Arrays;
import java.util.Stack;

public class Stack_02 {
    public static void main(String[] args) {
        int[] heights = {6, 9, 5, 7, 4};

        // stack을 직접 쓰지 않고 index로 재귀 돌림
        int[] result = new int[heights.length];
        recursive(heights, result, heights.length - 1);
        System.out.println("결과: " + Arrays.toString(result));
    }

    // index: 현재 오른쪽 탑부터 하나씩 탐색
    public static void recursive(int[] heights, int[] result, int index) {
        if (index < 0) return;

        int current = heights[index];
        result[index] = 0;

        for (int i = index - 1; i >= 0; i--) {
            if (heights[i] > current) {
                result[index] = i + 1;
                break;
            }
        }

        recursive(heights, result, index - 1);
    }
}

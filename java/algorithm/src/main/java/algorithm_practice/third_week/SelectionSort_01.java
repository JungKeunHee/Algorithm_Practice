package algorithm_practice.third_week;

import java.util.Arrays;

public class SelectionSort_01 {
    public static void main(String[] args) {
        int[] input = {4, 6, 2, 9, 1};

        selectionSort(input);

        System.out.println("정렬 결과: " + Arrays.toString(input)); // [1, 2, 4, 6, 9]
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // 나머지 부분에서 가장 작은 값의 인덱스 찾기
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // 현재 위치(i)와 가장 작은 값 위치(minIndex)를 교환
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}

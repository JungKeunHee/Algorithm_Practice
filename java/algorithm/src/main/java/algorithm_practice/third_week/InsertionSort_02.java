package algorithm_practice.third_week;

import java.util.Arrays;

public class InsertionSort_02 {
    public static void main(String[] args) {
        int[] input = {4, 6, 2, 9, 1};
        insertionSort(input);
        System.out.println("정렬 결과: " + Arrays.toString(input)); // [1, 2, 4, 6, 9]

        // 테스트 추가
        System.out.println("테스트1: " + Arrays.toString(insertionSort(new int[]{5, 8, 4, 7, 7})));
        System.out.println("테스트2: " + Arrays.toString(insertionSort(new int[]{3, -1, 17, 9})));
        System.out.println("테스트3: " + Arrays.toString(insertionSort(new int[]{100, 56, -3, 32, 44})));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];  // 지금 삽입할 숫자
            int j = i - 1;

            // 왼쪽 값이 key보다 크면 오른쪽으로 이동
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // 자리를 찾았으면 삽입
            array[j + 1] = key;
        }
        return array;
    }
}

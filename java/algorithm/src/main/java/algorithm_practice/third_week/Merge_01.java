package algorithm_practice.third_week;

import java.util.*;

public class Merge_01 {

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 5};
        int[] arrayB = {4, 6, 7, 8};

        System.out.println(Arrays.toString(merge(arrayA, arrayB)));

        System.out.println("정답 = [-7, -1, 5, 6, 9, 10, 11, 40] / 현재 풀이 값 = " +
                Arrays.toString(merge(new int[]{-7, -1, 9, 40}, new int[]{5, 6, 10, 11})));

        System.out.println("정답 = [-1, 2, 3, 5, 10, 40, 78, 100] / 현재 풀이 값 = " +
                Arrays.toString(merge(new int[]{-1, 2, 3, 5, 40}, new int[]{10, 78, 100})));

        System.out.println("정답 = [-1, -1, 0, 1, 6, 9, 10] / 현재 풀이 값 = " +
                Arrays.toString(merge(new int[]{-1, -1, 0}, new int[]{1, 6, 9, 10})));
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] c = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            c[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            c[array1.length + i] = array2[i];
        }

        Arrays.sort(c);
        
        return c;
    }

}

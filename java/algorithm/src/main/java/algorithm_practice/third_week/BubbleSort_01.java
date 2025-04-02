package algorithm_practice.third_week;

import java.util.*;

public class BubbleSort_01 {
    public static void main(String[] args) {
        int[] a = {4, 6, 2, 9, 1};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}


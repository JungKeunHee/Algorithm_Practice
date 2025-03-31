package algorithm_practice.second_week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsExistingTargetNumberBinary_02 {
    public static void main(String[] args) {

        int targetNumber = 2;
        int[] arr = new int[]{0, 3, 5, 6, 1, 2, 4};
        boolean isTrue = false;

        Arrays.sort(arr);

        int currentMin = 0;
        int currentMax = arr.length - 1;

        while (currentMin <= currentMax) {
            int currentGuess = (currentMin + currentMax) / 2;

            if (arr[currentGuess] == targetNumber) {
                isTrue = true;
                break;
            }

            if (arr[currentGuess] < targetNumber) {
                currentMin = currentGuess + 1;
            } else {
                currentMax = currentGuess - 1;
            }
        }

        System.out.println("isTrue = " + isTrue);
    }
}

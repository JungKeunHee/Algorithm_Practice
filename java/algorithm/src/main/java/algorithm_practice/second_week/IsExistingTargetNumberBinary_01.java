package algorithm_practice.second_week;

public class IsExistingTargetNumberBinary_01 {
    public static void main(String[] args) {

        int targetNumber = 14;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        boolean isTrue = false;

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
                currentMax = currentMax - 1;
            }
        }

        System.out.println("isTrue = " + isTrue);
    }
}

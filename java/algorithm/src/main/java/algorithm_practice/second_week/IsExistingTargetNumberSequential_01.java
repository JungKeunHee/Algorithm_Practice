package algorithm_practice.second_week;

public class IsExistingTargetNumberSequential_01 {
    public static void main(String[] args) {

        int targetNumber = 14;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        boolean isTrue = false;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == targetNumber) {
                isTrue = true;
            }
        }

        System.out.println("isTrue = " + isTrue);
    }
}

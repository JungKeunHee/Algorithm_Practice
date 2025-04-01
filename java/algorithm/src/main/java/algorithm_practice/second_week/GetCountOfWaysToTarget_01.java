package algorithm_practice.second_week;

public class GetCountOfWaysToTarget_01 {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int targetNumber = 3;

        int result = dfs(numbers, 0, 0, targetNumber);
        System.out.println("result = " + result);  // 출력: 5
    }

    public static int dfs(int[] numbers, int index, int sum, int target) {

        System.out.println("index: " + index + ", sum: " + sum);

        // 종료 조건: 모든 숫자를 다 썼을 때
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }

        // 현재 숫자에 + 또는 - 를 붙이는 두 가지 경우의 수
        int plus = dfs(numbers, index + 1, sum + numbers[index], target);
        int minus = dfs(numbers, index + 1, sum - numbers[index], target);

        return plus + minus;
    }
}
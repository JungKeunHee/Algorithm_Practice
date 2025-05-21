package algorithm_practice.second_week;

public class GetCountOfWaysToTarget_04 {

//    📘 문제 설명
//    정수 배열 nums와 정수 N, K가 주어집니다.
//    nums에서 정확히 N개의 숫자를 골라 곱했을 때, 그 값이 K가 되는 경우의 수를 구하세요.

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int N = 2;
        int K = 6;

        int result = dfs(nums, 0, N, 1, K);
        System.out.println("result = " + result);
    }

    public static int dfs(int[] nums, int index, int count, int multiply, int target) {

        if (count == 0){
            return multiply == target ? 1 : 0;
        }

        if (index == nums.length) {
            return 0; 
        }

        int mul = dfs(nums, index + 1, count - 1, multiply * nums[index], target);
        int mul2 = dfs(nums, index + 1, count, multiply, target);

        return mul + mul2;
    }
}
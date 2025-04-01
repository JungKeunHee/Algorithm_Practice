package algorithm_practice.second_week;

public class GetCountOfWaysToTarget_03 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int M = 3;
        int K = 6;

        int result = dfs(nums, 0, M, 0, K);
        System.out.println("result = " + result);  // 예상: 3
    }

    public static int dfs(int[] nums, int index, int count, int sum, int target) {
        if (count == 0) {
            return sum == target ? 1 : 0;
        }

        if (index == nums.length) {
            return 0;
        }

        // 현재 숫자 선택 (count - 1)
        int take = dfs(nums, index + 1, count - 1, sum + nums[index], target);

        // 현재 숫자 선택 안 함 (count 그대로)
        int skip = dfs(nums, index + 1, count, sum, target);

        return take + skip;
    }
}
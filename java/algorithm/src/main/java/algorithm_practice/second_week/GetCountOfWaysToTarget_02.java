package algorithm_practice.second_week;

import java.util.Arrays;

public class GetCountOfWaysToTarget_02 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, -1, 4};
        int target = 4;

        int result = dfs(nums, 0, 0, 0, target);
        System.out.println("result = " + result);  // 예상: 3
    }

    public static int dfs(int[] nums, int index, int count, int sum, int target) {
        // 숫자 3개를 선택했을 때만 결과 체크
        if (count == 3) {
            return sum == target ? 1 : 0;
        }

        // 배열 끝까지 갔으면 종료
        if (index == nums.length) return 0;

        System.out.println("index: " + index + ", count: " + count + ", sum: " + sum);

        // 1. 현재 숫자를 선택하는 경우
        int take = dfs(nums, index + 1, count + 1, sum + nums[index], target);
        // 2. 현재 숫자를 선택하지 않는 경우
        int skip = dfs(nums, index + 1, count, sum, target);

        return take + skip;
    }
}

/*
* 선택한 경우 1-1
* dfs([2, 3, 1, 0, -1, 4], 1, 1, 2, 4)
* 선택한 경우 1-2
* dfs([2, 3, 1, 0, -1, 4], 2, 2, 5, 4)
* 선택 안한 경우 1-3
* dfs([2, 3, 1, 0, -1, 4], 2, 1, 2, 4)
*
* 선택 안한 경우 2
* dfs([2, 3, 1, 0, -1, 4], 1, 0, 0, 4)
* 선택한 경우 2-1
* dfs([2, 3, 1, 0, -1, 4], 2, 1, 3, 4)
* 선택안한 경우 2-2
* dfs([2, 3, 1, 0, -1, 4], 2, 0, 0, 4)
* */
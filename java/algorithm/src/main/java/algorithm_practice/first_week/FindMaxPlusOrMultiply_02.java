package algorithm_practice.first_week;

//💡 문제: 괄호를 넣어 최댓값 만들기
//✅ 난이도: 상 (Lv.4.5)
//🧩 조건:
//정수 배열이 주어졌을 때,
//+ 또는 ✕ 연산자를 넣되, 한 번만 괄호를 추가할 수 있다.
//모든 연산은 왼쪽에서 오른쪽 순서대로 처리되고,
//괄호가 포함된 부분은 먼저 계산한 뒤 그 값을 사용합니다.
//
//🔽 예시 설명:
//배열: [1, 2, 3, 4]
//
//가능한 조합 예시:
//
//        ((1 + 2) * 3 * 4) → 36
//
//        (1 + (2 * 3)) * 4 → 28
//
//        1 + (2 * (3 + 4)) → 15
//
//최대값을 반환하는 프로그램을 작성하세요.

public class FindMaxPlusOrMultiply_02 {
    public static void main(String[] args) {
        System.out.println("정답 = 36 / 현재 풀이 값 = " + findMaxWithOneParenthesis(new int[]{1, 2, 3, 4}));
        System.out.println("정답 = 180 / 현재 풀이 값 = " + findMaxWithOneParenthesis(new int[]{1, 2, 3, 4, 5}));
        System.out.println("정답 = 270 / 현재 풀이 값 = " + findMaxWithOneParenthesis(new int[]{1, 1, 1, 3, 3, 2, 5}));
    }

    public static int findMaxWithOneParenthesis(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                // 1. i~j 구간을 괄호로 계산한 값 구하기
                int grouped = array[i];
                for (int k = i + 1; k <= j; k++) {
                    if (grouped <= 1 || array[k] <= 1) grouped += array[k];
                    else grouped *= array[k];
                }

                // 2. 괄호 계산된 결과를 포함해 전체 계산
                int result = 0;
                for (int k = 0; k < array.length; ) {
                    if (k == i) {
                        if (result <= 1 || grouped <= 1) result += grouped;
                        else result *= grouped;
                        k = j + 1;
                    } else {
                        if (result <= 1 || array[k] <= 1) result += array[k];
                        else result *= array[k];
                        k++;
                    }
                }

                max = Math.max(max, result);
            }
        }

        return max;
    }
}


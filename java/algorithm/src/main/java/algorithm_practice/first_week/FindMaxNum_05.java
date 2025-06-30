package algorithm_practice.first_week;

//💡 문제 3: 모든 숫자가 양수인지 확인하기
//정수 배열이 주어졌을 때, 모든 원소가 양수인지 판별하여 결과를 boolean으로 반환하는 메서드 areAllPositive를 완성하세요.

public class FindMaxNum_05 {

    public static void main(String[] args) {
        // 예시
        System.out.println("정답 = true / 현재 풀이 값 = " + areAllPositive(new int[]{1, 2, 3}));
        System.out.println("정답 = false / 현재 풀이 값 = " + areAllPositive(new int[]{-1, 2, 3}));
        System.out.println("정답 = false / 현재 풀이 값 = " + areAllPositive(new int[]{0}));
    }

    public static boolean areAllPositive(int[] array) {

        // 1. boolean 초기값 설정
        boolean isAllpositive = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                isAllpositive = false;
            } else if (array[i] == 0) { 
                isAllpositive = false;
            }
        }

        return isAllpositive;
    }
}

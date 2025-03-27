package algorithm_practice.first_week;

// Q. 다음과 같이 0 혹은 양의 정수로만 이루어진 배열이 있을 때,
// 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자 사이에 '✕' 혹은 '+' 연산자를 넣어 결과적으로 가장 큰 수를 구하는 프로그램을 작성하시오.
//
// 단, '+' 보다 '✕' 를 먼저 계산하는 일반적인 방식과는 달리, 모든 연산은 왼쪽에서 순서대로 이루어진다.

public class FindMaxPlusOrMultiply_01 {
    public static void main(String[] args) {
        System.out.println("정답 = 728 / 현재 풀이 값 = " + findMaxPlusOrMultiply(new int[]{0, 3, 5, 6, 1, 2, 4}));
        System.out.println("정답 = 8820 / 현재 풀이 값 = " + findMaxPlusOrMultiply(new int[]{3, 2, 1, 5, 9, 7, 4}));
        System.out.println("정답 = 270 / 현재 풀이 값 = " + findMaxPlusOrMultiply(new int[]{1, 1, 1, 3, 3, 2, 5}));
    }

    public static int findMaxPlusOrMultiply(int[] array) {

        int maxNumber = 0;

        for(int i = 0; i < array.length; i++) {

            if (array[i] == 0 || array[i] == 1) {
                maxNumber += array[i];
            } else if (maxNumber == 0) {
                maxNumber += array[i];
            } else {
                maxNumber *= array[i];
            }
        }

        return maxNumber;
    }
}

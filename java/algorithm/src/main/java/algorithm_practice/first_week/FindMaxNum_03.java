package algorithm_practice.first_week;

//💡문제 2: 정렬 없이 최솟값과 최댓값의 차이 구하기 (난이도 : 중상)
//정수 배열이 주어졌을 때, 배열의 최댓값과 최솟값의 차이를 구하여 반환하는 메서드 maxMinDiff를 완성하세요.
//
//단, 배열을 정렬하지 않고 직접 최댓값과 최솟값을 찾아야 합니다

public class FindMaxNum_03 {

    public static void main(String[] args) {
        // 예시
        System.out.println("정답 = 5 / 현재 풀이 값 = " + maxMinDiff(new int[]{3, 5, 6, 1, 2, 4}));
        System.out.println("정답 = 0 / 현재 풀이 값 = " + maxMinDiff(new int[]{7, 7, 7, 7}));
        System.out.println("정답 = 1886 / 현재 풀이 값 = " + maxMinDiff(new int[]{6, 2, 1888}));
    }

    public static int maxMinDiff(int[] array) {

        // 1. 최댓값과 최솟값의 차이를 저장한 변수 선언
        int maxMinDiff = 0;

        // 2. 최댓값, 최솟값 저장할 변수 선언
        int maxNumber = array[0];
        int minNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }

        maxMinDiff = maxNumber - minNumber;

        return maxMinDiff;
    }
}

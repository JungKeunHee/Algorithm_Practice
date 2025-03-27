package algorithm_practice.first_week;

//💡 문제 1: 두 번째로 큰 수 찾기 (난이도 : 중)
//정수 배열이 주어졌을 때, 두 번째로 큰 수를 반환하는 메서드 findSecondMaxNum을 완성하세요.
//배열의 길이는 최소 2 이상이며, 중복된 값이 있을 수 있습니다.

public class FindMaxNum_02 {

    public static void main(String[] args) {
        // 예시
        System.out.println("정답 = 5 / 현재 풀이 값 = " + findSecondMaxNum(new int[]{3, 5, 6, 1, 2, 4}));
        System.out.println("정답 = 5 / 현재 풀이 값 = " + findSecondMaxNum(new int[]{5, 5, 6}));
        System.out.println("정답 = 9 / 현재 풀이 값 = " + findSecondMaxNum(new int[]{10, 9, 9}));

    }

    public static int findSecondMaxNum(int[] array) {

        // 1. 가장 큰 값을 저장할 변수 선언
        int maxNumber = array[0];

        // 2. 두 번째 큰 값을 저장한 변수 선언
        int secondMaxNumber = 0;

        // 3. 가장 큰 값을 제외한 나머지 값을 저장할 배열 선언
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (maxNumber != array[i]) {
                newArray[i] = array[i];
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > secondMaxNumber) {
                secondMaxNumber = newArray[i];
            }
        }

        return secondMaxNumber;
    }
}

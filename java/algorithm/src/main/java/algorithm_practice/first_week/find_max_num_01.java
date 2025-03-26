package algorithm_practice.first_week;

// 문제 설명:
// 정수 배열이 주어졌을 때, 가장 큰 수를 찾아 반환하는 메서드 findMaxNum을 완성하세요.

public class find_max_num_01 {

    public static void main(String[] args) {
        System.out.println("정답 = 6 / 현재 풀이 값 = " + findMaxNum(new int[]{3, 5, 6, 1, 2, 4}));
        System.out.println("정답 = 6 / 현재 풀이 값 = " + findMaxNum(new int[]{6, 6, 6}));
        System.out.println("정답 = 1888 / 현재 풀이 값 = " + findMaxNum(new int[]{6, 9, 2, 7, 1888}));
    }

    public static int findMaxNum(int[] array) {

        // 1. 첫 번째 인덱스가 최댓값으로 초기화
        int max_number = array[0];

        // 2. 반복문 실행
        for (int i = 0; i < array.length; i++) {

            // 3. 만약 현재 인덱스 데이터 값이 max_number 보다 크다면 max_number 값을 array[i] 값으로 넣어준다.
            if (array[i] > max_number) {
                max_number = array[i];
            }
        }

        return max_number;
    }
}

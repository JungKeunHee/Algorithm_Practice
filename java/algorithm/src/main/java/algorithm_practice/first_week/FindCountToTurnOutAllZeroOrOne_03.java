    package algorithm_practice.first_week;

    public class FindCountToTurnOutAllZeroOrOne_03 {

        // 문제 설명:
        // 0과 1로 이루어진 문자열이 주어졌을 때,
        // 연속된 숫자를 뒤집어 모든 숫자를 같은 숫자로 만드는 최소 횟수를 구하세요.
        // 뒤집기는 0 → 1, 1 → 0 로 변경됩니다.

        public static void main(String[] args) {
            String input = "011110";
            int result = findCountToTurnOutAllZeroOrAllOne(input);
            System.out.println(result);  // 출력: 1
        }

        public static int findCountToTurnOutAllZeroOrAllOne(String str) {
            int countZero = 0; // 모두 0으로 만들기 위해 필요한 뒤집기 횟수
            int countOne = 0;  // 모두 1로 만들기 위해 필요한 뒤집기 횟수

            char prev = str.charAt(0);

            // 처음 시작하는 그룹 체크
            if (prev == '0') countOne++;
            else countZero++;

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != prev) {
                    // 그룹이 바뀐 시점
                    if (str.charAt(i) == '0') {
                        countOne++;
                    } else {
                        countZero++;
                    }
                    prev = str.charAt(i); // 기준 문자 갱신
                }
            }

            return Math.min(countZero, countOne);
        }
    }

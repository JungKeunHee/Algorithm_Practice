package algorithm_practice.first_week;

public class FindNotRepeatingFirstCharacter_02 {
//💡 문제: 반복되지 않는 첫 번째 "대소문자 구분 없이" 문자 찾기 + 원래 케이스 유지하기
//🧩 조건:
//    문자열이 주어졌을 때, 반복되지 않는 첫 번째 문자를 반환하세요.
//
//    단, 대소문자는 구분하지 않지만,
//    반환할 때는 **입력된 원래 문자열에서의 케이스(대소문자)**를 그대로 반환하세요.
//
//    모든 문자가 반복된다면 '_'를 반환하세요.

    public static void main(String[] args) {
        System.out.println("정답 = _ / 현재 풀이 값 = " + findFirstUniqueChar("aAbBcCdD"));     // 모두 중복 → '_'
        System.out.println("정답 = N / 현재 풀이 값 = " + findFirstUniqueChar("aabBCcDdN"));   // N만 단독
        System.out.println("정답 = d / 현재 풀이 값 = " + findFirstUniqueChar("aAbBcCdef"));   // d가 첫 단독 → 'd'
        System.out.println("정답 = a / 현재 풀이 값 = " + findFirstUniqueChar("KkaBb"));       // K는 대문자 그대로 출력
    }

    public static char findFirstUniqueChar(String input) {

        int[] alphabet = new int[52];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                alphabet[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a']++;
            }
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z' && alphabet[ch - 'A'] == 1) {
                return ch;
            } else if (ch >= 'a' && ch <= 'z' && alphabet[ch - 'a'] == 1) {
                return ch;
            }
        }

        return '_';
    }
}

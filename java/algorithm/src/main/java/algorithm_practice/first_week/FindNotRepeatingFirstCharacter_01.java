package algorithm_practice.first_week;

public class FindNotRepeatingFirstCharacter_01 {
    // 문제 설명:
    // 문자열이 주어졌을 때, 반복되지 않는 첫 번째 문자를 반환하세요.
    // 모든 문자가 반복된다면 '_'를 반환하세요.

    public static void main(String[] args) {
        System.out.println("정답 = d / 현재 풀이 값 = " + findNotRepeatingFirstCharacter("abadabac"));
        System.out.println("정답 = c / 현재 풀이 값 = " + findNotRepeatingFirstCharacter("aabbcddd"));
        System.out.println("정답 = _ / 현재 풀이 값 = " + findNotRepeatingFirstCharacter("aaaaaaaa"));
    }

    public static char findNotRepeatingFirstCharacter(String input) {

        int[] alphabet = new int[26];
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a']++;
            }
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z' && alphabet[ch - 'a'] == 1) {
                return ch;
            }
        }
        return '_';
    }
}

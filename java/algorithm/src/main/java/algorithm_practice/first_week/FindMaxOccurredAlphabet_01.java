package algorithm_practice.first_week;

//Q.  다음과 같은 문자열을 입력받았을 때, 어떤 알파벳이 가장 많이 포함되어 있는지 반환하시오.
// (단 최빈값을 가진 알파벳이 여러개일 경우 알파벳 순서가 가장 앞에 위치한 알파벳을 출력하시오)

public class FindMaxOccurredAlphabet_01 {
    public static void main(String[] args) {
        System.out.println("정답 = i / 현재 풀이 값 = " + findMaxOccurredAlphabet("hello my name is dingcodingco"));
        System.out.println("정답 = e / 현재 풀이 값 = " + findMaxOccurredAlphabet("we love algorithm"));
        System.out.println("정답 = b / 현재 풀이 값 = " + findMaxOccurredAlphabet("best of best youtube"));
    }

    public static char findMaxOccurredAlphabet(String input) {
        int[] alphabet = new int[26]; // 알파벳 빈도 수 저장
        input = input.toLowerCase(); // 모두 소문자로 처리 (필수)

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a']++; // 해당 알파벳 위치 +1
            }
        }

        int maxCount = 0;
        char maxChar = 'a';

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > maxCount) { 
                maxCount = alphabet[i];
                maxChar = (char) (i + 'a');
            }
        }

        return maxChar;
    }
}

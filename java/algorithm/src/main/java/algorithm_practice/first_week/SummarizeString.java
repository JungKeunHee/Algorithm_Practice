package algorithm_practice.first_week;

public class SummarizeString {

    // 문제 설명:
    // 소문자로 정렬된 문자열이 주어질 때,
    // 연속된 알파벳의 종류와 등장 횟수를 "a1/b3/..." 형식으로 요약하여 출력하세요.

    public static void main(String[] args) {
        String input = "acccdeee";
        String result = summarizeString(input);
        System.out.println(result);  // 출력: a1/c3/d1/e3
    }

    public static String summarizeString(String input) {
        StringBuilder result = new StringBuilder();
        char ch = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            } else {
                // 이전 문자 + 개수 추가
                result.append(ch).append(count).append("/");
                ch = input.charAt(i); // 문자 갱신
                count = 1; // 카운트 초기화
            }
        }

        // 마지막 문자 처리
        result.append(ch).append(count);

        return result.toString();
    }
}

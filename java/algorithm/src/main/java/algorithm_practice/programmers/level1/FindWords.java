package algorithm_practice.programmers.level1;

import java.util.*;

public class FindWords {

    public static void main(String[] args) {
        String s = "banana";  // 테스트용 입력
        int[] result = solution(s);
        System.out.println(Arrays.toString(result));  // 예상 출력: [-1, -1, -1, 2, 2, 2]
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!lastIndexMap.containsKey(ch)) {
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndexMap.get(ch);
            }

            lastIndexMap.put(ch, i);  // 현재 문자의 인덱스를 갱신
        }

        return answer;
    }
}

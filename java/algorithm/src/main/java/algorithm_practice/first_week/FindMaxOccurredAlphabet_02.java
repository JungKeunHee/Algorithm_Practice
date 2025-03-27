package algorithm_practice.first_week;

//💡 문제: 가장 많이 등장한 "단어" 찾기 (띄어쓰기 기준)
//✅ 난이도: 중상 (Lv.3~3.5)
//🧩 조건:
//문자열이 주어졌을 때, 공백을 기준으로 단어를 나누고,
//가장 자주 등장한 단어를 반환하세요.
//
//만약 최빈값을 가진 단어가 여러 개라면,
//사전 순서(알파벳 기준)로 가장 앞선 단어를 반환하세요.

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurredAlphabet_02 {
    public static void main(String[] args) {
        System.out.println("정답 = hello / 현재 풀이 값 = " + findMostFrequentWord("hello hi hello world hi hello"));
        System.out.println("정답 = best / 현재 풀이 값 = " + findMostFrequentWord("best best youtube youtube"));
        System.out.println("정답 = a / 현재 풀이 값 = " + findMostFrequentWord("a b c d e f a b c d e a"));
    }

    public static String findMostFrequentWord(String input) {
        String[] words = input.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int maxCount = 0;
        String result = "";

        for (String key : map.keySet()) {
            int count = map.get(key);

            if (count > maxCount) {
                maxCount = count;
                result = key;
            } else if (count == maxCount) {
                // 사전순 비교 (더 앞선 단어로 교체)
                if (key.compareTo(result) < 0) {
                    result = key;
                }
            }
        }

        return result;
    }
}
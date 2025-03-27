package algorithm_practice.first_week;

//💡 문제: 가장 많이 등장한 "길이 3 이상의 단어" 찾기
//🧩 조건: 공백 기준으로 단어를 나누고, 길이가 3 이상인 단어 중
// 가장 자주 등장한 단어를 반환하되,
// 최빈값이 여러 개면 사전순으로 가장 앞선 단어를 반환하세요.

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurredAlphabet_03 {
    public static void main(String[] args) {
        System.out.println("정답 = hello / 현재 풀이 값 = " + findTopWordWithLength("hi my name is hello hello hello hi"));
        System.out.println("정답 = banana / 현재 풀이 값 = " + findTopWordWithLength("banana apple apple banana"));
        System.out.println("정답 = fast / 현재 풀이 값 = " + findTopWordWithLength("go fast go go fast fast"));
    }

    public static String findTopWordWithLength(String input) {

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
            } else if (maxCount >= 3 && maxCount == count) {
                if (key.compareTo(result) < 0) {
                    result = key;
                }
            }
        }

        return result;
    }
}

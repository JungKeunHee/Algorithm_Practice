package algorithm_practice.fifth_week;

//Q. 데이터 처리 전문가가 되고 싶은 어피치는 문자열을 압축하는 방법에 대해 공부를 하고 있습니다.
//
//최근에 대량의 데이터 처리를 위한 간단한 비손실 압축 방법에 대해 공부를 하고 있는데,
//문자열에서 같은 값이 연속해서 나타나는 것을 그 문자의 개수와 반복되는 값으로 표현하여 더 짧은 문자열로 줄여서 표현하는 알고리즘을 공부하고 있습니다.
//
//간단한 예로 aabbaccc의 경우 2a2ba3c(문자가 반복되지 않아 한번만 나타난 경우 1은 생략함)와 같이 표현할 수 있는데,
//이러한 방식은 반복되는 문자가 적은 경우 압축률이 낮다는 단점이 있습니다. 예를 들면, abcabcdede와 같은 문자열은 전혀 압축되지 않습니다.
//
//어피치는 이러한 단점을 해결하기 위해 문자열을 1개 이상의 단위로 잘라서 압축하여 더 짧은 문자열로 표현할 수 있는지 방법을 찾아보려고 합니다.
//
//예를 들어, ababcdcdababcdcd의 경우 문자를 1개 단위로 자르면 전혀 압축되지 않지만, 2개 단위로 잘라서 압축한다면 2ab2cd2ab2cd로 표현할 수 있습니다.
//다른 방법으로 8개 단위로 잘라서 압축한다면 2ababcdcd로 표현할 수 있으며, 이때가 가장 짧게 압축하여 표현할 수 있는 방법입니다.
//
//다른 예로, abcabcdede와 같은 경우, 문자를 2개 단위로 잘라서 압축하면 abcabc2de가 되지만, 3개 단위로 자른다면 2abcdede가 되어 3개 단위가 가장 짧은 압축 방법이 됩니다.
//이때 3개 단위로 자르고 마지막에 남는 문자열은 그대로 붙여주면 됩니다.
//
//압축할 문자열 input이 매개변수로 주어질 때, 위에 설명한 방법으로 1개 이상 단위로
//문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이를 return 하도록 string_compression 함수를 완성해주세요.
//
//* 문자열의 길이는 1 이상 1,000 이하입니다.
//* 문자열은 알파벳 소문자로만 이루어져 있습니다.
//
//이 때, 문자열은 항상 제일 앞부터 정해진 길이만큼 잘라야 합니다.
//입출력 예 #5 처럼 xababcdcdababcdcd 이 입력되어도,
//문자열을 x / ababcdcd / ababcdcd 로 자르는 것은 불가능합니다.
//이 경우 어떻게 문자열을 잘라도 압축되지 않으므로 가장 짧은 길이는 17이 됩니다.


public class KaKao_02 {
    public static void main(String[] args) {

        String input = "abcabcabcabcdededededede"; // 14

        System.out.println("정답 = 14 / 현재 풀이 값 = " + stringCompression(input));
        System.out.println("정답 = 3 / 현재 풀이 값 = " + stringCompression("JAAA"));
        System.out.println("정답 = 9 / 현재 풀이 값 = " + stringCompression("AZAAAZDWAAA"));
        System.out.println("정답 = 12 / 현재 풀이 값 = " + stringCompression("BBAABAAADABBBD"));
    }

    public static int stringCompression(String str) {
        int min = str.length();

        for (int unit = 1; unit <= str.length() / 2; unit++) {
            StringBuilder compressed = new StringBuilder();
            String prev = str.substring(0, unit);
            int count = 1;

            for (int i = unit; i < str.length(); i+=unit) {
                String next;
                if (i + unit <= str.length()) {
                    next = str.substring(i, i + unit);
                } else {
                    next = str.substring(i);
                }

                if ((prev.equals(next))) {
                    count++;
                } else {
                    if (count > 1) {
                        compressed.append(count).append(prev);
                    } else {
                        compressed.append(prev);
                    }
                    prev = next;
                    count = 1;
                }
            }
            if (count > 1) {
                compressed.append(count).append(prev);
            } else {
                compressed.append(prev);
            }

            min = Math.min(min, compressed.length());
        }
        return min;
    }
}

# 난이도 상
# ✅ 문제: 가장 긴 부분 문자열 - K개 이하의 문자만 다른 경우
# 📜 문제 설명
# 문자열 S가 주어지고, 정수 K가 주어집니다.
# 문자열에서 한 문자를 다른 문자로 바꾸는 작업을 최대 `K번까지 할 수 있을 때,
# 같은 문자가 연속으로 나오는 가장 긴 부분 문자열의 길이를 구하세요.
from collections import defaultdict


def find_max_same_char_after_replacements(s, k):
    count = defaultdict(int)
    left = 0
    max_freq = 0
    max_len = 0

    for right in range(len(s)):
        count[s[right]] += 1
        max_freq = max(max_freq, count[s[right]])

        # 현재 윈도우에서 바꿔야 하는 문자가 k 초과면 왼쪽 줄임
        while (right - left + 1) - max_freq > k:
            count[s[left]] -= 1
            left += 1

        # 조건 만족하는 최대 길이 저장
        max_len = max(max_len, right - left + 1)

    return max_len




print(find_max_same_char_after_replacements("aaabbbccc", 2))  # 출력: 5 ('aaabb', 'bbbcc', 'ccccc' 등)
print(find_max_same_char_after_replacements("abcde", 3))      # 출력: 4
print(find_max_same_char_after_replacements("aaaaa", 1))      # 출력: 5 (이미 모두 같음)




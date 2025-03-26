# 난이도 중
# ✅ 문제: 가장 긴 동일 문자 연속 구간 찾기 (문자열 버전)
# 📜 문제 설명
# 문자열이 주어졌을 때,
# 동일한 문자가 연속으로 가장 길게 등장하는 구간의 시작 인덱스와 길이를 구하세요.

def find_longest_char_sequence(string):
    max_length = 0
    max_start_index = 0
    i = 0

    while i < len(string):
        current_char = string[i]
        current_start_index = i
        current_length = 1

        while i + 1 < len(string) and string[i + 1] == current_char:
            i += 1
            current_length += 1

        # 이 if는 안쪽이 아니라 여기 있어야 해요 (중요 포인트!)
        if current_length > max_length:
            max_length = current_length
            max_start_index = current_start_index

        i += 1  # 다음 문자로 이동

    return (max_start_index, max_length)

print(find_longest_char_sequence("aaabbbccddddddee"))
# 출력: (8, 6) → 'd'가 인덱스 8~13까지 6번 반복

print(find_longest_char_sequence("aabbaaacc"))
# 출력: (4, 3) → 'a'가 인덱스 4~6까지 3번 반복

print(find_longest_char_sequence("xyz"))
# 출력: (0, 1) → 모두 1개씩, 맨 앞 'x' 우선



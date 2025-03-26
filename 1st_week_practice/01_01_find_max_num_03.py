# ✅ 문제: 가장 많이 등장한 숫자 구간의 시작과 길이 구하기
# 📜 문제 설명
# 정수로 이루어진 리스트가 주어질 때,
# 가장 많이 등장한 숫자가 연속으로 나타나는 구간 중 가장 긴 구간의 시작 인덱스와 길이를 구하세요.

def find_most_frequent_longest_sequence(array):
    max_length = 0
    max_start_index = 0
    i = 0

    while i < len(array):
        current_number = array[i] # 현재 숫자
        current_start_index = i   # 현재 숫자 인덱스
        current_length = 1        # 현재 숫자 연속된 길이

        # 다음 숫자랑 계속 비교해서 연속된 구간 길이 세기
        while i + 1 < len(array) and array[i + 1] == current_number:
            i += 1
            current_length += 1

        # 지금까지 저장된 최장 구간보다 길면 갱신
        if current_length > max_length:
            max_length = current_length
            max_start_index = current_start_index

        # 같은 길이라도 먼저 나온 숫자가 우선 (기존 값 유지)

        i += 1  # 다음 숫자로 넘어가기

    return (max_start_index, max_length)


print(find_most_frequent_longest_sequence([1, 1, 2, 2, 2, 3, 3, 2, 2]))
# 출력: (2, 3) → 숫자 2가 3번 연속으로 나온 구간 (인덱스 2~4)

print(find_most_frequent_longest_sequence([4, 4, 4, 3, 3, 3, 4, 4]))
# 출력: (0, 3) → 숫자 4와 3 둘 다 3개지만 4가 먼저 나옴

print(find_most_frequent_longest_sequence([5, 6, 6, 6, 5, 5, 5, 5]))
# 출력: (4, 4) → 숫자 5가 4번 연속 (인덱스 4~7)


# 난이도 중하
# 정수로 이루어진 리스트가 주어졌을 때,
# 리스트에서 가장 큰 수가 연속으로 가장 길게 등장하는 구간의
# 시작 인덱스를 반환하세요.

def find_max_sequence_index(array):
    max_number = max(array)  # 리스트에서 최댓값 구하기

    max_len = 0              # 최댓값 연속 길이
    max_start_index = 0      # 최댓값 연속 시작 인덱스

    i = 0
    while i < len(array):
        if array[i] == max_number:
            start = i
            length = 0
            while i < len(array) and array[i] == max_number:
                length += 1
                i += 1
            if length > max_len:
                max_len = length
                max_start_index = start
        else:
            i += 1

    return max_start_index


print(find_max_sequence_index([1, 3, 3, 2, 4, 4, 4, 1]))  # 출력: 4
print(find_max_sequence_index([5, 5, 1, 5, 5, 5]))        # 출력: 3
print(find_max_sequence_index([7, 7, 7, 1, 2]))           # 출력: 0

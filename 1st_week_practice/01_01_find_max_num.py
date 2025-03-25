def find_max_num(array):

    # 1. 처음에 배열의 첫 번째 인덱스 값을 최댓값 이라고 저장하기
    max_number = array[0]

    # 2. 다음 인덱스 값과 비교 후 만약 처음에 설정해둔 max_number 값보다 크다면 해당 값을 저장
    for i in range(1, len(array)):
        if max_number > array[i]:
            continue
        elif max_number < array[i]:
            max_number = array[i]
    return max_number


print("정답 = 6 / 현재 풀이 값 = ", find_max_num([3, 5, 6, 1, 2, 4]))
print("정답 = 6 / 현재 풀이 값 = ", find_max_num([6, 6, 6]))
print("정답 = 1888 / 현재 풀이 값 = ", find_max_num([6, 9, 2, 7, 1888]))
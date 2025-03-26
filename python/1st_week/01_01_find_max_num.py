def find_max_num(array):

    # 두 번째 풀이 방법
    # 1. 처음에 배열의 인덱스 0번째 자리의 값을 max_number 라는 변수에 저장해둔다.
    # 2. 인자로 받은 배열에 대해 for 문을 실행하여 max_number 와 비교 후 max_number 보다 크다면 해당 변수에 값을 대체한다.
    max_number = array[0]

    for num in array:
        if num > max_number:
            max_number = num
    return max_number

    # 첫 번째 풀이 방법 (이중 for 문으로 하나씩 비교해보기)
    # for number in array:
    #     is_max_num = True
    #     for compare_number in array:
    #         if number < compare_number:
    #             is_max_num = False
    #     if is_max_num:
    #         return number



print("정답 = 6 / 현재 풀이 값 = ", find_max_num([3, 5, 6, 1, 2, 4]))
print("정답 = 6 / 현재 풀이 값 = ", find_max_num([6, 6, 6]))
print("정답 = 1888 / 현재 풀이 값 = ", find_max_num([6, 9, 2, 7, 1888]))
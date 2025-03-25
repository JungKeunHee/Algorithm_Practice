def find_max_plus_or_multiply(array):

    # 1. 먼저 최댓값을 저장할 변수를 선언 해준다.
    max_number = 0

    for i in array:
        if i == 0 or i == 1:    # 2. 만약 i 의 값이 0 또는 1 이라면 + 덧셈을 연산해주고
            max_number += i
        elif max_number == 0 or max_number == 1: # 3. 0 또는 1 이상 이지만 max_number 값이 0 또는 1이라면 다시 덧셈을 연산해주고
            max_number += i
        elif max_number > 1: # 4. 이제 max_number 값이 1 초과 라면 무조건 * 곱셈 연산을 하기
            max_number *= i

    return max_number


result = find_max_plus_or_multiply
print("정답 = 728 현재 풀이 값 =", result([0,3,5,6,1,2,4]))
print("정답 = 8820 현재 풀이 값 =", result([3,2,1,5,9,7,4]))
print("정답 = 270 현재 풀이 값 =", result([1,1,1,3,3,2,5]))
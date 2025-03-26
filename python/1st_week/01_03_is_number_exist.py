# 빅오 -> 최아그이 경우
# 빅오메가 -> 최선의 경우

def is_number_exist(number, array):

    for element in array:       # array 의 길이 만큼 아래 연산이 실행됨
        if number == element:   # 비교 연산 1번 실행
            return True         # 시간 복잡도는 N 만큼 걸린다.
    return False


result = is_number_exist
print("정답 = True 현재 풀이 값 =", result(3, [3,5,6,1,2,4]))
print("정답 = Flase 현재 풀이 값 =", result(7, [6,6,6]))
print("정답 = True 현재 풀이 값 =", result(2, [6,9,2,7,1888]))
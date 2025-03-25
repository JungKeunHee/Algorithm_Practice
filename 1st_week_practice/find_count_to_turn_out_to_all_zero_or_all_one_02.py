import string

input = "011110"


def find_count_to_turn_out_to_all_zero_or_all_one(string):
    # 1. 0 과 1로 변환될 때 저장될 카운트 변수 선언 해주기
    count_0 = 0
    count_1 = 0

    # 2. 인자로 받은 string 값의 [0] 인덱스 값이 뭔지 확인한 다음 초기 카운트 값을 1로 저장해준다.
    prop = string[0]
    if prop == '0':
        count_0 += 1
    else:
        count_1 += 1

    # 3. 전달 받은 string 값을 1부터 시작하여 해당 string 값의 범위 만큼 반복문을 실행한다.
    for i in range(1, len(string)):
        if string[i] != prop:   # 4. 만약 해당 인덱스의 값이 prop 와 값이 일치하지 않는다면 각각의 카운터에 + 1을 더해준다
            if string[i] == '0':
                count_0 += 1
            else :
                count_1 += 1

            prop = string[i] # 5. 해당 prop 를 해당 인덱스의 값으로 넣어준다.

    return min(count_0, count_1) # 6. 저장된 값을 min 함수로 비교 후 최솟값을 반환한다.





result = find_count_to_turn_out_to_all_zero_or_all_one(input)
print(result)
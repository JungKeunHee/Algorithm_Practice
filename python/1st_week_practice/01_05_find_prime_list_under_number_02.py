input = 20

# 20이 입력된다면, 아래와 같이 반환해야 합니다!
# [2, 3, 5, 7, 11, 13, 17, 19]

def find_prime_list_under_number(number):

    # 1. 소수를 저장할 기본 배열을 만들어준다.
    prime_list = []

    # 2. 인자로 전달 받은 값에 대해 반복문을 실행하여 소수인지 판단한다.
    for i in range(2, number + 1):
        is_prime = True # 3. 소수인지 판별하는 is_prime 값을 True로 설정해준다.
        for j in range(2, int(i ** 0.5) + 1): # 4. i 의 값을 거듭제곱 범위만큼 반복  문을 실행하여
            if i % j == 0:      # 5. 만약 i의 값이 j의 값으로 나눴을 때 나머지 값이 0 이라면
                is_prime = False # 6. is_prime 값을 False 로 바꿔주고 break 를 설정한다.
                break

        if is_prime:  # 7. 하지만 만약 True 값이라면
            prime_list.append(i)  # 8. prime_list 배열에 추가해준 뒤 return 해준다.

    return prime_list


result = find_prime_list_under_number(input)
print(result)
input = 20

# 20이 입력된다면, 아래와 같이 반환해야 합니다!
# [2, 3, 5, 7, 11, 13, 17, 19]

def find_prime_list_under_number(number):
    prime_list = []

    for i in range(2, number + 1):

        print(i)

        is_prime = True
        for j in range(2, int(i ** 0.5) + 1):
            if i % j == 0:
                is_prime = False
                break
        if is_prime:
            prime_list.append(i)

    return prime_list



result = find_prime_list_under_number(input)
print(result)
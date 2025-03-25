input = "011110"


def find_count_to_turn_out_to_all_zero_or_all_one(string):
    count_0 = 0  # 0으로 바꾸는 횟수
    count_1 = 0  # 1으로 바꾸는 횟수

    prev = string[0]  # 첫 문자 기준
    if prev == '0':
        count_0 += 1
    else:
        count_1 += 1

    for i in range(1, len(string)):
        if string[i] != prev:
            # 그룹이 바뀌는 지점
            if string[i] == '0':
                count_0 += 1
            else:
                count_1 += 1
            prev = string[i]  # 기준 문자 바꾸기

    return min(count_0, count_1)



result = find_count_to_turn_out_to_all_zero_or_all_one(input)
print(result)
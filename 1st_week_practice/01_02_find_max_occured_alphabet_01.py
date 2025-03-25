def find_max_occurred_alphabet(string):

    # 1. 먼저 알파벳 26개 배열을 만든다.
    alphabet_count = [0] * 26

    for char in string:
        if char.isalpha():      # 2. 만약 전달 받은 값이 문자라면
            index = ord(char.lower()) - ord('a')    # 3. 해당 문자를 소문자로 바꾸고 ord 를 통해 ASCII 코드로 변환 하여 - ord('a') 뺄샘하여
            alphabet_count[index] += 1  # 4. 해당 결과값의 인덱스 자리에 카운트 +1 을 해준다.

        # 5. 최댓값을 찾는 로직
        max_index = 0
        for i in range(1, 26):
            if alphabet_count[i] > alphabet_count[max_index]:
                max_index = i

    # 최댓값을 찾아서 해당 인덱스 값을 다시 알파벳으로 변환
    return chr(ord('a') + max_index)

result = find_max_occurred_alphabet
print("정답 = i 현재 풀이 값 =", result("hello my name is dingcodingco"))
print("정답 = e 현재 풀이 값 =", result("we love algorithm"))
print("정답 = b 현재 풀이 값 =", result("best of best youtube"))
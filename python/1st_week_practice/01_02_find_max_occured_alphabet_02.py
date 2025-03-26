def find_max_occurred_alphabet(string):

    # 1. 먼저 알파벳 26개의 배열을 만든다.
    alphabet = [0] * 26

    # 2. 전달 받은 string 값을 for 문을 통해 실행
    for char in string:
        if char.isalpha(): # 3. 만약 string 값이 문자라면
            index = ord(char.lower()) - ord('a')    # 4. index 변수에 소문자로 변환하여 ord 를 통해 ASCII 코드로 변환 후 - ord('a') 연산 후
            alphabet[index] += 1    # 5. 해당하는 인덱스 자리에 count + 1 누적해서 저장해준다.

    # 6. 최댓값 찾는 로직
    max_index = 0
    for i in range(1, 26):
        if alphabet[i] > alphabet[max_index]: # 7. 만약 해당 인덱스 번호의 값이 기본 max_index 값보다 크다면
            max_index = i # 8. max_index 의 값을 해당 인덱스 번호의 값으로 대체 해준다.

    return chr(max_index + ord('a')) # 9. 마지막으로 ord('a') 의 값으로 더한 뒤 chr 로 알파벳으로 변환하여 리턴 해준다.

result = find_max_occurred_alphabet
print("정답 = i 현재 풀이 값 =", result("hello my name is dingcodingco"))
print("정답 = e 현재 풀이 값 =", result("we love algorithm"))
print("정답 = b 현재 풀이 값 =", result("best of best youtube"))
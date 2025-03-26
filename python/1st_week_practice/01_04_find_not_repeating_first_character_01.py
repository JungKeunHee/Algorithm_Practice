input = "abadabac"

def find_not_repeating_first_character(string):

    # 1. 먼저 알파벳 배열을 초기화 해준다.
    alphabet = [0] * 26

    min_index_alphabet = ""

    for i in string:
        if i.isalpha(): # 2. 만약 string 값이 문자라면
            index = ord(i.lower()) - ord('a') # 3. 해당 문자를 소문자로 변환 후 ord 를 통해 ASCII 코드로 변환 하여 - ord('a') 연산한다.
            alphabet[index] += 1 # 4. 해당하는 인덱스 자리에 카운트를 해준다.

    # 5. alphabet 의 길이 만큼 반복해서 한 번만 나온 알파벳을 찾는다.
    for j in range(len(alphabet)):
        if alphabet[j] == 1:
            min_index_alphabet = chr(ord('a') + j) # 6. 찾은 값을 ord('a') 로 연산해서 min_index_alphabet 에 저장한다.

    # 7. 저장된 값을 인자로 전달 받은 string 에서 먼저 추출된 알파벳을 바로 반환한다.
    for g in string:
        if g in min_index_alphabet:
            return g

    return "_"


result = find_not_repeating_first_character
print("정답 = d 현재 풀이 값 =", result("abadabac"))
print("정답 = c 현재 풀이 값 =", result("aabbcddd"))
print("정답 =_ 현재 풀이 값 =", result("aaaaaaaa"))
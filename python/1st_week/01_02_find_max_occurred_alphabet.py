def find_max_occurred_alphabet(string):

    alphabet_array = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
    max_occurrence = 0
    max_alphabet = alphabet_array[0]

    for alphabet in alphabet_array:
        occurence = 0

        for char in string:
            if char == alphabet:
                occurence +=1
        if occurence > max_occurrence:
            max_alphabet = alphabet
            max_occurrence = occurence

    return max_alphabet

def find_alphabet_occurrence_array(string):
    alphabet_occurrence_array = [0] * 26

    for char in string:
        if not char.isalpha():      # 얘가 알파벳인지 검사하고
            continue
        arr_index = ord(char) - ord('a') # 해당 문자를 인덱스로 치환합니다. a -> 0, b ->> 1
        alphabet_occurrence_array[arr_index] += 1 # 빈도수 배열에 인덱스로 찾아가서 해당 값을 추가해준다.

    max_occurrence = 0
    max_alphabet_index = 0

    for index in range(len(alphabet_occurrence_array)): # 0, 1...25
        alphabet_occurence = alphabet_occurrence_array[index]

        if alphabet_occurence > max_occurrence:
            max_occurrence = alphabet_occurence
            max_alphabet_index = index
    print("max_alphabet_index", max_alphabet_index)

    return chr(max_alphabet_index + ord('a'))



print("정답 = [1, 0, 2, 2, 2, 0, 2, 1, 3, 0, 0, 2, 2, 3, 3, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0] \n현재 풀이 값 =",
      find_alphabet_occurrence_array("hello my name is dingcodingco"))
print("정답 = [1, 0, 0, 0, 2, 0, 1, 1, 1, 0, 0, 2, 1, 0, 2, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0] \n현재 풀이 값 =",
      find_alphabet_occurrence_array("we love algorithm"))
print("정답 = [0, 3, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 3, 2, 0, 0, 0, 1, 0] \n현재 풀이 값 =",
      find_alphabet_occurrence_array("best of best youtube"))

result = find_max_occurred_alphabet
print("정답 = i 현재 풀이 값 =", result("hello my name is dingcodingco"))
print("정답 = e 현재 풀이 값 =", result("we love algorithm"))
print("정답 = b 현재 풀이 값 =", result("best of best youtube"))
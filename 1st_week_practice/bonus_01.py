def summarize_string(input_str):
    count_alphabet = ""

    alphabet_array = [0] * 26  # a ~ z

    for char in input_str:
        if char.isalpha():
            index = ord(char.lower()) - ord("a")  # 소문자 기준
            alphabet_array[index] += 1

    for i in range(26):  # 인덱스 기반으로 a~z 체크
        if alphabet_array[i] != 0:
            count_alphabet += chr(i + ord("a")) + str(alphabet_array[i]) + "/"

    return count_alphabet.rstrip("/")  # 마지막 슬래시 제거

input_str = "acccdeee"

print(summarize_string(input_str))
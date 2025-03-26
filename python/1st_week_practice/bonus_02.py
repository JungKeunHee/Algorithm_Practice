def summarize_string(input_str):
    # 1. 알파벳과 카운트를 저장할 변수를 선언해준다.
    count_alphabet = ""

    # 2. 기본 알파벳 배열을 선언해준다.
    alphabet_array = [0] * 26

    # 3. 입력받은 string 값을 반복문을 통해 카운트를 해서 알파벳 배열에 저장한다.
    for char in input_str:
        if char.isalpha():
            index = ord(char) - ord('a')
            alphabet_array[index] += 1

    # 4. 알파벳 갯수만큼 순환한다.
    for i in range(26):
        if alphabet_array[i] != 0:
            count_alphabet += chr(i + ord("a")) + str(alphabet_array[i]) + "/"

    return count_alphabet.rstrip("/")


input_str = "acccdeee"

print(summarize_string(input_str))
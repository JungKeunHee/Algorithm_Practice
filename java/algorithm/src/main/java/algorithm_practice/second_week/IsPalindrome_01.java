package algorithm_practice.second_week;

public class IsPalindrome_01 {
    public static void main(String[] args) {
        String a = "abcba";
        palindrome(a);
    }

    public static void palindrome(String a) {
        int maxLen = a.length() - 1;
        int minLen = 0;

        boolean isTrue = true;

        while (minLen < maxLen) {
            if (a.charAt(minLen) != a.charAt(maxLen)){
                isTrue = false;
                break;
            }
            minLen++;
            maxLen--;
        }

        System.out.println("isTrue = " + isTrue);
    }
}

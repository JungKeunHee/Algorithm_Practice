package algorithm_practice.fifth_week;

public class KaKao_03 {
    public static void main(String[] args) {
        String balancedParentheses = "()))((()";

        System.out.println("정답 = ()(())() / 현재 풀이 값 = " + getCorrectParentheses(balancedParentheses));
        System.out.println("정답 = (((()))) / 현재 풀이 값 = " + getCorrectParentheses(")()()()("));
        System.out.println("정답 = ()()( / 현재 풀이 값 = " + getCorrectParentheses("))()("));
        System.out.println("정답 = ((((()())))) / 현재 풀이 값 = " + getCorrectParentheses(")()()()(())("));
    }

    public static String getCorrectParentheses(String p) {
        if (p.isEmpty()) return "";

        // 1. u, v 분리
        int idx = splitIndex(p);
        String u = p.substring(0, idx);
        String v = p.substring(idx);

        if (isCorrect(u)) {
            return u + getCorrectParentheses(v);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(getCorrectParentheses(v));
            sb.append(")");
            sb.append(reverse(u.substring(1, u.length() - 1)));
            return sb.toString();
        }
    }

    private static int splitIndex(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') count++;
            else count--;
            if (count == 0) return i + 1;
        }
        return s.length();
    }

    private static boolean isCorrect(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else count--;
            if (count < 0) return false;
        }
        return count == 0;
    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c == '(' ? ')' : '(');
        }
        return sb.toString();
    }
}

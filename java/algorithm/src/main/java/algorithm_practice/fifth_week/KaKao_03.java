package algorithm_practice.fifth_week;

public class KaKao_03 {
    public static void main(String[] args) {
        String balancedParentheses = "()))((()";

        System.out.println("정답 = (((()))) / 현재 풀이 값 = " + getCorrectParentheses(")()()()("));
        System.out.println("정답 = ()()( / 현재 풀이 값 = " + getCorrectParentheses("))()("));
        System.out.println("정답 = ((((()())))) / 현재 풀이 값 = " + getCorrectParentheses(")()()()(())("));
    }

    public static String getCorrectParentheses(String str) {

        return "";
    }
}

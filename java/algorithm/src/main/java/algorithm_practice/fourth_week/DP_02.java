package algorithm_practice.fourth_week;

public class DP_02 {
    static long[] memo = new long[101];  // 0~100까지 미리 저장

    public static void main(String[] args) {
        int a = 100;
        System.out.println("피보나치 수열 값 : " + fibo(a));
    }

    public static long fibo(int a) {
        if (a == 1 || a == 2) return 1;
        if (memo[a] != 0) return memo[a];  // 이미 구했으면 리턴
        return memo[a] = fibo(a - 1) + fibo(a - 2);  // 구한 값 저장
    }
}

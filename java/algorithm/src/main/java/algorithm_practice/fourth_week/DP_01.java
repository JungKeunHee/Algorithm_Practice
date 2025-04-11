package algorithm_practice.fourth_week;

public class DP_01 {

    // fibo(n) = fibo(n - 1) + fibo(n -2)

    public static void main(String[] args) {
        int a = 20;

        System.out.println("피보나치 수열 값 : " + fibo(a));
    }

    public static int fibo(int a) {

        if (a == 1 || a == 2) {
            return 1;
        }

        return fibo(a - 1) + fibo(a - 2);
    }
}

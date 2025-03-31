package algorithm_practice.second_week;

public class FactorialRecursive_01 {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("result = " + result);  // 120
    }

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}

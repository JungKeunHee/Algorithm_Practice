package algorithm_practice.second_week;

public class CountDownRecursive_01 {

    public static void main(String[] args) {
        countDown(60);
    }

    public static void countDown(int number) {

        if (number == 0) {
            return;
        }

        System.out.println("count = " + number);
        countDown(number - 1);
    }
}

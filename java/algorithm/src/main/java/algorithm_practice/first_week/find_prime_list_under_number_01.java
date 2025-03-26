    package algorithm_practice.first_week;

    import java.util.ArrayList;
    import java.util.List;

    public class find_prime_list_under_number_01 {
        // 문제 설명:
        // 정수 number가 주어졌을 때, 2부터 number 이하의 모든 소수를 리스트로 반환하는 메서드를 완성하세요.

        public static void main(String[] args) {
            int input = 20;
            List<Integer> result = findPrimeListUnderNumber(input);
            System.out.println(result); // [2, 3, 5, 7, 11, 13, 17, 19]
        }

        public static List<Integer> findPrimeListUnderNumber(int number) {
            List<Integer> array = new ArrayList<>();

            for (int i = 2; i <= number; i++) {
                if (isPrime(i)) {
                    array.add(i);
                }
            }

            return array;
        }

        public static boolean isPrime(int num) {
            if (num < 2) return false;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }

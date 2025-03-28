package algorithm_practice.second_week;

import java.util.*;

public class JosephusProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("원형을 만들 사람의 수를 입력해주세요 : ");
        int n = sc.nextInt(); // 총 사람 수

        // 현재 배열
        List<Integer> currentArray = new ArrayList<>();

        // 제거된 배열
        List<Integer> deleteArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            currentArray.add(i + 1);
        }

        while (currentArray.size() != 0) {
            System.out.print("제거할 인덱스 번호를 입력해주세요 : ");
            int k = sc.nextInt(); // 제거할 값
            for (int i = 0; i < currentArray.size(); i++) {
                if (currentArray.get(i) == k) {
                    currentArray.remove(i);
                    deleteArray.add(k);
                }
            }
            System.out.println("현재 남은 배열 값 : " + currentArray);
            System.out.println("제거된 배열 값 : " + deleteArray);
        }

    }
}

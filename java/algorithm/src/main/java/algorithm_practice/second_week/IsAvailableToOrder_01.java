package algorithm_practice.second_week;

import java.util.Arrays;

public class IsAvailableToOrder_01 {
    public static void main(String[] args) {
        String[] menus = {"떡볶이", "만두", "오뎅", "사이다", "콜라"};
        String[] orders = {"오뎅", "콜라", "만두"};

        boolean isTrue = true;

        int trueCount = 0;

        for (int i = 0; i < orders.length; i++) {
            for (int j = 0; j < menus.length; j++) {
                if (orders[i].equals(menus[j])) {
                    trueCount++;
                }
            }
        }

        if (trueCount == orders.length) {
            System.out.println("isTrue = " + isTrue);
        } else {
            isTrue = false;
            System.out.println("isTrue = " + isTrue);
        }
    }
}

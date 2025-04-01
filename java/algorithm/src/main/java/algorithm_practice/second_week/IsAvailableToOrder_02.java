package algorithm_practice.second_week;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsAvailableToOrder_02 {
    public static void main(String[] args) {
        String[] menus = {"떡볶이", "만두", "오뎅", "사이다", "콜라"};
        String[] orders = {"오뎅", "콜라", "만두"};

        boolean isTrue = true;

        Set<String> menusArray = new HashSet<>(Arrays.asList(menus));

        for (String order : orders) {
            if (!menusArray.contains(order)) {
                isTrue = false;
                break;
            }
        }

        System.out.println("isTrue = " + isTrue);
    }
}

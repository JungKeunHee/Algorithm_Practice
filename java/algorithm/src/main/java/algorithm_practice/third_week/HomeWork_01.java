package algorithm_practice.third_week;

//Q.
//다음과 같이 숫자로 이루어진 배열이 두 개가 있다.
//하나는 상품의 가격을 담은 배열이고, 하나는 쿠폰을 담은 배열이다.
//쿠폰의 할인율에 따라 상품의 가격을 할인 받을 수 있다.
// 이 때, 최대한 할인을 많이 받는다면 얼마를 내야 하는가?
// 단, 할인쿠폰은 한 제품에 한 번씩만 적용 가능하다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class HomeWork_01 {
    public static void main(String[] args) {

        int[] shopPrice = {30000, 2000, 1500000};
        int[] userCoupons = {20, 40}; // % 로 생각 해야함

        System.out.println("정답 = 926000 / 현재 풀이 값 = " + getMaxDiscountedPrice(shopPrice, userCoupons));
        System.out.println("정답 = 485000 / 현재 풀이 값 = " + getMaxDiscountedPrice(new int[]{50000, 1500000}, new int[]{10, 70, 30, 20}));
        System.out.println("정답 = 1550000 / 현재 풀이 값 = " + getMaxDiscountedPrice(new int[]{50000, 1500000}, new int[]{}));
        System.out.println("정답 = 1458000 / 현재 풀이 값 = " + getMaxDiscountedPrice(new int[]{20000, 100000, 1500000}, new int[]{10, 10, 10}));
    }

    public static int getMaxDiscountedPrice(int[] shopPrice, int[] userCoupons) {
        // Step 1. 가격, 쿠폰 내림차순 정렬
        Arrays.sort(shopPrice);
        Arrays.sort(userCoupons);

        int total = 0;
        int shopIdx = shopPrice.length - 1;
        int couponIdx = userCoupons.length - 1;

        while (shopIdx >= 0) {
            int price = shopPrice[shopIdx];

            if (couponIdx >= 0) {
                int discountPercent = userCoupons[couponIdx];
                double discountedPrice = price * (1 - discountPercent / 100.0);
                total += (int) discountedPrice;
                couponIdx--;
            } else {
                total += price; // 쿠폰 없으면 원가
            }

            shopIdx--;
        }

        return total;
    }
}


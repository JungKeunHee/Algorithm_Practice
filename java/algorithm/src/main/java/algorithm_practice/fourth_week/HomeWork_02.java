package algorithm_practice.fourth_week;

//Q. 라면 공장에서는 하루에 밀가루를 1톤씩 사용합니다. 원래 밀가루를 공급받던 공장의 고장으로 앞으로 k일 이후에야 밀가루를 공급받을 수 있기 때문에 해외 공장에서 밀가루를 수입해야 합니다.
//
//해외 공장에서는 향후 밀가루를 공급할 수 있는 날짜와 수량을 알려주었고, 라면 공장에서는 운송비를 줄이기 위해 최소한의 횟수로 밀가루를 공급받고 싶습니다.
//
//현재 공장에 남아있는 밀가루 수량 stock, 밀가루 공급 일정(dates)과 해당 시점에 공급 가능한 밀가루 수량(supplies),
// 원래 공장으로부터 공급받을 수 있는 시점 k가 주어질 때, 밀가루가 떨어지지 않고 공장을 운영하기 위해서 최소한 몇 번 해외 공장으로부터 밀가루를 공급받아야 하는지를 반환 하시오.
//
//dates[i]에는 i번째 공급 가능일이 들어있으며, supplies[i]에는 dates[i] 날짜에 공급 가능한 밀가루 수량이 들어 있습니다.

import java.util.Collections;
import java.util.PriorityQueue;

public class HomeWork_02 {
    public static void main(String[] args) {
        System.out.println("정답 = 2 / 현재 풀이 값 = " +
                getMinimumSupplyCount(4, new int[]{4, 10, 15}, new int[]{20, 5, 10}, 30));

        System.out.println("정답 = 4 / 현재 풀이 값 = " +
                getMinimumSupplyCount(4, new int[]{4, 10, 15, 20}, new int[]{20, 5, 10, 5}, 40));

        System.out.println("정답 = 1 / 현재 풀이 값 = " +
                getMinimumSupplyCount(2, new int[]{1, 10}, new int[]{10, 100}, 11));
    }

    public static int getMinimumSupplyCount(int stock, int[] dates, int[] supplies, int k) {
        int count = 0; // 공급 횟수
        int index = 0; // dates, supplies 순회용 인덱스

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int day = 0; day < k; day++) {
            // 공급 가능한 날이면 힙에 넣기
            while (index < dates.length && dates[index] == day) {
                maxHeap.offer(supplies[index]);
                index++;
            }

            // 재고가 0 되기 전, 하루 소모
            if (stock == 0) {
                if (!maxHeap.isEmpty()) {
                    stock += maxHeap.poll(); // 가장 큰 공급량 선택
                    count++;
                }
            }

            stock--; // 하루 지남
        }

        return count;
    }
}

package algorithm_practice.fourth_week;

import java.util.ArrayList;

public class MaxHeap_01 {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        heap.insert(3);
        heap.insert(4);
        heap.insert(2);
        heap.insert(9);

        System.out.println(heap.getHeap());  // [null, 9, 4, 2, 3]
    }
}

class MaxHeap {
    private ArrayList<Integer> items;

    public MaxHeap() {
        items = new ArrayList<>();
        items.add(null); // 0번 인덱스는 사용하지 않음 (1번부터 시작)
    }

    public void insert(int value) {
        items.add(value);
        int currentIndex = items.size() - 1;

        while (currentIndex > 1) {
            int parentIndex = currentIndex / 2;

            if (items.get(currentIndex) > items.get(parentIndex)) {
                // swap
                int temp = items.get(currentIndex);
                items.set(currentIndex, items.get(parentIndex));
                items.set(parentIndex, temp);

                currentIndex = parentIndex; // 위로 올라감
            } else {
                break; // 부모가 더 크면 끝
            }
        }
    }


    public ArrayList<Integer> getHeap() {
        return items;
    }
}

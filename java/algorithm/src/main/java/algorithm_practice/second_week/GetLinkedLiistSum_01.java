package algorithm_practice.second_week;

public class GetLinkedLiistSum_01 {
    // Node 클래스 정의
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList 클래스 정의
    static class LinkedList {
        Node head;

        public LinkedList(int value) {
            this.head = new Node(value);
        }

        public void append(int value) {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(value);
        }
    }

    // 두 연결 리스트의 합을 계산하는 메서드
    public static int getLinkedListSum(LinkedList list1, LinkedList list2) {
        
        StringBuilder firstNumber = new StringBuilder();
        StringBuilder secondNumber = new StringBuilder();

        Node cur1 = list1.head;
        Node cur2 = list2.head;

            while (cur1 != null && cur2 != null) {
                firstNumber.append(cur1.data);
                secondNumber.append(cur2.data);
                cur1 = cur1.next;
                cur2 = cur2.next;
            }


        int result = Integer.parseInt(firstNumber.toString()) + Integer.parseInt(secondNumber.toString());

        return result;
    }

    // 메인 실행 테스트
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList(6);
        linkedList1.append(7);
        linkedList1.append(8);

        LinkedList linkedList2 = new LinkedList(3);
        linkedList2.append(5);
        linkedList2.append(4);

        int result = getLinkedListSum(linkedList1, linkedList2);
        System.out.println("두 연결 리스트의 합: " + result);  // 예시: 1032
    }
}

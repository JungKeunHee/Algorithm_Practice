package algorithm_practice.second_week;

public class LinkedList_01 {
    public static void main(String[] args) {
        // 테스트
        LinkedList list = new LinkedList(6);
        list.append(7);
        list.append(8);
        list.printAll();

        Node kthNode = list.getKthNodeFromLast(2);
        System.out.println("뒤에서 2번째 노드 값: " + kthNode.data);  // 7이 나와야 함
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList 클래스
    static class LinkedList {
        Node head;

        LinkedList(int value) {
            this.head = new Node(value);
        }

        void append(int value) {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(value);
        }

        void printAll() {
            Node cur = head;
            while (cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
            System.out.println();
        }

        // 뒤에서 K번째 노드 반환하는 메서드 (주인님이 구현할 부분)
        Node getKthNodeFromLast(int k) {
            // 1. 전체 길이 구하기
            int length = 0;
            Node cur = head;
            while (cur != null) {
                length++;
                cur = cur.next;
            }

            // 2. (length - k)번째 노드를 찾아감
            int targetIndex = length - k;
            cur = head;
            for (int i = 0; i < targetIndex; i++) {
                cur = cur.next;
            }

            return cur;
        }
    }
}

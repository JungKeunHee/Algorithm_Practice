package algorithm_practice.second_week;

public class AppendLinkedList_01 {

    // 내부 Node 클래스
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

        // 생성자
        public LinkedList(int value) {
            this.head = new Node(value);
        }

        // append(): 노드 끝에 추가
        public void append(int value) {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(value);
        }

        // printAll: 노드를 출력만! 추가는 절대 하지 않기
        public void printAll() {
            Node cur = head;

            while (cur != null) {
                System.out.println("cur = " + cur.data);
                cur = cur.next;
            }
        }
    }

    // 실행 테스트
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(12);
        linkedList.append(8);
        linkedList.printAll();  // 출력: 5 12
    }
}

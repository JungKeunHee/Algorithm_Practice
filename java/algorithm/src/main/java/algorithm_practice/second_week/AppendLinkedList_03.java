    package algorithm_practice.second_week;

public class AppendLinkedList_03 {

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

        public int getNode(int index) {

            Node cur = head;
            int currentIndex = 0;

            while (currentIndex != index) {
                cur = cur.next;
                currentIndex++;
            }
            return cur.data;
        }

        public void addNode(int index, int value) {
            Node newNode = new Node(value);

            if (index == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }

            Node prev = head;
            int count = 0;

            while (prev != null && count < index - 1) {
                prev = prev.next;
                count++;
            }

            if (prev == null) {
                throw new IndexOutOfBoundsException("Index out of range");
            }

            Node next = prev.next;
            prev.next = newNode;
            newNode.next = next;
        }

        public void deleteNode(int index) {
            // index가 0이면 head 갱신
            if (index == 0) {
                head = head.next;
                return;
            }

            Node prev = head;
            int count = 0;

            // index - 1 위치까지 이동
            while (prev != null && count < index - 1) {
                prev = prev.next;
                count++;
            }

            if (prev == null || prev.next == null) {
                throw new IndexOutOfBoundsException("Index out of range");
            }

            // 삭제 대상 노드 생략해서 연결
            prev.next = prev.next.next;
        }

    }

    // 실행 테스트
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(12);
        linkedList.append(8);
        linkedList.printAll();  // 출력: 5 12
        System.out.println("0번째 노드 값: " + linkedList.getNode(0));  // 출력: 5
        System.out.println("2번째 노드 값: " + linkedList.getNode(2));  // 출력: 8
        linkedList.addNode(2, 3);
        linkedList.addNode(2, 4);
        linkedList.printAll();
        linkedList.deleteNode(1);
        linkedList.printAll();
    }
}

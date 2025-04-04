package algorithm_practice.third_week;

public class Stack_01 {

    // Node 클래스 (내부 클래스)
    static class Node {
        int data;
        Node next; // 연결리스트처럼 다음 노드를 가리킴

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack 클래스
    static class Stack {
        private Node head; // 스택의 top 역할

        public Stack() {
            this.head = null;
        }

        // push 기능 구현
        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

        // pop 기능 구현
        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("스택이 비어 있습니다!");
            }
            int value = head.data;
            head = head.next;
            return value;
        }

        // peek 기능 구현
        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("스택이 비어 있습니다!");
            }
            return head.data;
        }

        // isEmpty 기능 구현
        public boolean isEmpty() {
            return head == null;
        }
    }

    // 간단한 테스트 main
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); // 30
        System.out.println(stack.pop());  // 30
        System.out.println(stack.pop());  // 20
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.pop());  // 10
        System.out.println(stack.isEmpty()); // true
    }
}

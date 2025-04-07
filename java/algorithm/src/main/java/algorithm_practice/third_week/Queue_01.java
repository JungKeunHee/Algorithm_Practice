package algorithm_practice.third_week;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue {
    private Node head = null;
    private Node tail = null;

    // 값 추가 (enqueue)
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;

        if (head == null) {
            head = newNode;
        }
    }

    // 값 제거 (dequeue)
    public Integer dequeue() {
        if (isEmpty()) return null;

        int value = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return value;
    }

    // 맨 앞 값 확인 (peek)
    public Integer peek() {
        if (isEmpty()) return null;
        return head.data;
    }

    // 비었는지 확인
    public boolean isEmpty() {
        return head == null;
    }
}

public class Queue_01 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.peek());     // 10
        System.out.println(queue.dequeue());  // 10
        System.out.println(queue.dequeue());  // 20
        System.out.println(queue.isEmpty());  // false
        System.out.println(queue.dequeue());  // 30
        System.out.println(queue.isEmpty());  // true
    }
}

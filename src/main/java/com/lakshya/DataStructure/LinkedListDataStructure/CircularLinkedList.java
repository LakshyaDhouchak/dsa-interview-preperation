package com.lakshya.DataStructure.LinkedListDataStructure;

public class CircularLinkedList<T> {

    // Node class
    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Enum for insert choice
    static enum choice {
        BEFORE, AFTER
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    // CREATE: Insert at end
    public void create(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head; // circular link
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    // toString (safe loop)
    @Override
    public String toString() {
        if (head == null) return "[]";

        StringBuilder sb = new StringBuilder("[");
        Node<T> temp = head;

        do {
            sb.append(temp.data);
            temp = temp.next;
            if (temp != head) sb.append(", ");
        } while (temp != head);

        sb.append("]");
        return sb.toString();
    }

    // INSERT: Before or After a given element
    public void insert(T find, T element, choice ch) {
        if (head == null)
            throw new IllegalStateException("List is empty");

        Node<T> newNode = new Node<>(element);
        Node<T> temp = head;
        Node<T> prev = tail; // prev of head = tail

        do {
            if (temp.data.equals(find)) {

                // BEFORE
                if (ch == choice.BEFORE) {

                    // Case: inserting before head
                    if (temp == head) {
                        newNode.next = head;
                        tail.next = newNode;
                        head = newNode;
                    } else {
                        newNode.next = temp;
                        prev.next = newNode;
                    }
                }

                // AFTER
                else {
                    newNode.next = temp.next;
                    temp.next = newNode;

                    // if inserting after tail
                    if (temp == tail) {
                        tail = newNode;
                    }
                }

                size++;
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        throw new IllegalStateException("Element not found in list: " + find);
    }

    // DELETE
    public void delete(T element) {
        if (head == null)
            throw new IllegalStateException("List is empty");

        Node<T> temp = head;
        Node<T> prev = tail;

        do {
            if (temp.data.equals(element)) {

                // Case 1: deleting the only element
                if (head == tail) {
                    head = tail = null;
                }

                // Case 2: deleting head
                else if (temp == head) {
                    head = head.next;
                    tail.next = head;
                }

                // Case 3: deleting tail
                else if (temp == tail) {
                    prev.next = head;
                    tail = prev;
                }

                // Case 4: deleting middle node
                else {
                    prev.next = temp.next;
                }

                size--;
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        throw new IllegalStateException("Element not found: " + element);
    }
}

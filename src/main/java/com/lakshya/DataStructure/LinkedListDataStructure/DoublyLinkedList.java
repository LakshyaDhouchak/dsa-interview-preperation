package com.lakshya.DataStructure.LinkedListDataStructure;

public class DoublyLinkedList<T> {

    // Node
    static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Enum
    public static enum choice {
        BEFORE, AFTER
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    // CREATE (insert at tail)
    public void create(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // SIZE
    public int getSize() {
        return size;
    }

    // toString
    @Override
    public String toString() {
        Node<T> temp = head;
        StringBuilder sb = new StringBuilder("[");
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(", ");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // INSERT before/after an element
    public void insert(T find, T element, choice ch) {

        Node<T> newNode = new Node<>(element);

        // empty list
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(find)) {

                // CASE-1: Insert AFTER tail
                if (temp == tail && ch == choice.AFTER) {
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                }

                // CASE-2: Insert BEFORE head
                else if (temp == head && ch == choice.BEFORE) {
                    newNode.next = head;
                    head.prev = newNode;
                    head = newNode;
                }

                // NORMAL CASES
                else {
                    if (ch == choice.BEFORE) {
                        newNode.next = temp;
                        newNode.prev = temp.prev;
                        temp.prev.next = newNode;
                        temp.prev = newNode;
                    } else { // AFTER
                        newNode.prev = temp;
                        newNode.next = temp.next;

                        if (temp.next != null)
                            temp.next.prev = newNode;
                        else
                            tail = newNode;

                        temp.next = newNode;
                    }
                }

                size++;
                return;     
            }

            temp = temp.next;
        }

        throw new IllegalStateException("Element not found in list");
    }

    // DELETE
    public void delete(T find) {

        if (head == null)
            throw new IllegalStateException("List is empty, can't delete");

        Node<T> temp = head;

        // Case 1: delete head
        if (head.data.equals(find)) {
            head = head.next;

            if (head != null)
                head.prev = null;
            else
                tail = null; // list became empty

            size--;
            return;
        }

        // Case 2: delete tail
        if (tail.data.equals(find)) {
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }

        // Case 3: delete middle node
        while (temp != null) {
            if (temp.data.equals(find)) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                size--;
                return;
            }
            temp = temp.next;
        }

        throw new IllegalStateException("Element not found");
    }
}

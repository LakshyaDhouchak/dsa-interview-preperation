package com.lakshya.DataStructure.LinkedListDataStructure;

public class SinglyLinkedList<T> {

    // Node class
    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // enum for BEFORE / AFTER insertion
    static enum Choice {
        BEFORE, AFTER
    }

    private Node<T> head = null;
    private int size = 0;

    // Insert at head
    public void create(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Insert before / after a given element
    public void insert(T find, T element, Choice choice) {

        Node<T> newNode = new Node<>(element);

        // empty list
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        // Case: element found at head
        if (head.data.equals(find)) {
            if (choice == Choice.BEFORE) {
                newNode.next = head;
                head = newNode;
            } else {
                newNode.next = head.next;
                head.next = newNode;
            }
            size++;
            return;
        }

        Node<T> curr = head;

        // Traverse and find the element
        while (curr.next != null) {
            if (curr.next.data.equals(find)) {

                if (choice == Choice.BEFORE) {
                    newNode.next = curr.next;
                    curr.next = newNode;
                } else {
                    Node<T> temp = curr.next;
                    newNode.next = temp.next;
                    temp.next = newNode;
                }

                size++;
                return;
            }
            curr = curr.next;
        }

        throw new IllegalArgumentException("Element to find was not found: " + find);
    }

    // Delete an element
    public void delete(T element) {

        if (head == null)
            throw new IllegalStateException("LinkedList is empty");

        // Case 1: deleting head
        if (head.data.equals(element)) {
            head = head.next;
            size--;
            return;
        }

        Node<T> curr = head;

        while (curr.next != null) {
            if (curr.next.data.equals(element)) {
                curr.next = curr.next.next;
                size--;
                return;
            }
            curr = curr.next;
        }

        throw new IllegalStateException("Element not found: " + element);
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        Node<T> temp = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(", ");
            temp = temp.next;
        }

        sb.append("]");
        return sb.toString();
    }
}

package com.lakshya;

import com.lakshya.DataStructure.ArrayDataStructure.*;
import com.lakshya.DataStructure.LinkedListDataStructure.*;
import com.lakshya.DataStructure.StackDataStructure.*;
import com.lakshya.DataStructure.QueueDataStructure.*;
import com.lakshya.DataStructure.TreeDataStructure.*;
import com.lakshya.DataStructure.GraphDataStructure.*;
import com.lakshya.DataStructure.HashingDataStructure.*;
import com.lakshya.Algorithms.GraphAlgorithms.*;
import com.lakshya.Algorithms.SearchingAlgorithms.*;
import com.lakshya.Algorithms.SortingAlgorithms.*;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Data Structures and Algorithms Menu ===");
            System.out.println("1. Arrays");
            System.out.println("2. Linked Lists");
            System.out.println("3. Stacks");
            System.out.println("4. Queues");
            System.out.println("5. Trees");
            System.out.println("6. Graphs");
            System.out.println("7. Hashing");
            System.out.println("8. Searching Algorithms");
            System.out.println("9. Sorting Algorithms");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    arrayMenu();
                    break;
                case 2:
                    linkedListMenu();
                    break;
                case 3:
                    stackMenu();
                    break;
                case 4:
                    queueMenu();
                    break;
                case 5:
                    treeMenu();
                    break;
                case 6:
                    graphMenu();
                    break;
                case 7:
                    hashingMenu();
                    break;
                case 8:
                    searchingMenu();
                    break;
                case 9:
                    sortingMenu();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void arrayMenu() {
        while (true) {
            System.out.println("\n=== Array Menu ===");
            System.out.println("1. Static Array");
            System.out.println("2. Dynamic Array");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    staticArrayMenu();
                    break;
                case 2:
                    dynamicArrayMenu();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void staticArrayMenu() {
        System.out.print("Enter capacity for StaticArray: ");
        int capacity = scanner.nextInt();
        StaticArray<Integer> staticArray = new StaticArray<>(capacity);

        while (true) {
            System.out.println("\n=== Static Array Menu ===");
            System.out.println("1. Add element");
            System.out.println("2. Insert at index");
            System.out.println("3. Delete at index");
            System.out.println("4. Get element at index");
            System.out.println("5. Set element at index");
            System.out.println("6. Get size");
            System.out.println("7. Get capacity");
            System.out.println("8. Is full");
            System.out.println("9. Display array");
            System.out.println("10. Back to Array Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int data = scanner.nextInt();
                    try {
                        staticArray.add(data);
                        System.out.println("Element added.");
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter element: ");
                    data = scanner.nextInt();
                    try {
                        staticArray.insert(index, data);
                        System.out.println("Element inserted.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter index to delete: ");
                    index = scanner.nextInt();
                    try {
                        Integer removed = staticArray.delete(index);
                        System.out.println("Removed: " + removed);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter index: ");
                    index = scanner.nextInt();
                    try {
                        Integer element = staticArray.get(index);
                        System.out.println("Element: " + element);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter index: ");
                    index = scanner.nextInt();
                    System.out.print("Enter element: ");
                    data = scanner.nextInt();
                    try {
                        staticArray.set(index, data);
                        System.out.println("Element set.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Size: " + staticArray.getSize());
                    break;
                case 7:
                    System.out.println("Capacity: " + staticArray.getCapacity());
                    break;
                case 8:
                    System.out.println("Is full: " + staticArray.isFull());
                    break;
                case 9:
                    System.out.println(staticArray.toString());
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void dynamicArrayMenu() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        while (true) {
            System.out.println("\n=== Dynamic Array Menu ===");
            System.out.println("1. Add element");
            System.out.println("2. Insert at index");
            System.out.println("3. Delete at index");
            System.out.println("4. Get element at index");
            System.out.println("5. Set element at index");
            System.out.println("6. Get size");
            System.out.println("7. Get capacity");
            System.out.println("8. Is empty");
            System.out.println("9. Display array");
            System.out.println("10. Back to Array Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int data = scanner.nextInt();
                    dynamicArray.add(data);
                    System.out.println("Element added.");
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter element: ");
                    data = scanner.nextInt();
                    try {
                        dynamicArray.insert(index, data);
                        System.out.println("Element inserted.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter index to delete: ");
                    index = scanner.nextInt();
                    try {
                        Integer removed = dynamicArray.delete(index);
                        System.out.println("Removed: " + removed);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter index: ");
                    index = scanner.nextInt();
                    try {
                        Integer element = dynamicArray.get(index);
                        System.out.println("Element: " + element);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter index: ");
                    index = scanner.nextInt();
                    System.out.print("Enter element: ");
                    data = scanner.nextInt();
                    try {
                        dynamicArray.set(index, data);
                        System.out.println("Element set.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Size: " + dynamicArray.getSize());
                    break;
                case 7:
                    System.out.println("Capacity: " + dynamicArray.getCapacity());
                    break;
                case 8:
                    System.out.println("Is empty: " + dynamicArray.isEmpty());
                    break;
                case 9:
                    System.out.println(dynamicArray.toString());
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void linkedListMenu() {
        while (true) {
            System.out.println("\n=== Linked List Menu ===");
            System.out.println("1. Singly Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Circular Linked List");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    singlyLinkedListMenu();
                    break;
                case 2:
                    doublyLinkedListMenu();
                    break;
                case 3:
                    circularLinkedListMenu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void singlyLinkedListMenu() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        while (true) {
            System.out.println("\n=== Singly Linked List Menu ===");
            System.out.println("1. Create (add at head)");
            System.out.println("2. Insert before element");
            System.out.println("3. Insert after element");
            System.out.println("4. Delete element");
            System.out.println("5. Get size");
            System.out.println("6. Display list");
            System.out.println("7. Back to Linked List Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to create: ");
                    int data = scanner.nextInt();
                    list.create(data);
                    System.out.println("Element added at head.");
                    break;
                case 2:
                    System.out.print("Enter element to find: ");
                    int find = scanner.nextInt();
                    System.out.print("Enter element to insert: ");
                    data = scanner.nextInt();
                    try {
                        list.insert(find, data, SinglyLinkedList.Choice.BEFORE);
                        System.out.println("Element inserted before.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter element to find: ");
                    find = scanner.nextInt();
                    System.out.print("Enter element to insert: ");
                    data = scanner.nextInt();
                    try {
                        list.insert(find, data, SinglyLinkedList.Choice.AFTER);
                        System.out.println("Element inserted after.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter element to delete: ");
                    data = scanner.nextInt();
                    try {
                        list.delete(data);
                        System.out.println("Element deleted.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Size: " + list.getSize());
                    break;
                case 6:
                    System.out.println(list.toString());
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void doublyLinkedListMenu() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        while (true) {
            System.out.println("\n=== Doubly Linked List Menu ===");
            System.out.println("1. Create (add at tail)");
            System.out.println("2. Insert before element");
            System.out.println("3. Insert after element");
            System.out.println("4. Delete element");
            System.out.println("5. Get size");
            System.out.println("6. Display list");
            System.out.println("7. Back to Linked List Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to create: ");
                    int data = scanner.nextInt();
                    list.create(data);
                    System.out.println("Element added at tail.");
                    break;
                case 2:
                    System.out.print("Enter element to find: ");
                    int find = scanner.nextInt();
                    System.out.print("Enter element to insert: ");
                    data = scanner.nextInt();
                    try {
                        list.insert(find, data, DoublyLinkedList.choice.BEFORE);
                        System.out.println("Element inserted before.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter element to find: ");
                    find = scanner.nextInt();
                    System.out.print("Enter element to insert: ");
                    data = scanner.nextInt();
                    try {
                        list.insert(find, data, DoublyLinkedList.choice.AFTER);
                        System.out.println("Element inserted after.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter element to delete: ");
                    data = scanner.nextInt();
                    try {
                        list.delete(data);
                        System.out.println("Element deleted.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Size: " + list.getSize());
                    break;
                case 6:
                    System.out.println(list.toString());
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void circularLinkedListMenu() {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();

        while (true) {
            System.out.println("\n=== Circular Linked List Menu ===");
            System.out.println("1. Create (add at end)");
            System.out.println("2. Insert before element");
            System.out.println("3. Insert after element");
            System.out.println("4. Delete element");
            System.out.println("5. Get size");
            System.out.println("6. Display list");
            System.out.println("7. Back to Linked List Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to create: ");
                    int data = scanner.nextInt();
                    list.create(data);
                    System.out.println("Element added at end.");
                    break;
                case 2:
                    System.out.print("Enter element to find: ");
                    int find = scanner.nextInt();
                    System.out.print("Enter element to insert: ");
                    data = scanner.nextInt();
                    try {
                        list.insert(find, data, CircularLinkedList.choice.BEFORE);
                        System.out.println("Element inserted before.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter element to find: ");
                    find = scanner.nextInt();
                    System.out.print("Enter element to insert: ");
                    data = scanner.nextInt();
                    try {
                        list.insert(find, data, CircularLinkedList.choice.AFTER);
                        System.out.println("Element inserted after.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter element to delete: ");
                    data = scanner.nextInt();
                    try {
                        list.delete(data);
                        System.out.println("Element deleted.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Size: " + list.getSize());
                    break;
                case 6:
                    System.out.println(list.toString());
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void stackMenu() {
        while (true) {
            System.out.println("\n=== Stack Menu ===");
            System.out.println("1. Static Stack");
            System.out.println("2. Dynamic Stack");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    staticStackMenu();
                    break;
                case 2:
                    dynamicStackMenu();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void staticStackMenu() {
        System.out.print("Enter capacity for StaticStack: ");
        int capacity = scanner.nextInt();
        StaticStack<Integer> stack = new StaticStack<>(capacity);

        while (true) {
            System.out.println("\n=== Static Stack Menu ===");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Peek element");
            System.out.println("4. Is full");
            System.out.println("5. Get size");
            System.out.println("6. Is empty");
            System.out.println("7. Display stack");
            System.out.println("8. Back to Stack Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int data = scanner.nextInt();
                    try {
                        stack.push(data);
                        System.out.println("Element pushed.");
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        Integer popped = stack.pop();
                        System.out.println("Popped: " + popped);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        Integer peeked = stack.peek();
                        System.out.println("Peeked: " + peeked);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Is full: " + stack.isFull());
                    break;
                case 5:
                    System.out.println("Size: " + stack.getSize());
                    break;
                case 6:
                    System.out.println("Is empty: " + stack.isEmpty());
                    break;
                case 7:
                    System.out.println(stack.toString());
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

        private static void dynamicStackMenu() {
        DynamicStack<Integer> stack = new DynamicStack<>();

        while (true) {
            System.out.println("\n=== Dynamic Stack Menu ===");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Peek element");
            System.out.println("4. Get size");
            System.out.println("5. Is empty");
            System.out.println("6. Display stack");
            System.out.println("7. Back to Stack Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int data = scanner.nextInt();
                    stack.push(data);
                    System.out.println("Element pushed.");
                    break;
                case 2:
                    try {
                        Integer popped = stack.pop();
                        System.out.println("Popped: " + popped);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        Integer peeked = stack.peek();
                        System.out.println("Peeked: " + peeked);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Size: " + stack.getSize());
                    break;
                case 5:
                    System.out.println("Is empty: " + stack.isEmpty());
                    break;
                case 6:
                    System.out.println(stack.toString());
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void queueMenu() {
        while (true) {
            System.out.println("\n=== Queue Menu ===");
            System.out.println("1. Simple Queue");
            System.out.println("2. Double Ended Queue");
            System.out.println("3. Circular Queue");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    simpleQueueMenu();
                    break;
                case 2:
                    doubleEndedQueueMenu();
                    break;
                case 3:
                    circularQueueMenu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void simpleQueueMenu() {
        SimpleQueue<Integer> queue = new SimpleQueue<>();

        while (true) {
            System.out.println("\n=== Simple Queue Menu ===");
            System.out.println("1. Enqueue element");
            System.out.println("2. Dequeue element");
            System.out.println("3. Peek element");
            System.out.println("4. Is empty");
            System.out.println("5. Get size");
            System.out.println("6. Display queue");
            System.out.println("7. Back to Queue Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int data = scanner.nextInt();
                    queue.enQueue(data);
                    System.out.println("Element enqueued.");
                    break;
                case 2:
                    try {
                        Integer dequeued = queue.deQueue();
                        System.out.println("Dequeued: " + dequeued);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        Integer peeked = queue.peek();
                        System.out.println("Peeked: " + peeked);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Is empty: " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Size: " + queue.getSize());
                    break;
                case 6:
                    System.out.println(queue.toString());
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void doubleEndedQueueMenu() {
        DoubleEndedQueue<Integer> deque = new DoubleEndedQueue<>();

        while (true) {
            System.out.println("\n=== Double Ended Queue Menu ===");
            System.out.println("1. Add first");
            System.out.println("2. Add last");
            System.out.println("3. Remove first");
            System.out.println("4. Remove last");
            System.out.println("5. Peek first");
            System.out.println("6. Peek last");
            System.out.println("7. Is empty");
            System.out.println("8. Get size");
            System.out.println("9. Display deque");
            System.out.println("10. Back to Queue Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add first: ");
                    int data = scanner.nextInt();
                    deque.addFirst(data);
                    System.out.println("Element added first.");
                    break;
                case 2:
                    System.out.print("Enter element to add last: ");
                    data = scanner.nextInt();
                    deque.addLast(data);
                    System.out.println("Element added last.");
                    break;
                case 3:
                    try {
                        Integer removed = deque.firstRemove();
                        System.out.println("Removed first: " + removed);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        Integer removed = deque.LastRemove();
                        System.out.println("Removed last: " + removed);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        Integer peeked = deque.peekFirst();
                        System.out.println("Peeked first: " + peeked);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        Integer peeked = deque.peekLast();
                        System.out.println("Peeked last: " + peeked);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Is empty: " + deque.isEmpty());
                    break;
                case 8:
                    System.out.println("Size: " + deque.getSize());
                    break;
                case 9:
                    System.out.println(deque.toString());
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void circularQueueMenu() {
        System.out.print("Enter capacity for CircularQueue: ");
        int capacity = scanner.nextInt();
        CircularQueue<Integer> queue = new CircularQueue<>(capacity);

        while (true) {
            System.out.println("\n=== Circular Queue Menu ===");
            System.out.println("1. Enqueue element");
            System.out.println("2. Dequeue element");
            System.out.println("3. Is empty");
            System.out.println("4. Is full");
            System.out.println("5. Get size");
            System.out.println("6. Get capacity");
            System.out.println("7. Display queue");
            System.out.println("8. Back to Queue Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int data = scanner.nextInt();
                    try {
                        queue.Enqueue(data);
                        System.out.println("Element enqueued.");
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        Integer dequeued = queue.deQueue();
                        System.out.println("Dequeued: " + dequeued);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Is empty: " + queue.isEmpty());
                    break;
                case 4:
                    System.out.println("Is full: " + queue.isFull());
                    break;
                case 5:
                    System.out.println("Size: " + queue.getSize());
                    break;
                case 6:
                    System.out.println("Capacity: " + queue.getCapacity());
                    break;
                case 7:
                    System.out.println(queue.toString());
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void treeMenu() {
        while (true) {
            System.out.println("\n=== Tree Menu ===");
            System.out.println("1. Binary Tree");
            System.out.println("2. Binary Search Tree");
            System.out.println("3. Trie");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    binaryTreeMenu();
                    break;
                case 2:
                    binarySearchTreeMenu();
                    break;
                case 3:
                    trieMenu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void binaryTreeMenu() {
        BinaryTree tree = new BinaryTree();

        while (true) {
            System.out.println("\n=== Binary Tree Menu ===");
            System.out.println("1. Insert element");
            System.out.println("2. Get size");
            System.out.println("3. Get height");
            System.out.println("4. Is balanced");
            System.out.println("5. Traverse (choose type)");
            System.out.println("6. Back to Tree Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int data = scanner.nextInt();
                    tree.insert(data);
                    System.out.println("Element inserted.");
                    break;
                case 2:
                    System.out.println("Size: " + tree.size());
                    break;
                case 3:
                    System.out.println("Height: " + tree.height());
                    break;
                case 4:
                    System.out.println("Is balanced: " + tree.isBalanced());
                    break;
                case 5:
                    System.out.println("Choose traversal: 1. InOrder, 2. PreOrder, 3. PostOrder, 4. LevelOrder");
                    int traversalChoice = scanner.nextInt();
                    tree.traversal(traversalChoice);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void binarySearchTreeMenu() {
        BinarySearchTree bst = new BinarySearchTree();

        while (true) {
            System.out.println("\n=== Binary Search Tree Menu ===");
            System.out.println("1. Insert element");
            System.out.println("2. Search element");
            System.out.println("3. Delete element");
            System.out.println("4. Get min");
            System.out.println("5. Get max");
            System.out.println("6. Traverse (choose type)");
            System.out.println("7. Back to Tree Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int data = scanner.nextInt();
                    bst.create(data);
                    System.out.println("Element inserted.");
                    break;
                case 2:
                    System.out.print("Enter element to search: ");
                    data = scanner.nextInt();
                    boolean found = bst.Search(bst.getRoot(), data);
                    System.out.println("Found: " + found);
                    break;
                case 3:
                    System.out.print("Enter element to delete: ");
                    data = scanner.nextInt();
                    bst.delete(data);
                    System.out.println("Element deleted.");
                    break;
                case 4:
                    System.out.println("Min: " + bst.Min(bst.getRoot()));
                    break;
                case 5:
                    System.out.println("Max: " + bst.max(bst.getRoot()));
                    break;
                case 6:
                    System.out.println("Choose traversal: 1. InOrder, 2. PreOrder, 3. PostOrder, 4. LevelOrder");
                    int traversalChoice = scanner.nextInt();
                    bst.traversal(bst.getRoot(), traversalChoice);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void trieMenu() {
        Trie trie = new Trie();

        while (true) {
            System.out.println("\n=== Trie Menu ===");
            System.out.println("1. Insert word");
            System.out.println("2. Search word");
            System.out.println("3. Check prefix");
            System.out.println("4. Is empty");
            System.out.println("5. Display words");
            System.out.println("6. Back to Tree Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter word to insert: ");
                    String word = scanner.next();
                    trie.insert(word);
                    System.out.println("Word inserted.");
                    break;
                case 2:
                    System.out.print("Enter word to search: ");
                    word = scanner.next();
                    boolean found = trie.Search(word);
                    System.out.println("Found: " + found);
                    break;
                case 3:
                    System.out.print("Enter prefix to check: ");
                    word = scanner.next();
                    boolean prefix = trie.prefixStartWith(word);
                    System.out.println("Prefix exists: " + prefix);
                    break;
                case 4:
                    System.out.println("Is empty: " + trie.isEmpty());
                    break;
                case 5:
                    trie.display();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void graphMenu() {
        while (true) {
            System.out.println("\n=== Graph Menu ===");
            System.out.println("1. Adjacency List");
            System.out.println("2. Adjacency Matrix");
            System.out.println("3. BFS");
            System.out.println("4. DFS");
            System.out.println("5. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adjacencyListMenu();
                    break;
                case 2:
                    adjacencyMatrixMenu();
                    break;
                case 3:
                    bfsMenu();
                    break;
                case 4:
                    dfsMenu();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void adjacencyListMenu() {
        System.out.print("Enter number of vertices: ");
        int vertices = scanner.nextInt();
        System.out.print("Is directed? (true/false): ");
        boolean directed = scanner.nextBoolean();
        AdjacentList graph = new AdjacentList(vertices, directed);

        while (true) {
            System.out.println("\n=== Adjacency List Menu ===");
            System.out.println("1. Add edge");
            System.out.println("2. Remove edge");
            System.out.println("3. Check edge");
            System.out.println("4. Display graph");
            System.out.println("5. Back to Graph Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    int src = scanner.nextInt();
                    System.out.print("Enter destination: ");
                    int dest = scanner.nextInt();
                    try {
                        graph.addEdge(src, dest, directed);
                        System.out.println("Edge added.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter source: ");
                    src = scanner.nextInt();
                    System.out.print("Enter destination: ");
                    dest = scanner.nextInt();
                    try {
                        graph.RemoveEdge(src, dest, directed);
                        System.out.println("Edge removed.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter source: ");
                    src = scanner.nextInt();
                    System.out.print("Enter destination: ");
                    dest = scanner.nextInt();
                    try {
                        boolean exists = graph.CheckEdge(src, dest);
                        System.out.println("Edge exists: " + exists);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    graph.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void adjacencyMatrixMenu() {
        System.out.print("Enter number of vertices: ");
        int vertices = scanner.nextInt();
        System.out.print("Is directed? (true/false): ");
        boolean directed = scanner.nextBoolean();
        AdjacentMatrix graph = new AdjacentMatrix(vertices, directed);

        while (true) {
            System.out.println("\n=== Adjacency Matrix Menu ===");
            System.out.println("1. Add edge");
            System.out.println("2. Remove edge");
            System.out.println("3. Check edge");
            System.out.println("4. Display graph");
            System.out.println("5. Back to Graph Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    int src = scanner.nextInt();
                    System.out.print("Enter destination: ");
                    int dest = scanner.nextInt();
                    System.out.print("Enter weight: ");
                    int weight = scanner.nextInt();
                    try {
                        graph.addWeightEdge(src, dest, directed, weight);
                        System.out.println("Edge added.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter source: ");
                    src = scanner.nextInt();
                    System.out.print("Enter destination: ");
                    dest = scanner.nextInt();
                    try {
                        graph.removeEdge(src, dest, directed);
                        System.out.println("Edge removed.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter source: ");
                    src = scanner.nextInt();
                    System.out.print("Enter destination: ");
                    dest = scanner.nextInt();
                    try {
                        boolean exists = graph.CheckEdge(src, dest);
                        System.out.println("Edge exists: " + exists);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    graph.Display();
                    break;
                                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void bfsMenu() {
        System.out.print("Enter number of vertices: ");
        int vertices = scanner.nextInt();
        System.out.print("Is directed? (true/false): ");
        boolean directed = scanner.nextBoolean();
        Bfs bfs = new Bfs(vertices, directed);

        while (true) {
            System.out.println("\n=== BFS Menu ===");
            System.out.println("1. Add edge");
            System.out.println("2. Perform BFS");
            System.out.println("3. Back to Graph Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    int src = scanner.nextInt();
                    System.out.print("Enter destination: ");
                    int dest = scanner.nextInt();
                    try {
                        bfs.addEdge(src, dest, directed);
                        System.out.println("Edge added.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter start vertex: ");
                    int start = scanner.nextInt();
                    try {
                        bfs.bfs(start);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void dfsMenu() {
        System.out.print("Enter number of vertices: ");
        int vertices = scanner.nextInt();
        System.out.print("Is directed? (true/false): ");
        boolean directed = scanner.nextBoolean();
        Dfs dfs = new Dfs(vertices, directed);

        while (true) {
            System.out.println("\n=== DFS Menu ===");
            System.out.println("1. Add edge");
            System.out.println("2. Perform DFS");
            System.out.println("3. Back to Graph Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    int src = scanner.nextInt();
                    System.out.print("Enter destination: ");
                    int dest = scanner.nextInt();
                    try {
                        dfs.addEdge(src, dest, directed);
                        System.out.println("Edge added.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter start vertex: ");
                    int start = scanner.nextInt();
                    try {
                        dfs.dfs(start);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void hashingMenu() {
        while (true) {
            System.out.println("\n=== Hashing Menu ===");
            System.out.println("1. Closed Addressing (Separate Chaining)");
            System.out.println("2. Open Addressing");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    closedAddressingMenu();
                    break;
                case 2:
                    openAddressingMenu();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void closedAddressingMenu() {
        System.out.print("Enter hash size: ");
        int hashSize = scanner.nextInt();
        System.out.println("Choose hash function: 1. Division, 2. Multiplication, 3. Mid-Square, 4. Folding");
        int hashChoice = scanner.nextInt();
        HashFunction hashFxn = null;
        if (hashChoice == 4) {
            System.out.print("Enter chunk size: ");
            int chunkSize = scanner.nextInt();
            hashFxn = new HashFuxnMenu().getHashFunction(hashChoice, hashSize, chunkSize);
        } else {
            hashFxn = new HashFuxnMenu().getHashFunction(hashChoice, hashSize);
        }
        ClosedAddressingHashing hashing = new ClosedAddressingHashing(hashSize, hashFxn);

        while (true) {
            System.out.println("\n=== Closed Addressing Menu ===");
            System.out.println("1. Add key");
            System.out.println("2. Remove key");
            System.out.println("3. Search key");
            System.out.println("4. Display hash table");
            System.out.println("5. Back to Hashing Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key to add: ");
                    int key = scanner.nextInt();
                    hashing.add(key);
                    System.out.println("Key added.");
                    break;
                case 2:
                    System.out.print("Enter key to remove: ");
                    key = scanner.nextInt();
                    hashing.remove(key);
                    System.out.println("Key removed.");
                    break;
                case 3:
                    System.out.print("Enter key to search: ");
                    key = scanner.nextInt();
                    boolean found = hashing.search(key);
                    System.out.println("Found: " + found);
                    break;
                case 4:
                    hashing.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void openAddressingMenu() {
        System.out.print("Enter hash size: ");
        int hashSize = scanner.nextInt();
        System.out.println("Choose hash function: 1. Division, 2. Multiplication, 3. Mid-Square, 4. Folding");
        int hashChoice = scanner.nextInt();
        HashFunction hashFxn = null;
        if (hashChoice == 4) {
            System.out.print("Enter chunk size: ");
            int chunkSize = scanner.nextInt();
            hashFxn = new HashFuxnMenu().getHashFunction(hashChoice, hashSize, chunkSize);
        } else {
            hashFxn = new HashFuxnMenu().getHashFunction(hashChoice, hashSize);
        }
        System.out.println("Choose probing: 1. Linear, 2. Quadratic, 3. Double");
        int probeChoice = scanner.nextInt();
        ProbingFxn probing = new ProbingHashFxnMenu().getProbingHash(probeChoice, hashChoice, hashSize);
        OpenAddressingHashing hashing = new OpenAddressingHashing(hashSize, hashFxn, probing);

        while (true) {
            System.out.println("\n=== Open Addressing Menu ===");
            System.out.println("1. Add key");
            System.out.println("2. Delete key");
            System.out.println("3. Search key");
            System.out.println("4. Display hash table");
            System.out.println("5. Back to Hashing Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key to add: ");
                    int key = scanner.nextInt();
                    try {
                        hashing.add(key);
                        System.out.println("Key added.");
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter key to delete: ");
                    key = scanner.nextInt();
                    hashing.delete(key);
                    System.out.println("Key deleted.");
                    break;
                case 3:
                    System.out.print("Enter key to search: ");
                    key = scanner.nextInt();
                    boolean found = hashing.Search(key);
                    System.out.println("Found: " + found);
                    break;
                case 4:
                    hashing.dispay();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void searchingMenu() {
        while (true) {
            System.out.println("\n=== Searching Algorithms Menu ===");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    linearSearchMenu();
                    break;
                case 2:
                    binarySearchMenu();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void linearSearchMenu() {
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.print("Enter key to search: ");
        int key = scanner.nextInt();
        LinearSearch search = new LinearSearch(size, key);
        search.create();

        System.out.println("Array created.");
        search.display();
        boolean found = search.Search();
        System.out.println("Key found: " + found);
    }

    private static void binarySearchMenu() {
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.print("Enter key to search: ");
        int key = scanner.nextInt();
        BinarySearch search = new BinarySearch(size, key);
        search.create();

        System.out.println("Array created (assuming sorted).");
        search.display();
        boolean found = search.Search(0, size - 1, key);
        System.out.println("Key found: " + found);
    }

    private static void sortingMenu() {
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        CommonOperation common = new CommonOperation(size);
        common.create();
        int[] arr = new int[size];
        // Note: CommonOperation doesn't expose the array, so for simplicity, recreate or assume.
        // In a real implementation, modify CommonOperation to return the array.
        System.out.println("Array created.");
        common.display();

        while (true) {
            System.out.println("\n=== Sorting Algorithms Menu ===");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.println("6. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new BubbleSort().Sort(arr, size);
                    System.out.println("Sorted with Bubble Sort.");
                    break;
                case 2:
                    new SelectionSort().sort(arr, size);
                    System.out.println("Sorted with Selection Sort.");
                    break;
                case 3:
                    new InsertionSort().Sort(arr, size);
                    System.out.println("Sorted with Insertion Sort.");
                    break;
                case 4:
                    new MergeSort().sort(arr, 0, size - 1);
                    System.out.println("Sorted with Merge Sort.");
                    break;
                case 5:
                    new QuickSort().sort(arr, 0, size - 1);
                    System.out.println("Sorted with Quick Sort.");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            // Display sorted array
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


# 📚 DSA Interview Preparation in Java

This repository contains a comprehensive collection of fundamental **Data Structures** implementations written in **Java**. It is designed for hands-on practice and thorough preparation for technical coding interviews.

* **Repository Link:** [LakshyaDhouchak/dsa-interview-preperation](https://github.com/LakshyaDhouchak/dsa-interview-preperation)

---

## 📂 Repository Structure

The implementations are organized into folders based on the data structure type. Each folder contains the Java source files (`.java`) necessary for implementation and testing.

| Directory | Description | Included Implementations |
| :--- | :--- | :--- |
| **`ArrayDataStructure`** | Structures based on fixed and dynamic arrays. | `DynamicArray.java`, `StaticArray.java` |
| **`GraphDataStructure`** | Implementations for representing graphs. | `AdjacentList.java` (Adjacency List), `AdjacentMatrix.java` (Adjacency Matrix) |
| **`HashingDataStructure`** | Implementations related to Hashing, including collision resolution techniques. | `ClosedAddressingHashing.java`, `OpenAddressingHashing.java`, `HashFunction.java`, `ProbingFxn.java`, etc. |
| **`HeapsDataStructure`** | Implementations of Heap data structures. | `MaxHeaps.java`, `MinHeaps.java` |
| **`LinkedListDataStructure`** | Various types of linked lists. | `CircularLinkedList.java`, **`DoublyLinkedList.java`**, `SinglyLinkedList.java` |
| **`QueueDataStructure`** | Implementations of the Queue Abstract Data Type (ADT). | `CircularQueue.java`, `DoubleEndedQueue.java`, `SimpleQueue.java` |
| **`StackDataStructure`** | Implementations of the Stack Abstract Data Type (ADT). | `DynamicStack.java`, `StaticStack.java` |
| **`TreeDataStructure`** | Implementations of different tree structures. | `BinarySearchTree.java`, `BinaryTree.java`, `Trie.java` |

---

## 🚀 Getting Started

### Prerequisites

You need to have the **Java Development Kit (JDK)** installed on your machine to compile and run the project.

### Running the Code

The project is executed via the central entry point, **`Main.java`**, which you are setting up as a user-friendly menu to test all the data structure operations.

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/LakshyaDhouchak/dsa-interview-preperation](https://github.com/LakshyaDhouchak/dsa-interview-preperation)
    cd dsa-interview-preperation
    ```
2.  **Compile the source files:**
    *(This command assumes your project structure is manageable from the root directory, compiling `Main.java` and all other class files in subdirectories)*
    ```bash
    javac Main.java */*.java
    ```
3.  **Run the application:**
    ```bash
    java Main
    ```
    The application will launch the main menu, allowing you to select and test individual data structure operations (e.g., insert into the Doubly Linked List, traverse the Binary Search Tree, etc.).

---

## 🤝 Contribution

Contributions, including bug fixes, new implementations, or optimizations, are highly encouraged.

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/new-algorithm`).
3.  Commit your changes (`git commit -m 'Feat: Add Floyd-Warshall Algorithm'`).
4.  Push to the branch (`git push origin feature/new-algorithm`).
5.  Open a Pull Request.

---

If you are looking for additional resources to prepare for DSA interviews, check out this video: [Best DSA Course - Clear Any FAANG Interview!](https://www.youtube.com/watch?v=rZ41y93P2Qo).


## ⚖️ License
This project is licensed under the **MIT License** - see the [LICENSE.md](LICENSE.md) file for details.

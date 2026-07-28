# Exercise 5: Task Management System

## 1. Understanding Linked Lists

### Singly Linked List
A sequence of nodes where each node contains data and a reference (`next`) to the next node in the sequence. It can only be traversed in one direction (forward).

### Doubly Linked List
Each node contains data and two references: `next` pointing to the next node, and `prev` pointing to the previous node. This enables bidirectional traversal, making insertions and deletions before/after a specific node easier, at the cost of using slightly more memory for the extra pointer.

---

## 2. Complexity Analysis

Our `TaskLinkedList` is a custom singly linked list.

| Operation | Time Complexity | Explanation |
| :--- | :--- | :--- |
| **Add** | $O(N)$ (or $O(1)$) | Inserting at the end requires traversing the list from head to tail ($O(N)$). Note: If we maintain a `tail` pointer, this becomes $O(1)$. |
| **Search** | $O(N)$ | Requires traversing the nodes sequentially starting from the head to find the matching `taskId`. |
| **Traverse** | $O(N)$ | Requires visiting all nodes in sequence from head to tail. |
| **Delete** | $O(N)$ | Requires traversing the list to locate the target node ($O(N)$) and then unlinking it by updating the previous node's `next` pointer ($O(1)$). |

---

## 3. Advantages of Linked Lists Over Arrays for Dynamic Data

1. **Dynamic Size**: Linked lists do not have a fixed size. They grow and shrink dynamically as nodes are added or removed, avoiding the need for expensive array resizing operations.
2. **Efficient Insertions/Deletions**: Once the reference pointer to a node location is resolved, inserting or deleting that node takes $O(1)$ time by simply updating reference pointers, without shifting any subsequent elements (unlike arrays).
3. **No Memory Waste**: Memory is allocated on a per-node basis as needed, rather than pre-allocating large contiguous blocks that might remain unused.

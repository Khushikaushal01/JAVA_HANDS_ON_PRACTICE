# Exercise 1: Inventory Management System

## 1. Understanding the Problem

### Why Data Structures and Algorithms are Essential
In large-scale warehouse operations, inventories can grow to hundreds of thousands or millions of products. 
* **Speed**: Retrieving, updating, or deleting a product must be near-instantaneous. Using inefficient traversal (like scanning a list one by one) on millions of items would lead to unacceptable latencies.
* **Memory Efficiency**: Storing object references efficiently without unnecessary overhead keeps the application footprint light.
* **Accuracy**: Data structures ensure constraints (like unique product IDs) are handled systematically.

### Suitable Data Structures
1. **ArrayList / Array**: Simple to set up. However, searching requires $O(N)$ scanning (unless sorted, in which case binary search takes $O(\log N)$). Delete operations are slow ($O(N)$ due to element shifting).
2. **HashMap**: Ideal for lookup-by-ID operations. Keys are unique product IDs, and values are the Product objects. This gives $O(1)$ average time complexity for retrieval, addition, update, and deletion.
3. **TreeMap**: Suitable if products need to be sorted by ID. It keeps keys sorted at the cost of logarithmic time complexity ($O(\log N)$) for operations.

---

## 2. Implementation details

We chose **`HashMap<String, Product>`** as the backend data structure because product searches are based on unique `productId` strings, making $O(1)$ operations optimal.

---

## 3. Complexity Analysis

| Operation | Time Complexity (Average Case) | Time Complexity (Worst Case) | Explanation |
| :--- | :--- | :--- | :--- |
| **Add** | $O(1)$ | $O(N)$ | Direct indexing via hash code computation. Worst case occurs if all keys hash to the same bucket (collision), yielding a linked list/tree traversal. |
| **Update** | $O(1)$ | $O(N)$ | Key hashing finds bucket directly, replacing the old entry value. |
| **Delete** | $O(1)$ | $O(N)$ | Key hashing locates bucket directly and removes the node. |

---

## 4. Optimization Strategies
* **Load Factor and Capacity**: Properly size the `HashMap` capacity initially or configure the load factor to avoid frequent rehashing as the inventory grows.
* **Effective HashCode**: Implement a robust and uniform `hashCode()` implementation for keys to minimize bucket collisions.

# Exercise 6: Library Management System

## 1. Understanding Search Algorithms

### Linear Search
Scans through all elements of the dataset sequentially until it finds the target item. It works on any list, sorted or unsorted.

### Binary Search
A fast search algorithm that operates on **sorted** datasets. It divides the search interval in half recursively: compares the target value to the middle element, and updates the search boundary accordingly.

---

## 2. Complexity Comparison

| Algorithm | Time Complexity (Best Case) | Time Complexity (Average/Worst Case) | Space Complexity |
| :--- | :--- | :--- | :--- |
| **Linear Search** | $O(1)$ | $O(N)$ | $O(1)$ |
| **Binary Search** | $O(1)$ | $O(\log N)$ | $O(1)$ (iterative) |

---

## 3. Analysis

### When to Use Each Algorithm

#### Use Linear Search when:
1. **Small Dataset**: The data size is small (e.g. less than 100 items), where the overhead of sorting is higher than the linear scan cost.
2. **Unsorted Data & Frequent Updates**: The dataset changes continuously, making it computationally expensive to keep it sorted.
3. **One-Time Search**: You only need to run a search once or twice, so sorting beforehand is not worth the $O(N \log N)$ cost.

#### Use Binary Search when:
1. **Large Dataset**: The number of items is large, where an $O(N)$ lookup would be slow.
2. **Static or Read-Heavy Data**: The data changes infrequently but is searched millions of times, allowing you to sort it once and run fast searches thereafter.
3. **Sorted Input**: The data is already naturally sorted (e.g. books sorted alphabetically by title on shelves).

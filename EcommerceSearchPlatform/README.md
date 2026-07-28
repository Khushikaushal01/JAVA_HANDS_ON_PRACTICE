# Exercise 2: E-commerce Platform Search Function

## 1. Understanding Asymptotic Notation

### Big O Notation
Big O notation is a mathematical notation used to describe the limiting behavior of a function when the argument tends towards a particular value or infinity. In computer science, it characterizes the execution time or space requirements of an algorithm in the worst-case scenario as input size $N$ grows. It helps developers make algorithm choices that remain efficient at scale.

### Search Operations Scenarios
* **Best-Case**: The minimum time needed to execute the algorithm. For search algorithms, this occurs when the target item is at the first location checked.
* **Average-Case**: The expected time needed, averaged over all possible inputs.
* **Worst-Case**: The maximum time needed. This happens when the target is at the final position checked or is absent from the dataset entirely.

---

## 2. Comparison of Search Algorithms

| Algorithm | Best-Case | Average-Case | Worst-Case | Prerequisite |
| :--- | :--- | :--- | :--- | :--- |
| **Linear Search** | $O(1)$ | $O(N)$ | $O(N)$ | None (works on unsorted lists) |
| **Binary Search** | $O(1)$ | $O(\log N)$ | $O(\log N)$ | Data must be sorted |

---

## 3. Analysis and Recommendation

### Linear vs. Binary Search
* **Linear Search** scales linearly. If you have $10,000$ products, it may make up to $10,000$ comparisons.
* **Binary Search** scales logarithmically. If you have $10,000$ products, it will make at most $\approx 14$ comparisons.

### Recommendation
For an e-commerce platform where product counts are high and searches occur continuously:
* **Binary Search** (or index-based lookups) is significantly more suitable due to its $O(\log N)$ performance.
* While sorting is required before Binary Search ($O(N \log N)$ cost), in real-world platforms, the inventory is sorted or indexed *once* (or during updates), while search requests run millions of times. Thus, the sorting overhead is amortized over a vast number of searches.

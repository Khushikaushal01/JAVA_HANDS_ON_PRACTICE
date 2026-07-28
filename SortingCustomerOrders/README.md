# Exercise 3: Sorting Customer Orders

## 1. Understanding Sorting Algorithms

* **Bubble Sort**: A simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.
* **Insertion Sort**: Builds the final sorted array one item at a time. It iterates, taking one element from the input data and finding the correct location it belongs within the sorted list.
* **Quick Sort**: A divide-and-conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot, placing smaller elements on one side and larger on the other. It then recursively sorts the sub-arrays.
* **Merge Sort**: A divide-and-conquer algorithm. It divides the input array into two halves, calls itself recursively for the two halves, and then merges the two sorted halves.

---

## 2. Complexity Comparison

| Algorithm | Best Case | Average Case | Worst Case | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| **Bubble Sort** | $O(N)$ (optimized) | $O(N^2)$ | $O(N^2)$ | $O(1)$ (in-place) |
| **Quick Sort** | $O(N \log N)$ | $O(N \log N)$ | $O(N^2)$ | $O(\log N)$ (call stack) |

---

## 3. Analysis

### Why Quick Sort is Preferred Over Bubble Sort
1. **Performance**: In real-world scenarios, Quick Sort's $O(N \log N)$ average-case performance easily outperforms Bubble Sort's $O(N^2)$ average-case. For $10,000$ elements, Bubble Sort executes $\approx 10^8$ operations, whereas Quick Sort executes $\approx 1.3 \times 10^5$ operations.
2. **Locality of Reference**: Quick Sort displays excellent cache locality since it operates sequentially on subsegments of contiguous arrays, making it faster on modern hardware architectures.
3. **In-place Sorting**: Unlike Merge Sort, Quick Sort does not require $O(N)$ auxiliary memory for merges. It only requires a logarithmic call stack.
4. **Worst-Case Mitigation**: Although its worst-case is $O(N^2)$ (e.g. when the pivot is always the smallest or largest element), this can be easily mitigated using random pivot selection or median-of-three strategies, making it run at $O(N \log N)$ in almost all circumstances.

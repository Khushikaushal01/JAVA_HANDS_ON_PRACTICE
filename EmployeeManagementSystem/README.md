# Exercise 4: Employee Management System

## 1. Understanding Array Representation

### Array Memory Representation
An array is a collection of elements of the same data type stored in contiguous memory locations.
* **Contiguous Allocation**: Memory for the entire array is allocated as a single contiguous block.
* **Index-based Access**: Because of contiguous memory, the address of any element at index $i$ can be calculated using a simple offset formula: 
  $$\text{Address}(A[i]) = \text{Base Address} + i \times \text{Size of element}$$
  This address calculation happens in constant time ($O(1)$), yielding instant index lookups.

### Advantages of Arrays
* **Fast Lookups**: Index-based access is $O(1)$.
* **Memory Efficient**: Contiguous blocks minimize fragmentation, and no auxiliary memory pointers are needed (unlike linked lists).
* **Cache Locality**: Elements sit right next to each other, allowing CPU prefetching to load adjacent elements into cache.

---

## 2. Complexity Analysis

Our custom `EmployeeManager` is backed by a standard Java array.

| Operation | Time Complexity | Explanation |
| :--- | :--- | :--- |
| **Add** | $O(1)$ amortized / $O(N)$ worst | Appending at `size` index takes $O(1)$ time. If the array is full, copy/resize is triggered, taking $O(N)$ time. |
| **Search** | $O(N)$ | Requires traversing the array elements line-by-line (linear search) to find the ID. |
| **Traverse** | $O(N)$ | Accessing each element in sequence to print details. |
| **Delete** | $O(N)$ | Requires locating the element ($O(N)$ search) and shifting all subsequent elements to the left to close the gap ($O(N)$ shift). |

---

## 3. Limitations of Arrays

* **Fixed Size**: Once allocated, the size of an array cannot be changed. Dynamic resizing requires allocating a new array and copying all elements.
* **Costly Insertions/Deletions**: Inserting or deleting an element in the middle requires shifting elements, resulting in $O(N)$ worst-case time.

### When to Use Arrays
Arrays are highly suitable when:
* The maximum size of the dataset is known beforehand.
* Fast, constant-time random access by index is required frequently.
* Dynamic insertions and deletions in the middle are rare.

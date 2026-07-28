# Exercise 7: Financial Forecasting

## 1. Understanding Recursive Algorithms

### Concept of Recursion
Recursion is a programming technique where a method calls itself directly or indirectly to solve a problem. 
* **Base Case**: The stopping condition that prevents the recursion from running infinitely.
* **Recursive Step**: The part where the method reduces the problem size and calls itself.

### How Recursion Simplifies Problems
Recursion matches the mathematical induction principle, making code highly readable and expressive for problems that naturally display self-similarity (e.g. tree traversals, directory listing, mathematical progressions like Fibonacci, Factorials, and Compounding Interest).

---

## 2. Complexity Analysis

Our simple recursive method `calculateFutureValue` progresses sequentially through periods.

* **Time Complexity**: $O(N)$, where $N$ is the number of periods. For each period, the function makes exactly one recursive call.
* **Space Complexity**: $O(N)$ auxiliary stack space. Each recursive call places a new activation record onto the call stack. For extremely large values of $N$, this can cause a `StackOverflowError`.

---

## 3. Optimization Strategies

To avoid stack overflow and excessive call overhead:
1. **Iterative Approach ($O(N)$ time, $O(1)$ space)**: Replaces the call stack frame creation with a simple loop, maintaining constant auxiliary memory.
2. **Memoization**: If the recursion tree contains redundant calculations (like in Fibonacci), cache intermediate results in a table (dynamic programming) to look them up instantly. (Note: For compounding interest, there are no overlapping subproblems, so simple iteration is the best choice).
3. **Tail Recursion Optimization**: Rewrite the recursion such that the recursive call is the final operation. Some compilers optimize tail-recursive methods to run in $O(1)$ stack space (though JVM does not support tail-call optimization natively).
4. **Closed-Form Formula ($O(1)$ time, $O(1)$ space)**: Use mathematical equations directly, e.g. `Math.pow(1 + growthRate, periods)`.

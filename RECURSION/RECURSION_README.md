# 🔁 Recursion

A deep dive into recursive problem-solving — from basic counting patterns to string/array recursion, optimized power calculation, and classic recursion-based puzzles.

---

## 📂 Problems

| # | Problem |
|---|---------|
| 1 | Print n to 1 in decreasing order |
| 2 | Print 1 to n in increasing order |
| 3 | Factorial of a number |
| 4 | Sum of first n natural numbers |
| 5 | Nth Fibonacci number |
| 6 | Check if given array is sorted or not |
| 7 | First occurrence of an element in array |
| 8 | Last occurrence of an element in array |
| 9 | x to the power n |
| 10 | x to the power n — optimized (divide & conquer) |
| 11 | Tiling problem |
| 12 | Remove duplicates from string |
| 13 | Friends pairing problem |
| 14 | Binary strings of size n without consecutive ones |
| 15 | Find all occurrences of an element |
| 16 | Print 1234 as "one two three four" |
| 17 | Length of a string (recursively) |

---

## 🎯 Key Concepts / Learnings

- Every recursive function needs a clear **base case** to terminate and an **inductive step** that moves toward it.
- Recursion trees help visualize repeated/overlapping calls (useful groundwork before learning dynamic programming).
- The optimized power function uses the idea: `x^n = (x^(n/2))^2` (with an extra multiplication if `n` is odd), reducing time complexity from O(n) to O(log n).
- The tiling and friends-pairing problems follow Fibonacci-like recurrence relations.
- Backtracking-style recursion (e.g., binary strings without consecutive ones) builds the result step-by-step and prunes invalid paths early.

---

## 🛠️ How to Run

```bash
cd "RECURSION"
javac FileName.java
java FileName
```

---

⬅️ [Back to main README](../README.md)

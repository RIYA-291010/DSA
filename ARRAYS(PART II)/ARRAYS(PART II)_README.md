# 🔢 Arrays (Part II)

Intermediate-to-advanced array problems — covering sub-array techniques, Kadane's algorithm, duplicates, and classic array-based interview problems.

---

## 📂 Problems

| # | Problem |
|---|---------|
| 1 | Maximum sub-array — brute force |
| 2 | Max sub-array — prefix sum |
| 3 | Kadane's algorithm |
| 4 | Kadane's algorithm with negative numbers |
| 5 | Return true if duplicates exist |
| 6 | Max profit |
| 7 | Best time to buy and sell stocks |
| 8 | Trapping rain water |

---

## 🎯 Key Concepts / Learnings

- The brute-force approach to maximum sub-array checks all possible sub-arrays — O(n²) or O(n³).
- Prefix sums allow computing sub-array sums in O(1) after O(n) preprocessing.
- Kadane's algorithm finds the maximum sub-array sum in a single O(n) pass by tracking the best sum ending at each index.
- Kadane's algorithm needs careful handling when all elements are negative — the answer must default to the largest single element.
- Duplicate detection can be optimized using a HashSet for O(n) time instead of O(n²) brute-force comparison.
- Buy/sell stock problems use a single-pass approach, tracking the minimum price seen so far to maximize profit.
- Trapping rain water uses precomputed left-max and right-max arrays (or a two-pointer technique) to calculate trapped water in O(n).

---

## 🛠️ How to Run

```bash
cd "ARRAYS(PART II)"
javac FileName.java
java FileName
```

---

⬅️ [Back to main README](../README.md)

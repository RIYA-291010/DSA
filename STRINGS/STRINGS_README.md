# 🔤 Strings

String manipulation fundamentals and common interview problems in Java.

---

## 📂 Problems

| # | Problem |
|---|---------|
| 1 | Create, declare, input and output a string |
| 2 | String length |
| 3 | String concatenation |
| 4 | Print all characters in a string |
| 5 | Palindrome string |
| 6 | Shortest path from given directions |
| 7 | Substrings |
| 8 | Lexicographical concepts |
| 9 | StringBuilder |
| 10 | First letter to uppercase |
| 11 | String compression |
| 12 | String compression using StringBuilder |

---

## 🎯 Key Concepts / Learnings

- Strings in Java are **immutable** — every modification creates a new string object, which is why `StringBuilder` is preferred for repeated modifications.
- A palindrome check compares characters from both ends moving inward.
- Generating all substrings of a string of length n takes O(n²) time (O(n³) if each substring is also printed character by character).
- Lexicographical comparison is essentially dictionary-order comparison, used in problems involving sorting/comparing strings.
- String compression (e.g., "aaabb" → "a3b2") is an efficient way to represent repeated characters, often solved in a single pass using `StringBuilder`.

---

## 🛠️ How to Run

```bash
cd "STRINGS"
javac FileName.java
java FileName
```

---

⬅️ [Back to main README](../README.md)

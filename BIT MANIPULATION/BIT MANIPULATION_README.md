# ⚙️ Bit Manipulation

Bitwise operators and common bit-manipulation techniques used in DSA and interview problems.

---

## 📂 Problems

| # | Problem |
|---|---------|
| 1 | Bitwise operators |
| 2 | Odd or even using bitwise operators |
| 3 | Get the i-th bit |
| 4 | Set the i-th bit |

---

## 🎯 Key Concepts / Learnings

- Bitwise operators (`&`, `|`, `^`, `~`, `<<`, `>>`) operate directly on the binary representation of numbers and are extremely fast.
- Checking odd/even using `n & 1` avoids the modulus operator — if the last bit is `1`, the number is odd.
- To get the i-th bit: `(n >> i) & 1`.
- To set the i-th bit: `n | (1 << i)`.

---

## 🛠️ How to Run

```bash
cd "BIT MANIPULATION"
javac FileName.java
java FileName
```

---

⬅️ [Back to main README](../README.md)

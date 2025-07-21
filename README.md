# 🔁 Java Recursion Programs Collection

Welcome to this mini collection of simple and beginner-friendly Java programs focusing on **recursion** and **string manipulation**. These examples are great for anyone looking to improve their understanding of recursion, character swapping, and handling strings manually in Java.

## 🧠 Programs Included

1. 🔄 Reverse a String using StringBuilder  
2. ❌➡️ Move All 'x' to the End of a String  
3. 🧹 Remove Duplicate Characters from a String  
4. 🔠 Generate All Subsequences of a String

## 🚀 How to Run

### ✅ Prerequisites

Make sure you have the following installed:  
- Java JDK (version 8 or above)  
- Any IDE like IntelliJ IDEA / VS Code / Eclipse  
  _or just use terminal with `javac` and `java` commands_

## 📂 Program Details & Usage

### 🔄 1. `Revers.java` – Reverse a String  
📝 Description: Reverses a given string using a loop and the `StringBuilder`'s `setCharAt()` method. It swaps characters from the front and back until the middle is reached.  
📌 Sample Input: `StringBuilder sb = new StringBuilder("MAANG");`  
💡 Output: `GNAAM`  
▶️ Run:  
```bash
javac Revers.java
java Revers
```

### ❌➡️ 2. `moveX.java` – Move All 'x' to the End  
📝 Description: Uses recursion to move all occurrences of the character 'x' to the end of the given string while maintaining the order of other characters.  
📌 Sample Input: `axbcxdmx`  
💡 Output: `abcdmxxx`  
▶️ Run:  
```bash
javac moveX.java
java moveX
```

### 🧹 3. `remDup.java` – Remove Duplicates  
📝 Description: Removes duplicate characters from a string using recursion and a boolean map of size 26 to track already-visited characters (assuming lowercase letters).  
📌 Sample Input: `aabbccdd`  
💡 Output: `abcd`  
▶️ Run:  
```bash
javac remDup.java
java remDup
```

### 🔠 4. `susbsequences.java` – Generate All Subsequences  
📝 Description: Generates and prints all possible subsequences of a given string using recursion. For a string of length `n`, it will produce `2^n` subsequences.  
📌 Sample Input: `abc`  
💡 Output:  
```
abc  
ab  
ac  
a  
bc  
b  
c
```  
▶️ Run:  
```bash
javac susbsequences.java
java susbsequences
```

## 🙋‍♂️ Need Help or Want to Connect?

Feel free to reach out or connect with me through the following platforms:  

<a href="mailto:singhmayank4146@gmail.com">  
  <img src="https://img.shields.io/badge/Gmail-singhmayank4146@gmail.com-EA4335?style=for-the-badge&logo=gmail&logoColor=white&labelColor=EA4335&logoWidth=20" />  
</a><br>  
<a href="https://www.linkedin.com/in/mayank-singh-813b68373/">  
  <img src="https://img.shields.io/badge/LinkedIn-Mayank%20Singh-0077B5?style=for-the-badge&logo=linkedin&logoColor=white&labelColor=0077B5&logoWidth=20" />  
</a><br>  
<a href="https://x.com/S87691143Singh">  
  <img src="https://img.shields.io/badge/Twitter-@S87691143Singh-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white&labelColor=1DA1F2&logoWidth=20" />  
</a>

## 📄 License

This project is open-source and free to use for learning purposes.

> 🔁 Happy Recursing & Keep Practicing Java! 💻✨

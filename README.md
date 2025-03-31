## **List of concepts** we'll include in the assignment:

✅ **Classes & Objects**  
✅ **Access Modifiers** (`public`, `private`, `protected`, *default*)  
✅ **Constructors & Constructor Overloading**  
✅ **Method Overloading**  
✅ **Static Variables & Methods**  
✅ **`this` Keyword**  
✅ **Memory Allocation with `new`**  
✅ **finalize() Method**  



---

# ⚽ **Assignment: Java Fundamentals – Football Match Tracker**

## 👋 Background
Welcome to your first Java project as part of the **Football League Tech Team**!

You're tasked with building a basic Football Match Tracker. This Java-based console app will simulate how players and teams are created and how simple match stats are recorded. You’ll build classes, manage data using objects, and understand how Java manages memory and behavior — all while applying **real Java development principles**.

Each task highlights a **specific concept** from today's lesson.

---

## 🧩 Assignment Tasks

> 🗂 **Project Folder:** `football-tracker`

---

### 🔹 Task 1: Class & Object Creation  
**Objective:** Create a `Player` class and instantiate player objects.

**Instructions:**
- Define a `Player` class with:
  - `String name`
  - `int jerseyNumber`
  - `String position`
- In a `Main.java` class, create 3 player objects using `new`.

🧠 *This task helps you understand object creation and memory allocation.*

---

### 🔹 Task 2: Access Modifiers  
**Objective:** Use access modifiers to control visibility of class members.

**Instructions:**
- Set `name` as `public`
- Set `jerseyNumber` as `private`
- Set `position` as `protected`
- Try accessing these fields from a separate class `AccessTest.java`
- Observe what works and what causes errors.

🧠 *Understand the effect of each modifier and Java's visibility rules.*

---

### 🔹 Task 3: Constructor & Overloading  
**Objective:** Add constructors to your `Player` class.

**Instructions:**
- Create a **default constructor** that sets values to "Unknown".
- Overload it with a **parameterized constructor** for all fields.
- In `Main.java`, create one player with default values, and one with custom values.

🧠 *Learn how to initialize objects in multiple ways.*

---

### 🔹 Task 4: Method Overloading  
**Objective:** Create multiple methods with the same name but different parameters.

**Instructions:**
- In `Player` class, define:
  ```java
  void printStats()
  void printStats(boolean showPosition)
  ```
- First method shows name and jersey.
- Second method includes the position if `showPosition` is `true`.

🧠 *You’ll see how Java handles method names based on arguments.*

---

### 🔹 Task 5: `this` Keyword  
**Objective:** Use `this` to reference instance variables.

**Instructions:**
- Inside the parameterized constructor, use `this` to distinguish between instance variables and parameters.
- Example:
  ```java
  this.name = name;
  ```

🧠 *Fixes shadowing issues and shows how to refer to the current object.*

---

### 🔹 Task 6: Static Variables & Methods  
**Objective:** Use static members for shared data across objects.

**Instructions:**
- Add a static variable `totalPlayers` in the `Player` class.
- Increment it in each constructor.
- Create a static method `printTotalPlayers()` to print the value.

🧠 *Learn how to track global values across multiple instances.*



---

### 🔹 **Task 7: Using `finalize()` Method**

#### 🎯 Objective:
Demonstrate how Java runs cleanup code before an object is destroyed from memory by overriding the `finalize()` method in your `Player` class.

---

## ✅ What You’ll Do:

1. Override the `finalize()` method in the `Player` class.
2. Set your Player objects to `null` after use.
3. Call `System.gc()` to *suggest* the Java Virtual Machine to run garbage collection.
4. Observe the behavior — the `finalize()` method should run (if GC picks up the objects).

---

## 💡 Why This Matters:

Even though `finalize()` is now deprecated in newer versions, it teaches you:

- That Java can automatically clean up unused objects.
- How object memory lifecycle works.
- That cleanup **should not** rely on `finalize()` in real-world code — but it’s great to know it exists.

---

## 🛠️ Step-by-Step Instructions

### ✅ Step 1: Add `finalize()` to `Player.java`
📁 `src/com/league/model/Player.java`

```java
@Override
protected void finalize() throws Throwable {
    System.out.println(name + " is being removed from memory.");
    super.finalize(); // optional, calls Object.finalize()
}
```

---

### ✅ Step 2: Test It in `Main.java`
📁 `src/com/league/app/Main.java`

```java
package com.league.app;

import com.league.model.Player;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Mohamed Salah", 11, "Forward");
        Player p2 = new Player("Luka Modric", 10, "Midfielder");

        p1.printStats(true);
        p2.printStats(true);

        // Now we "remove" the objects by setting them to null
        p1 = null;
        p2 = null;

        // Request garbage collection
        System.gc();

        // Wait for GC to potentially run
        try {
            Thread.sleep(1000); // Let the GC do its job
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method ended.");
    }
}
```

---

### 📝 Sample Output (your output may vary):

```bash
Name: Mohamed Salah, Jersey: 11, Position: Forward
Name: Luka Modric, Jersey: 10, Position: Midfielder
Mohamed Salah is being removed from memory.
Luka Modric is being removed from memory.
Main method ended.
```

---

## 🧠 Tips:

- You **may not always see finalize() messages**. Garbage collection is **not guaranteed** to run immediately.
- Run the program a few times — sometimes GC delays, and `finalize()` won’t print.
- This task is for **learning purposes**. In modern Java, use `try-with-resources` and `AutoCloseable` for cleanup instead.

---

## ✅ Task Complete When:

- [ ] You override `finalize()` in `Player.java`
- [ ] You nullify objects in `Main.java`
- [ ] You call `System.gc()` and observe the `finalize()` method message

---



## 📚 Deliverables

- `Player.java` — your main class with all logic
- `Main.java` — used to test your code
- `AccessTest.java` — for testing visibility
- `README.md` — explain what each task does

---

## ✅ Bonus (Optional): Team Class
Create a basic `Team` class with `String teamName` and a static variable `totalTeams`. Create 2 teams and print total.

---

## 🎯 Success Criteria

| Task              | Completed |
|-------------------|-----------|
| Class & Object     | ✅ / ❌    |
| Access Modifiers   | ✅ / ❌    |
| Constructor Overloading | ✅ / ❌    |
| Method Overloading | ✅ / ❌    |
| Static Members     | ✅ / ❌    |
| `this` Keyword     | ✅ / ❌    |
| `finalize()` Test  | ✅ / ❌    |

---

## 🚀 How to Submit (for GitHub Classroom)
1. Clone the repo provided by your instructor.
2. Create the necessary files and complete the tasks.
3. Commit your changes with meaningful messages.
4. Push to GitHub and check your submission.


# Producer Consumer Problem Using Java Multithreading

## 📖 Overview

The Producer-Consumer Problem is a classic synchronization problem in Operating Systems and Multithreading.

This project demonstrates communication between two threads:

- Producer Thread: Produces data and places it into a shared buffer.
- Consumer Thread: Consumes data from the shared buffer.
- Shared Buffer: Stores data temporarily and coordinates access between threads.

The implementation uses Java's built-in synchronization mechanisms such as:

- synchronized
- wait()
- notify()/notifyAll()

to prevent race conditions and ensure safe access to shared resources.

---

## 🎯 Objectives

- Understand Multithreading in Java
- Learn Thread Synchronization
- Prevent Race Conditions
- Demonstrate Producer-Consumer Communication

---

## 🛠 Technologies Used

- Java
- Multithreading
- Synchronization
- Object-Oriented Programming

---

## 📂 Project Structure

```
Consumer_Producer/
│
├── Main.java
├── Producer.java
├── Consumer.java
├── SharedBuffer.java
│
├── README.md
├── .gitignore
│
└── screenshots/
```

---

## 📋 File Description

### Main.java

Entry point of the application.

- Creates Producer and Consumer threads.
- Starts thread execution.

### Producer.java

Producer thread responsible for generating data and storing it in the shared buffer.

### Consumer.java

Consumer thread responsible for retrieving and processing data from the shared buffer.

### SharedBuffer.java

Shared resource used by both Producer and Consumer.

Contains:
- Buffer variable
- Synchronization logic
- wait()
- notify()/notifyAll()

---

## ⚙️ Working

1. Producer generates an item.
2. Item is stored in the shared buffer.
3. Consumer retrieves the item.
4. Synchronization ensures:
   - Producer waits if buffer is full.
   - Consumer waits if buffer is empty.
5. Process continues until the specified limit is reached.

---

## ▶️ How to Run

Compile:

```bash
javac *.java
```

Run:

```bash
java Main
```

---

## Sample Output

```text
Produced: 1
Consumed: 1

Produced: 2
Consumed: 2

Produced: 3
Consumed: 3
```

---

## Concepts Demonstrated

- Thread Creation
- Thread Scheduling
- Synchronization
- wait()
- notify()
- Shared Resources
- Race Condition Prevention

---

## Future Enhancements

- Multiple Producers
- Multiple Consumers
- Circular Buffer
- GUI using Java Swing
- BlockingQueue Implementation

---

## Author

Varun Kumar

B.Tech Computer Science Engineering
Chandigarh Group of Colleges, Landran
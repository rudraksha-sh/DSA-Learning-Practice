<div align="center">

# ☕ Java OOP Concepts

### Object-Oriented Programming in Java

A structured, visual guide to Java OOP fundamentals — from classes and objects to abstraction, encapsulation, inheritance, polymorphism, and object relationships.

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk)
![Topic](https://img.shields.io/badge/Topic-OOP-blue?style=for-the-badge)
![Learning](https://img.shields.io/badge/Track-Phase%200-success?style=for-the-badge)

</div>

---

## 📚 Table of Contents

- [Introduction](#-introduction-to-oop)
- [Characteristics of OOP](#-characteristics-of-oop)
- [Class](#-1-class)
- [Object](#-2-object)
- [Constructor](#-3-constructor)
- [Abstraction](#-4-abstraction)
- [Encapsulation](#-5-encapsulation)
- [Association, Aggregation and Composition](#-6-association-aggregation-and-composition)
- [Inheritance](#-7-inheritance)
- [Polymorphism](#-8-polymorphism)
- [OOP vs Procedural Programming](#-oop-vs-procedural-programming)
- [Limitations of OOP](#-limitations-of-oop)

---

## 🎯 Introduction to OOP

**Object-Oriented Programming (OOP)** is a programming paradigm based on objects that contain **data (fields)** and **behavior (methods)**. It helps design software around entities and relationships that can represent real-world concepts.

### Why use OOP?

- ♻️ Improves code reusability.
- 🧩 Enhances maintainability and scalability.
- 🧠 Makes programs easier to understand and manage.
- 🛡️ Supports controlled access to data.
- 🏗️ Helps organize large programs into manageable components.

## 🧭 Characteristics of OOP

![Characteristics of Object-Oriented Programming](images/image.png)

*Diagram: characteristics of OOP.*

---

## 🧱 1. Class

A **class** in Java is a blueprint or template used to create objects. It defines the properties and behaviors that objects of that class have.

- A class is a user-defined reference type.
- It can contain fields and methods.
- Multiple objects can be created from one class.

**Example:** `Car` is a class; BMW, Mercedes, and Audi can be represented as individual car objects.

![Class](images/image-1.png)

---

## 🐕 2. Object

An **object** is an instance of a class. It has state, behavior, and identity.

| Concept | Meaning |
|---|---|
| **State** | The data or attributes held by the object |
| **Behavior** | The actions the object can perform |
| **Identity** | What distinguishes one object from another |

**Example:** `Dog` is a class, while `Tommy` can be an object created from it.

![Object](images/image-2.png)

---

## 🏗️ 3. Constructor

A **constructor** is a special class member invoked when an object is created. It initializes the object's state.

### Key rules

- Its name must match the class name.
- It has no return type—not even `void`.
- It is invoked during object creation.
- Constructors can initialize fields and establish a valid initial state.

**Example:** A `Car` constructor can initialize `brand`, `model`, and `color`.

### Types of constructors

![Constructors in Java](images/image-3.png)

| Type | Description |
|---|---|
| **Default constructor** | The compiler provides one when no constructor is declared; it initializes fields to their default values. |
| **No-argument constructor** | A constructor declared without parameters. |
| **Parameterized constructor** | Accepts parameters to initialize an object with specific values. |
| **Copy constructor** | A user-defined constructor that initializes an object using another object of the same class. Java does not generate one automatically. |
| **Private constructor** | Restricts constructor access from outside the class; often used in controlled-instantiation designs. |

> **Remember:** A compiler-provided default constructor and a programmer-written no-argument constructor are not the same thing.

---

## 🎭 4. Abstraction

**Abstraction** hides implementation details and exposes the essential operations an object provides. It lets users focus on *what* something does rather than *how* it does it.

### Benefits

- Hides unnecessary implementation complexity.
- Makes implementations easier to change.
- Supports flexible designs through abstract classes and interfaces.

**Example:** An ATM provides operations such as withdrawing cash while hiding the internal processing steps.

### How Java supports abstraction

- **Abstract classes** provide a shared base that can contain abstract and implemented methods.
- **Interfaces** define a contract that implementing classes agree to follow.

![alt text](images/image-4.png)

![alt text](images/image-5.png)

> **Note:** Interfaces are not strictly limited to “100% abstraction”; modern Java interfaces can also contain `default`, `static`, and private methods.

---

## 🔐 5. Encapsulation

**Encapsulation** combines data and the methods that operate on it in one unit, usually a class, while controlling how that data can be accessed.

### Common approach

- Keep fields `private`.
- Expose intentional operations through public methods.
- Use getters and setters when appropriate—not automatically for every field.
- Validate changes so an object remains in a valid state.

![alt text](images/image-6.png)

**Example:** A `BankAccount` should not let outside code directly set its balance to an invalid value. Instead, operations such as `deposit()` and `withdraw()` can validate each change.

---

## 🔗 6. Association, Aggregation and Composition

**Association** describes a relationship between objects. The objects may communicate or refer to one another while remaining distinct entities.

### Association

- Represents a relationship between objects.
- Does not inherently imply ownership.
- Related objects can have independent lifecycles.

### Aggregation — weak “has-a” relationship

Aggregation is a relationship in which one object refers to or groups other objects that can exist independently.

**Example:** A company has employees, but an employee can continue to exist if the company ceases to exist.

![alt text](images/image-7.png)

### Composition — strong ownership relationship

Composition represents stronger ownership: the contained object's lifecycle is managed as part of the owning object in the design.

**Example:** A house contains rooms as its constituent parts.

![alt text](images/image-8.png)

| Relationship | Ownership | Lifecycle |
|---|---|---|
| **Association** | No ownership implied | Independent |
| **Aggregation** | Weak “has-a” relationship | Parts can exist independently |
| **Composition** | Strong ownership | Parts are treated as dependent on the whole |

---

## 🧬 7. Inheritance

**Inheritance** allows one class to acquire accessible fields and methods from another class using `extends`. It commonly represents an **“is-a”** relationship.

- The inherited class is the **superclass** or base class.
- The inheriting class is the **subclass** or derived class.
- A subclass can add behavior and override inherited methods.
- Inheritance can reduce duplication when the relationship is appropriate.

**Example:** `Dog`, `Cat`, and `Cow` can extend an `Animal` base class.

![alt text](images/image-9.png)

### Types of inheritance

![alt text](images/image-10.png)

- **Single:** one subclass inherits from one superclass.
- **Multilevel:** inheritance forms a chain of classes.
- **Hierarchical:** multiple subclasses inherit from one superclass.
- **Multiple through interfaces:** a class can implement multiple interfaces.
- **Hybrid through interfaces:** combinations of inheritance structures can be modeled using interfaces.

> **Java limitation:** A class cannot extend multiple classes. Multiple inheritance of type can be achieved by implementing multiple interfaces.

---

## 🎨 8. Polymorphism

**Polymorphism** means “many forms.” The same method call or interface can produce different behavior depending on its parameters or the runtime object's actual class.

### Types of polymorphism

![alt text](images/image-11.png)

### Compile-time polymorphism — method overloading

Multiple methods share a name but have different parameter lists. The compiler determines which overload matches the call.

### Runtime polymorphism — method overriding

A subclass provides its own implementation of an inherited instance method. The implementation invoked depends on the actual runtime object.

**Example:** Calling `speak()` on different `Animal` implementations could produce `Bark`, `Meow`, or `Moo`.

![alt text](images/image-12.png)

---

## ⚖️ OOP vs Procedural Programming

### Advantages of OOP

- ♻️ **Reusability:** reuse behavior through methods, composition, inheritance, and interfaces.
- 🧱 **Modularity:** divide large systems into classes with clear responsibilities.
- 🛡️ **Encapsulation:** control access to internal state.
- 🔧 **Maintainability:** isolate changes behind stable interfaces.
- 📈 **Scalability:** support larger codebases with explicit abstractions and relationships.

### Limitations of OOP

- 📚 **Learning curve:** classes, object relationships, and polymorphism can be challenging at first.
- ⚙️ **Extra structure:** small programs may not need many classes and abstractions.
- 🧩 **Design complexity:** poor class hierarchies can make systems harder to change.
- 💾 **Memory overhead:** objects and references require memory; the impact depends on the program and runtime.

---

## 📝 Quick Revision Checklist

- [ ] Explain the difference between a class and an object.
- [ ] Describe state, behavior, and identity.
- [ ] Differentiate a default constructor from a no-argument constructor.
- [ ] Explain abstraction and encapsulation with examples.
- [ ] Compare association, aggregation, and composition.
- [ ] Explain single, multilevel, and hierarchical inheritance.
- [ ] Explain why Java classes cannot extend multiple classes.
- [ ] Differentiate method overloading from method overriding.
- [ ] Build a small Java example demonstrating each core OOP concept.

---

<div align="center">

### 💻 Phase 0 — Java Foundations

**Understand the concept. Implement the example. Commit the learning.**

*DAS — Discipline • Algorithms • Solutions*

</div>

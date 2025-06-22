---
layout: default
title: "Tim McIntire's CS 499 ePortfolio"
---

<link rel="stylesheet" href="/CS499/assets/css/custom.css" />

<p align="center">
  <img src="https://raw.githubusercontent.com/tmcintirejr/CS499/main/photos/profile.jpg" alt="Tim McIntire" width="200">
</p>

## 👋 Greetings!

I’m **Tim McIntire**—U.S. Army veteran, long-time Fire Medic on Alabama’s Gulf Coast, and freshly minted B.S. Computer Science graduate from Southern New Hampshire University. Over the last three years I have transformed a lifelong fascination with technology into demonstrable expertise in software engineering, full-stack development, and secure cloud architectures. This self-assessment introduces the strengths, values, and career goals showcased throughout the ePortfolio that follows.

---

## 🛠️ Professional Self-Assessment  

### 1  Coursework, ePortfolio & Professional Growth  
Building this ePortfolio around a single codebase—the **IT-145 “Grazioso Salvare” animal-rescue application**—forced me to iterate exactly the way production teams do: refactor, optimise, then persist data securely. Although every visible artifact comes from that project, each enhancement leverages concepts first mastered across the wider CS curriculum:  

| Strength (learned in …) | How it appears in the capstone |
|-------------------------|--------------------------------|
| Modular OOP Design (*IT-145*, *CS-230*) | Abstract `RescueAnimal` superclass, kingdom subclasses, reusable intake logic |
| Algorithmic Efficiency (*CS-300*, *CS-305*) | Swapped `ArrayList` linear scans for `HashMap` O(1) look-ups |
| Secure Data Persistence (*CS-340*, *CS-470*) | JDBC + SQLite with parameterised queries and exception handling |

### 2  Key Professional Competencies  

| Domain | Demonstrated Ability |
|--------|----------------------|
| **Collaborating in Team Environments** | Led Git workflows and peer reviews in *CS-250* & *CS-255*; comfortable with Agile boards and GitHub Projects. |
| **Communicating With Stakeholders** | Produced UML diagrams, sprint demos, and the capstone code-review video that explains technical trade-offs to non-developers. |
| **Data Structures & Algorithms** | Reduced search time from *O(n)* → *O(1)* using `HashMap`; earlier labs implemented recursion, BSTs, and dynamic programming. |
| **Software Engineering & Database** | Refactored for SOLID design; added a secure SQLite layer that persists data across sessions. |
| **Security Mindset** | Parameterised SQL, rigorous input validation, exception handling, and separation of concerns mitigate injection and logic attacks. |

### 3  Career Aspirations & Values  
I’m transitioning from 10+ years as a **Fire Medic** to a **Software/Full-Stack Developer** role—ideally with companies that serve public-safety or civic domains (e.g., **FirstDue**, emergency-services SaaS providers, or similar mission-driven teams). I value:  

- Solutions that improve community safety  
- Cloud-native, scalable architectures (studying for AWS/Azure certs)  
- Ethical, explainable AI (foundational exposure in *CS-370*)  

### 4  How the Three Enhancements Fit Together  
1. **Software Design & Engineering** – establishes a clean, extensible OOP foundation.  
2. **Algorithms & Data Structures** – boosts performance without altering external behaviour.  
3. **Database Integration** – adds secure, persistent storage, completing the data-flow.  

By evolving *one* artifact through these stages, reviewers see a clear narrative of problem-solving: from architecture → efficiency → persistence—exactly the lifecycle of real-world software.

---

## 🎥 Code Review Video
A walkthrough of the original code and my planned enhancements across all three focus areas.  
➡️ [Watch on YouTube](https://youtu.be/6r4VogDAAPQ)

---

## 🧰 Software Design & Engineering

**Narrative:**  
➡️ [Read Design Narrative](narratives/design-narrative.pdf)

**Artifacts:**  
- [Original Files](artifacts/original/)  
- [Enhanced Design Files](artifacts/design/)

**Highlights:**  
- Refactored class hierarchy using inheritance and abstraction  
- Implemented input validation and interface-based design  
- Replaced duplicated logic with reusable structures

---

## 🧮 Algorithms & Data Structures

**Narrative:**  
➡️ [Read Structure Narrative](narratives/structure-narrative.pdf)

**Artifacts:**  
- [Enhanced Structure Files](artifacts/structure/)

**Highlights:**  
- Replaced inefficient ArrayLists with HashMaps  
- Achieved faster lookups and better performance  
- Preserved modularity and scalability of code

---

## 🗃️ Database Integration

**Narrative:**  
➡️ [Read Database Narrative](narratives/database-narrative.pdf)

**Artifacts:**  
- [Enhanced Database Files](artifacts/database/)

**Highlights:**  
- Integrated SQLite backend for animal data  
- Created a reusable `DatabaseUtility.java` class  
- Enabled persistent storage and retrieval

---

## 🧭 Contact

Interested in discussing this work or collaborating?  
📧 Email: [tlmcintirejr@yahoo.com]  
🔗 GitHub: [https://github.com/tmcintirejr](https://github.com/tmcintirejr)

---

© 2025 Tim McIntire. Built using [GitHub Pages](https://pages.github.com) and Markdown.

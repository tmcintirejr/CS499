<!-- ────────────────────────────────────────────────────────────────────────── -->
<!-- Small page-scope CSS: hides repo title banner & applies clean layout     -->
<style>
/* Hide automatic “CS499” heading that GitHub Pages injects */
header h1 { display:none !important; }

/* Global settings */
body { max-width: 900px; margin: 0 auto; font-family: system-ui, sans-serif; line-height: 1.55; }

/* Navbar */
.navbar { text-align:center; margin: 0 0 24px 0; font-size: 1rem; }
.navbar a { margin: 0 8px; text-decoration:none; color:#0366d6; }
.navbar a:hover { text-decoration:underline; }

/* Section dividers */
section { margin-bottom: 64px; }
section h2 { margin-top: 0; }

/* Button-style links */
.btn { display:inline-block; padding:6px 12px; border:1px solid #0366d6; border-radius:4px;
       color:#0366d6; text-decoration:none; font-size:.95rem; }
.btn:hover { background:#0366d6; color:#fff; }
</style>

<!-- ────────────────────────────────────────────────────────────────────────── -->
<!--  Hero / profile photo  -->
<p align="center">
  <img src="https://raw.githubusercontent.com/tmcintirejr/CS499/main/photos/profile.jpg"
       alt="Tim McIntire" width="180" style="border-radius:50%; box-shadow:0 2px 6px rgba(0,0,0,.15)">
</p>

<h1 align="center">Tim McIntire — CS 499 ePortfolio</h1>

<div class="navbar">
  <a href="#home">Home</a> •
  <a href="#design">Design</a> •
  <a href="#structure">Structure</a> •
  <a href="#database">Database</a> •
  <a href="https://youtu.be/6r4VogDAAPQ" target="_blank">Code Review ▶︎</a>
</div>

---

<a id="home"></a>
<section>

### 👋 Welcome

This portfolio showcases the **capstone enhancements** I completed while finishing my B.S. in Computer Science at SNHU. Across three milestones I refactored, optimized, and secured a Java application for the fictional rescue organization **Grazioso Salvare**.  

*Browse with the navigation above or start with the professional self-assessment below.*

<p><a class="btn" href="narratives/self-assessment.md" target="_blank">Read Self-Assessment →</a></p>

</section>

---

<a id="design"></a>
<section>

## 🧰 Milestone 2 – Software Design & Engineering

**Narrative (PDF):** <a href="narratives/design-narrative.docx" target="_blank">Read Design Narrative →</a>  

**Artifacts**

* [Original Source Files](artifacts/original/)  
* [Enhanced Design Files](artifacts/design/)  

**Key Improvements**

* Refactored *RescueAnimal* into an **abstract superclass**; added *Adoptable* interface  
* Introduced six new kingdom classes (Mammal, Bird, Reptile, Amphibian, Fish, Other)  
* Implemented input validation & eliminated duplicate intake logic  

</section>

---

<a id="structure"></a>
<section>

## 🧮 Milestone 3 – Algorithms & Data Structures

**Narrative (PDF):** <a href="narratives/structure-narrative.docx" target="_blank">Read Structure Narrative →</a>  

**Artifacts**

* [Enhanced Structure Files](artifacts/structure/)  

**Key Improvements**

* Replaced `ArrayList` linear searches with **`HashMap` O(1)** look-ups  
* Preserved menu flow while drastically cutting lookup time for large datasets  

</section>

---

<a id="database"></a>
<section>

## 🗄️ Milestone 4 – Database Integration & Security

**Narrative (PDF):** <a href="narratives/database-narrative.docx" target="_blank">Read Database Narrative →</a>  

**Artifacts**

* [Enhanced Database Files](artifacts/database/)  
* JDBC Driver: <a href="lib/sqlite-jdbc-3.45.3.0.jar" target="_blank">Download SQLite JAR</a>

**Key Improvements**

* Added **SQLite persistence** via a dedicated `DatabaseUtility.java` class  
* Used **parameterized SQL** to prevent injection attacks (CO 5)  
* Centralized DB access for easier maintenance & future scaling  

</section>

---

## 📫 Contact

* 📧 tlmcintirejr@yahoo.com  
* 🔗 <a href="https://github.com/tmcintirejr" target="_blank">github.com/tmcintirejr</a>

---

<p align="center" style="font-size:.8rem">
© 2025 Tim McIntire &nbsp;•&nbsp; Built with Markdown & GitHub Pages
</p>

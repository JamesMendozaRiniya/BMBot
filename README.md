<div style="background:#241739; padding: 20px; border-radius: 12px; color: #fff; text-align:center; margin-bottom:30px;">
  <h1>BMBot — Your Personal Healthcare Companion</h1>
</div>
  <img src="IMG_ReadMe/bEyes.png" width="1000">
</p>

<div style="background:#241739; padding: 20px; border-radius: 12px; color: #fff;">

# **Description / Overview**
BMBot is a console-based healthcare companion designed to support both mental and physical well-being.

It asks users to rate their mood or pain on a scale of 1 to 10 and responds with personalized comfort, motivation, or health tips. Users can continue chatting for uplifting quotes or self-care reminders. 

*In urgent cases, BMBot provides the creator’s emergency contact number for safety.*

# **OOP Concepts Applied**

### **a. Abstraction**
- `BMBot` is an abstract class that contains the shared behaviors and properties of all care modes, and it declares the abstract method `startCare()`, which each care mode must implement in its own way.

### **b. Inheritance**
- `MentalCare` and `PhysicalCare` both *extend* the `BMBot` abstract class, allowing them to inherit shared fields and methods such as the user’s name and the input scanner. This avoids duplication and ensures all care modes follow the same basic structure.

### **c. Polymorphism**
- Both care modes implement their own version of `startCare()`. When the program runs, the method that gets executed depends on which object was created (`MentalCare` or `PhysicalCare`), even though the call is written from a `BMBot` reference. This is dynamic polymorphism.

### **d. Encapsulation**
- The user’s name (`uName`) is kept private inside the `BMBot` class. It can only be accessed or modified using public getter and setter methods, which protects the data and ensures controlled access.

# **Program Structure**

- **Main.java** — Program entry point.
- **BMBot.java** — Abstract parent class that handles name storage, input, and care selection.
- **MentalCare.java** — Handles emotional check-ins and motivational content.
- **PhysicalCare.java** — Provides basic physical care suggestions depending on pain level and body part.

# **How to Run the Program**
1. Place all `.java` files in the same folder.
2. Open terminal (CMD or bash) in that folder.
3. Compile the program:
   ```
   javac *.java
# **Sample Outputs**
- ### **MentalCare Sample Output**

  <img src="IMG_ReadMe/MentalCare sample.jpg" width="600">

- ### **MentalCare Sample Output**

  <img src="IMG_ReadMe/PhysicalCare sample.jpg" width="600">

# **Contributors**
<!-- James Gabriel Mendoza -->
<div style="display:flex; align-items:center; gap:10px;">
  <img src="IMG_ReadMe/jmsG.png" width="250">
  <div>
    <b>James Gabriel Mendoza</b><br>
    <a href="https://github.com/JamesMendozaRiniya">GitHub Profile</a>
  </div>
</div>
<br>

<!-- Janna Alexis Raras -->
<div style="display:flex; align-items:center; gap:10px;">
  <img src="IMG_ReadMe/Janna.png" width="250">
  <div>
    <b>Janna Alexis Raras</b><br>
    <a href="https://github.com/Jannashii">GitHub Profile</a>
  </div>
</div>

<br>

<!-- Micha Rubala -->
<div style="display:flex; align-items:center; gap:10px;">
  <img src="IMG_ReadMe/Micha.png" width="250">
  <div>
    <b>Micha Rubala</b><br>
    <a href="https://github.com/urmchaa">GitHub Profile</a>
  </div>
</div>

<br>

<!-- John Christian De Castro -->
<div style="display:flex; align-items:center; gap:10px;">
  <img src="IMG_ReadMe/JC.png" width="250">
  <div>
    <b>John Christian De Castro</b><br>
    <a href="https://github.com/Aiahtots">GitHub Profile</a>
  </div>
</div>

-  ## Our deepest gratitude to our professor

| ![Author](IMG_ReadMe/Maam.png) | **Ms. Fatima Marie P. Agdon**  
[GitHub Profile](https://github.com/marieemoiselle/) |
|-------------------------------------|-------------------------------------------------------------------|
  


 ## 🎨 Inspiration
This project is inspired by *Big Hero 6*, particularly the idea of a warm and caring personal healthcare companion like **Baymax**.  

![Baymax from Big Hero 6](https://media-cldnry.s-nbcnews.com/image/upload/t_fit-1000w,f_auto,q_auto:best/newscms/2016_10/749406/baymax.jpg)  

<a href="https://www.nbcnews.com/tech/gadgets/big-hero-6-science-behind-baymax-disneys-big-soft-robot-n240241">*Image source: nbcnews — Big Hero 6': The Science Behind Baymax, Disney's Big, Soft Robot*</a>

*This project is for educational purposes only and not intended to replace professional medical advice.*
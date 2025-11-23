<div style="background:#241739; padding: 20px; border-radius: 12px; color: #fff; text-align:center; margin-bottom:30px;">
  <h1>BMBot — Your Personal Healthcare Companion</h1>
</div>

  <img src="ImgReadMe/bEyes.png" width="1000">
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

### **Main Classes and Their Roles**
- **Main.java** — Program entry point.
- **BMBot.java** — Abstract parent class that handles name storage, input, and care selection.
- **MentalCare.java** — Handles emotional check-ins and motivational content.
- **PhysicalCare.java** — Provides basic physical care suggestions depending on pain level and body part.

## **How to Run the Program**
1. Place all `.java` files in the same folder.
2. Open terminal (CMD or bash) in that folder.
3. Compile the program:
   ```bash
   javac *.java
## **Sample Output**

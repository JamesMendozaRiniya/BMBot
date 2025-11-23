public class PhysicalCare extends BMBot {

    public PhysicalCare(String userName) {
        super(userName);   // Passes the user's name to the BMBot parent class
    }

    @Override
    public void startCare() {
        System.out.println("\n[Physical Care Mode Activated]");
        System.out.println("================================");

        // Pain level ask
        System.out.println("On a scale of 1 to 10, how would you rate your pain?");
        int painLevel = readIntInRange(1, 10);

        // If pain is very low
        if (painLevel <= 3) {
            System.out.println("\nThat seems quite low, " + getuName() + ".");
            System.out.println("Please make sure you’re okay.");
            System.out.println("If the pain is severe or you’re in distress, contact my creator’s emergency number: 0912-345-6789.");
        }

        // Ask user part of body is uncomfortable
        System.out.println("\nWhich part of your body feels uncomfortable, " + getuName() + "?");
        System.out.println("1. Upper body");
        System.out.println("2. Middle body");
        System.out.println("3. Lower body");

        int bodyChoice = readIntInRange(1, 3);

        // Chosen Body Part -> run correct care method
        switch (bodyChoice) {
            case 1:
                handleUpperBody();
                break;
            case 2:
                handleMiddleBody();
                break;
            case 3:
                handleLowerBody();
                break;
        }

        // End of session pain check
        System.out.println("\n================================");
        System.out.println("On a scale of 1 to 10, how are you feeling now?");
        int newLevel = readIntInRange(1, 10);

        // Gives feedback depending on the new pain level
        if (newLevel <= 6) {
            System.out.println("\nThat’s quite low, " + getuName() + ".");
            System.out.println("It sounds like you’re still in pain.");
            System.out.println("Please rest, and if it doesn’t improve soon, contact 0912-345-6789 for further assistance.");
        } else {
            System.out.println("\nThat’s good progress! Keep taking care of yourself, "
                               + getuName() + " - your body appreciates the care you give it.");
        }

        System.out.println("================================");
    }

    // ---------------------- BODY PART HANDLERS ----------------------

    // Upper Body handler
    private void handleUpperBody() {
        System.out.println("\nIs it bleeding or just hurting?");
        String condition = scanner.nextLine().trim().toLowerCase();

        if (condition.contains("bleed")) {
            System.out.println("\nPlease apply gentle pressure to the wound and clean it with water if possible.");
            System.out.println("If the bleeding doesn’t stop or you feel dizzy, reach out immediately to 0912-345-6789.");
        } else {
            System.out.println("\nIf your upper body feels tense, try rolling your shoulders or doing gentle neck stretches.");
            System.out.println("Taking a break from screens can also help relax your muscles.");
        }
    }

    // Handles care instructions for middle body issues
    private void handleMiddleBody() {
        System.out.println("\nIs it bleeding or just hurting?");
        String condition = scanner.nextLine().trim().toLowerCase();

        if (condition.contains("bleed")) {
            System.out.println("\nAvoid pressing too hard on the area.");
            System.out.println("Seek medical help if the bleeding persists.");
        } else {
            System.out.println("\nFor middle body discomfort, take deep breaths or do light torso twists.");
            System.out.println("Standing up for a few minutes can help relieve tension.");
        }
    }

    // Handles care instructions for lower body issues
    private void handleLowerBody() {
        System.out.println("\nIs it bleeding or just hurting, " + getuName() + "?");
        String condition = scanner.nextLine().trim().toLowerCase();

        if (condition.contains("bleed")) {
            System.out.println("\nClean the wound, apply light pressure, and elevate your leg if possible.");
            System.out.println("If it continues bleeding, contact 0912-345-6789.");
        } else {
            System.out.println("\nA short walk or light leg stretches can help improve circulation and reduce discomfort.");
        }
    }

    // ---------------------- SAFE INTEGER READER ----------------------

    // Make sure users enters an integer within a valid range
    private int readIntInRange(int min, int max) {
        int value;

        while (true) {
            System.out.print("| ");
            String input = scanner.nextLine();

            try {
                value = Integer.parseInt(input);

                if (value >= min && value <= max) {
                    return value; // Valid input: return it
                }

                System.out.println("Please enter a number between " + min + " and " + max + ".");

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
            }
        }
    }
}
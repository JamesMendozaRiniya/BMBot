public class MentalCare extends BMBot {

    public MentalCare(String name) {
        super(name);
    }
    
    @Override
    public void startCare() {
        System.out.println("\n[Mental Care Mode Activated]");
        System.out.println("================================");
        System.out.println("On a scale of 1 to 10, how are you feeling today?");
        
        int moodRate;
        while (true) {
            System.out.print("| ");
            String input = scanner.nextLine();

            try {
                moodRate = Integer.parseInt(input);

                if (moodRate >= 1 && moodRate <= 10) {
                    break;  // valid: exit loop
                } else {
                    System.out.println("Please enter a number between 1 and 10.");
             }

    } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a number between 1 and 10.");
    }
}

        // Mood = low
        if (moodRate <= 3) {
            System.out.println("\n" + getuName() + ", it sounds like you're feeling really low right now. That's okay - you're not alone.");
            System.out.println("Please take a deep breath and remember to reach out to someone you trust.");
            System.out.println("If it ever feels too much, you can contact my creator's emergency number: 0912-345-6789");
            System.out.println("Your emotional well-being matters, always. \n");
            shareOption();
        }
        // Mood = average
        else if (moodRate <= 6) {
            System.out.println("\n" + "You seem a bit down, " + getuName() + ". Remember, every small step forward still counts as progress.");
            shareOption();
        }
        // Mood = high
        else { 
            System.out.println("\nThat's wonderful, " + getuName() + "! You're brimming with positivity. I'm proud of you for checking in on yourself. :))");
            shareOption();
        }
        
        // End care
        System.out.println("================================");
        System.out.println("\nAre you satisfied with your care? (yes/no)");
        String satisfied = scanner.nextLine().trim();

        if (satisfied.equalsIgnoreCase("yes")) {
            System.out.println("I'm glad to hear that. Your emotional well-being is important to me.");
            System.out.println("Remember, I'll always be here whenever you need someone to talk to. <3");
            System.out.println("\"I am satisfied with my care.\" - BMBot");
        } else {
            System.out.println("Thank you for your honesty. I'll strive to make your next session even better!");
        }
    }

    private void shareOption() {
        System.out.println("\nWould you like me to share something that might brighten your day even more?");
        System.out.println("1. A gentle motivational quote");
        System.out.println("2. A small self-care reminder");
        System.out.println("3. I think I'm good for now");
        System.out.print("| ");
        
        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        } catch (Exception e) {
            System.out.println("Invalid choice. Defaulting to no additional share.");
            return;
        }

        switch (choice) {
            case 1:
                System.out.println("\n\"No matter how hard it feels now, tomorrow is a new chance to begin again.\"");
                break;
            case 2:
                System.out.println("\n Drink some water and take a deep breath. Hydration improves physical and emotional health.");
                break;
            case 3:
                System.out.println("\nAlright, " + getuName() + ". Take it easy - you're doing great.");
                break;
            default:
                System.out.println("\nThat's okay, " + getuName() + ". I'll be here when you're ready. <3");
                break;
        }
    }
}

    

    
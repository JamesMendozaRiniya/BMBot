import java.util.Scanner;

public abstract class BMBot { //Abstract class
    private String uName; 
    protected static Scanner scanner = new Scanner(System.in);

    public BMBot(String userName) { //constructor
        this.uName = userName;
    }

    public String getuName() { // getter - encapsulation
        return uName;
    }
    public void setuName(String userName){ // setter - encapsulation
        this.uName = userName;
    }
    public abstract void startCare(); //Abstract method - can be mental or physical care

    public static void run() { // runs BMBot dialogues
        System.out.println("Hello, I am BMBot, your personal healthcare companion.");
        System.out.print("May I know your name?\n| ");
        String name = scanner.nextLine();

        System.out.println("\nHello " + name + "! Which type of care would you like to receive today?");
        System.out.println("1. Mental Care");
        System.out.println("2. Physical Care");
        System.out.print("| ");
        int choice = Integer.parseInt(scanner.nextLine());

        // chosen care mode
        BMBot bot;
        if (choice == 1) {
            bot = new MentalCare(name);
        } else if (choice == 2) {
            bot = new PhysicalCare(name);
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        bot.startCare(); // Polymorphism: calls the correct version of startCare()
    }
}
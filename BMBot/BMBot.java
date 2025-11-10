import java.util.Scanner;

public abstract class BMBot { //Abstract class
    private String uName; 
    protected Scanner scanner = new Scanner(System.in);

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
        Scanner input = new Scanner(System.in);

        System.out.println("Hello! I’m BMBot, your personal care companion.");
        System.out.print("Before we begin, may I know your name?\n| ");
        String name = input.nextLine();

        System.out.println("\nHi " + name + "! Which type of care would you like to receive today?");
        System.out.println("1. Mental Care");
        System.out.println("2. Physical Care");
        System.out.print("| ");
        int choice = Integer.parseInt(input.nextLine());

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
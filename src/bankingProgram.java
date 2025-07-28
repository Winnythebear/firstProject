import java.util.Scanner;

public class bankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // JAVA BANKING PROGRAM FOR BEGINNERS

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){

            // DISPLAY MENU

            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            System.out.print("Enter your Choice (1-4): ");
            choice = scanner.nextInt();

            // GET AND PROCESS USER CHOICE

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
        }
       }

        // EXIT MESSAGE

        System.out.println("****************");
        System.out.println("Thank you! Have a nice day!");

        scanner.close();

    }

    // showBalance()

    static void showBalance(double balance){
        System.out.printf("€%,.2f\n", balance);
    }

    // deposit ()

    static double deposit(){

        double amount;

        System.out.println("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can't be negative");
            return  0;
        }
        else {
            return amount;
        }
    }

    // withdraw()

    static double withdraw(double balance){

        double amount;

        System.out.println("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }


    }
}

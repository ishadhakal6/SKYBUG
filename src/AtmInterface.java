import java.util.Scanner;

public class AtmInterface {
    public static void main(String[] args) {
        UserBankAccount bankAccount = new UserBankAccount("Isha", 50000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("WELCOME TO XYZ Bank ATM!");
            System.out.println("How may I help you?");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check the balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" Enter the amount you want to withdraw:");
                    bankAccount.withdraw();
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit");
                    bankAccount.deposit();
                    break;
                case 3:
                    System.out.println("Your Balance is " + bankAccount.checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using XYZ Bank ATM!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


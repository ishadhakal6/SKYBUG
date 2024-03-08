import java.util.Scanner;

public class UserBankAccount {
    private String userName;
    private Integer accountBalance;

    public UserBankAccount(String userName, Integer accountBalance){
        this.userName=userName;
        this.accountBalance=accountBalance;
    }

    Scanner sc=new Scanner(System.in);
    public void withdraw(){
        int withdrawAmount=sc.nextInt();
         if (withdrawAmount <= 0 || withdrawAmount > accountBalance) {
            System.out.println("Invalid amount.");
            return;
        }
        accountBalance-=withdrawAmount;
    }
    public void deposit(){
        int depositAmount=sc.nextInt();
        if (depositAmount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        accountBalance+=depositAmount;
    }
    public int checkBalance(){
        return accountBalance;
    }

}

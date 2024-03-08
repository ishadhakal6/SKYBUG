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
            System.out.println("Transaction Failed! Invalid amount");
            return;
        }
        accountBalance-=withdrawAmount;
        System.out.println("Transaction Successful");
    }
    public void deposit(){
        int depositAmount=sc.nextInt();
        if (depositAmount <= 0) {
            System.out.println("Transaction Failed! Invalid amount");
            return;
        }
        accountBalance+=depositAmount;
        System.out.println("Successful transaction");
    }
    public int checkBalance(){
        return accountBalance;
    }

}

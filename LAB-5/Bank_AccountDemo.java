import java.util.Scanner;

class Bank_Account{
    int accountNo;
    String Username;
    String Email;
    String Account_type;
    
    void getAccountDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Account Number : ");
        accountNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Username : ");
        Username = sc.nextLine();
        System.out.println("Enter Your Email Id : ");
        Email = sc.nextLine();
        System.out.println("Enter Your Account type : Current or Saving ?");
        Account_type = sc.nextLine();
    }

    void displayAccountDetails(){
        System.out.println("============================");
        System.out.println("Your Account Number is : ");
        System.out.println(accountNo);
        System.out.println("Your Username is : ");
        System.out.println(Username);
        System.out.println("Your Email Id is : ");
        System.out.println(Email);
        System.out.println("Your Account type is :");
        System.out.println(Account_type);
    }
}


public class Bank_AccountDemo {
    public static void main(String[] args) {
        Bank_Account b1 = new Bank_Account();
        b1.getAccountDetails();
        b1.displayAccountDetails();
    }
}

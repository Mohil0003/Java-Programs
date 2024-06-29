import java.util.Scanner;
public class Palindrome_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num1=sc.nextInt();
        int a=num1;
        int rem,sum=0;
        while(num1!=0){
            rem=num1 % 10;
            sum=sum*10 + rem;
            num1=num1/10;
        }
        if(a==sum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}

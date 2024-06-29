import java.util.Scanner;
public class Prime_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=2; i<=num/2 ; i++){
            if(num % 2 == 0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
        sc.close();
    }
}

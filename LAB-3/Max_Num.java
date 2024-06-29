import java.util.Scanner;

public class Max_Num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a + "is Biggest Number");
        }else{
            if(b>a && b>c){
                System.out.println(b + " is biggest Number ");
            }else{
                System.out.println(c + " is Biggest Number ");
            }
        }
        sc.close();
    }
}

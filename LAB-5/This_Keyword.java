import java.util.Scanner;

public class This_Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Square :");
        int a=sc.nextInt();
        Square c = new Square(a);
    }
}
class Square{
   static int Length;
    Square(int Length){
        this.Length=Length;
        System.out.println("Area of Square is : "+Length*Length);
    }
}

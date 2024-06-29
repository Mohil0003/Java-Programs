import java.util.Scanner;

public class Second_Half_String {
    public static void main(String[] args) {
        System.out.println("Enter Your String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Str2 = str.substring(str.length()/2 , str.length());
        System.out.println(Str2);
        sc.close();
    }
}

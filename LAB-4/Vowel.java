import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();
        sc.close();
        int v=0,c=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("V = "+v);
        System.out.println("C = "+c);
    }
    
}
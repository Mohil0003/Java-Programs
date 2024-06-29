import java.util.Scanner;

public class Stream_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "Stream";
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s1.charAt(j));
            }
            System.out.println();
    }
    sc.close();
}
}
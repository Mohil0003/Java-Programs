import java.util.Scanner;

public class Vowel_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1="aeiouAEIOU";
        int v=0;
        System.out.println("Enter Your String:");
        String s2=sc.nextLine();
        for(int i=0;i<s2.length();i++){
            char ch1=s2.charAt(i);
            for(int j=0;j<s1.length();j++){
                char ch2=s1.charAt(j);
                if(ch1==ch2){
                    v++;
                }
            }
        }
        int c=s2.length()-v;
        System.out.println("vowels = "+ v);
        System.out.println("consonants = "+ c);

        sc.close();

    }
}

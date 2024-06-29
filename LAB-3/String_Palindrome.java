import java.util.Scanner;
public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int s=0 , e=str.length()-1;
        boolean flag=true;
        while(s<e){
            if(str.charAt(s) == str.charAt(e)){
                s++;
                e--;
            }else{
                flag=false;
                break;
            }
        }

        if(flag == true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}

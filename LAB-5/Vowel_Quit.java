import java.util.Scanner;

public class Vowel_Quit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter Your String :");
            String str=sc.nextLine().toLowerCase();
            if(str.equals("quit")){
                break;
            }else{
                Vowel s1 = new Vowel(str);
                s1.VowelCount();
            }
        }
    }
}

class Vowel{
    String str;
    int count_a;
    int count_e;
    int count_i;
    int count_o;
    int count_u;

    Vowel(String str){
        this.str=str;
    }
    void VowelCount(){
            for(int i=0;i < str.length();i++){
                if(str.charAt(i)=='a'){
                    count_a++;
                }
                else if(str.charAt(i)=='e') {
                    count_e++;
                }
                else if(str.charAt(i)=='i'){
                    count_i++;
                }
                else if(str.charAt(i)=='o'){
                    count_o++;
                }
                else if(str.charAt(i)=='u'){
                    count_u++;
                }
            }
            System.out.println("Numbers of Vowel Type in " +str+ " are :");
            System.out.println("a is : " + count_a);
            System.out.println("e is : " + count_e);
            System.out.println("i is : " + count_i);
            System.out.println("o is : " + count_o);
            System.out.println("u is : " + count_u);
            int totalVowel = count_a + count_e + count_i + count_o + count_u;
            System.out.println("Total Vowels in " +str+ " are " +totalVowel);
    
    }
}

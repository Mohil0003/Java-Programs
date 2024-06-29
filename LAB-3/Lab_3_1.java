import java.util.Scanner;
public class Lab_3_1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Total Marks :");
        int total= sc.nextInt();

        System.out.println("Enter First Subject Marks :");
        int a =sc.nextInt();
        while(a>total || a<0){
            System.out.println("Enter Valid  Number : ");
        }

        System.out.println("Enter Second Subject Marks :");
        int b =sc.nextInt();
        while(b>total || b<0){
            System.out.println("Enter Valid  Number : ");
        }

        System.out.println("Enter Third Subject Marks :");
        int c =sc.nextInt();
        while(c>total || c<0){
            System.out.println("Enter Valid  Number : ");
        }

        System.out.println("Enter Four Subject Marks :");
        int d =sc.nextInt();
        while(d>total || d<0){
            System.out.println("Enter Valid  Number : ");
        }

        System.out.println("Enter Five Subject Marks :");
        int e =sc.nextInt();
        while(e>total || e<0){
            System.out.println("Enter Valid  Number : ");
        }

        double result = (double)(a+b+c+d+e)/(double)total*100/5;

        System.out.println("Your Result is : ");

        if(result>59 ){
            System.out.println("First Division");
        }
        if(result>49 && result<=59){
            System.out.println("Second Division");
        }
        if(result>39 && result<=49){
            System.out.println("Third Division");
        }
        if(result<=39){
            System.out.println(" F A I L ");
        }

        sc.close();
    }   
}


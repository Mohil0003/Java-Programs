import java.util.Scanner;

public class Array_Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[4];
        for(int i=0 ; i<4 ; i++){
            System.out.println("Enter Integer:");
            arr[i]= sc.nextInt();
        }
        for(int i=0 ; i<4 ; i++){
            System.out.println("Output arr["+i+"] :"+arr[i]);
        }
        sc.close();
    }
}

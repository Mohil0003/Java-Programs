import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length :");
        int n = sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter Integer:");
            arr[i]= sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println( "arr["+i+"] :" + arr[i]);
        }
        sc.close();
    
    }
}

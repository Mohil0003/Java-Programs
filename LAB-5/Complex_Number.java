import java.util.Scanner;
class Complex{
    int rr;
    int ii;
    Complex(){
        
    }
    Complex(int rr , int ii){
        this.rr=rr;
        this.ii=ii;
    }
    void SumOfComplex(){

    }

}

public class Complex_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Real and Imaginery part of Complex Number : ");
        int rr1 = sc.nextInt();
        int ii1 = sc.nextInt();
        Complex c1 = new Complex (rr1 , ii1);
        System.out.println("Enter Real and Imaginery part of Complex Number : ");
        int rr2 = sc.nextInt();
        int ii2 = sc.nextInt();
        Complex c2 = new Complex(rr2, ii2);
        Complex c3 = new Complex();
    }
}

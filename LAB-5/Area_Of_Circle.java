import java.util.Scanner;

class Circle{
    double radius;

    double Circlearea(int radius){
        return Math.PI*radius*radius;
    }
}

public class Area_Of_Circle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius:");
    int r=sc.nextInt();
    sc.close();
    Circle c = new Circle();
    System.out.println( "Area =" + c.Circlearea(r));
    }
}

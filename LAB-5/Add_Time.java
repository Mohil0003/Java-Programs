import java.util.Scanner;

public class Add_Time {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Hours of Time 1 :");
    int hour1 = sc.nextInt();
    System.out.println("Enter Minitues of Time 1 :");
    int min1 = sc.nextInt();
    System.out.println("Enter Hours of Time 2 :");
    int hour2 = sc.nextInt();
    System.out.println("Enter Minitues of Time 2 :");
    int min2 = sc.nextInt();
    Time t1 = new Time(hour1 , min1);
    Time t2 = new Time(hour2 , min2);
    t2.SumOfTime(t1, t2);
    }
}

class Time{
    int hour;
    int min;
    Time(){

    }
    Time(int hour , int min){
        this.hour=hour;
        this.min=min;
    }
    int sumhour;
    int summin;

    void SumOfTime(Time a , Time b){
        sumhour=a.hour + b.hour;
        summin=a.min+b.min;
        while (summin>=60) {
            sumhour++;
            summin-=60;    
        }
        System.out.println("Hour = " + sumhour);
        System.out.println("Min = " + summin);
    }
}

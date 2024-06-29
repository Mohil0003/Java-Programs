class Count{
    static int count = 0;
    Count(){
        count++;
    }
}

public class Count_Static {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();

        System.out.println(Count.count);
    }
}

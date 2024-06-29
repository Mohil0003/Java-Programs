
 interface A {
    final int a=10;
    void display_A();
    
}
interface A1 extends A {
    final int b=11;
    void display_A1();

}

 interface A2 extends A {
    final int c=12;
    void display_A2();
}

interface A12 extends A1,A2{
    final int d=13;
    void display_A12();
    
}
class B implements A12{
    public void display_A(){
        System.out.println(a);
    }
    public void display_A1(){
        s
    }
    public void display_A2(){

    }
     public void display_A12(){

     }
}



public class A1_A2 {

    public static void main(String[] args) {
        B b1 = new B();
        b1.display_A();
        b1.display_A1();
        b1.display_A12();
        b1.display_A2();
    }
}

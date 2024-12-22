package Interface;


public class Demo1 implements Demo { 
    public void m1() {
        System.out.println("This is implementation for m1()");
    }

    public void m2() {
        System.out.println("This is implementation for m2()");
    }

    public void m3() {
        System.out.println("This is implementation for m3()");
    }

    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}

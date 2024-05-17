interface A {
    int constant_a = 10;
    void methodA();
}

interface A1 extends A {
    int constant_a1 = 20;
    void methodA();
}

interface A2 extends A {
    int constant_a2 = 30;
    void methodA();
}

interface A12 extends A1, A2 {
    int constant_a12=40;
}

class B implements A12 {
    public void methodA() {
        System.out.println("Method A invoked"+" "+constant_a);
    }
    public void methodA1() {
        System.out.println("Method A2 invoked"+" "+constant_a1);
    }
    public void methodA2() {
        System.out.println("Method A2 invoked"+" "+constant_a2);
    }

    public void methodA12() {
        System.out.println("Method A12 invoked"+" "+ constant_a12);
    }
}

public class lab_2 {
    public static void main(String[] args) {
        B b = new B();
        
        
        b.methodA();
        b.methodA2();
        b.methodA12();
    }
}

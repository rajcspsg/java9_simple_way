package pack2;

import pack1.*;

public class B {

    public void m2() {
        System.out.println("Class B: Method m2()");
        A a = new A();
        a.m1();
    }

}

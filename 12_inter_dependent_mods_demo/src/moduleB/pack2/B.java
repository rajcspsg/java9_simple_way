package pack2;

import pack1.*;

public class B {

    public static void main(String []args) {
        System.out.println("Accessing public members of pack1\n");
        A a = new A();
        a.m1();
    }
}
